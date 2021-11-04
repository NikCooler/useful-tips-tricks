package concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestStreams {

    public static void main(String[] args) {
        List<User> users = List.of(new User(1, "Her"), new User(2, "Her"), new User(3, "Nik"));

        Map<Integer, User> m = users.stream()
                .filter(u -> u.getId() > 1)
                .collect(Collectors.toMap(User::getId, u -> u, (a, b) -> a, HashMap::new));

        System.out.println(m);

        var res = users.stream()
                .sorted(Comparator.comparing(User::getId, (a, b) -> b -a))
                .collect(Collectors.groupingBy(User::getName, Collectors.collectingAndThen(Collectors.counting(), a -> a)));
        System.out.println(res);


        try {
            InputStream is = Files.newInputStream(Path.of("abc/dd"));
            int b;
            while ((b = is.read()) != 0) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class User {

        private Integer id;
        private String name;

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    private static void method() {
        System.out.println(
                IntStream.rangeClosed(0, 10)
                        .parallel()
                        .mapToObj(i -> i + "a")
                        .unordered()
//                        .forEach(s -> System.out.println(s));
                        .collect(Collectors.joining()));

        List<Integer> l = List.of(1,2,3,4,5);

        System.out.println(l.stream().parallel().unordered()
                .reduce("1", (a, b) -> a + b, (a, b) -> a + b));
    }
}
