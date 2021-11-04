package summery_stats;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestSummeryStats {

    public static void main(String[] args) {
        var l = new ArrayList<User>();
        l.add(new User(1, "Her", 10.0, List.of(UserRole.USER)));
        l.add(new User(2, "Her", 20.5, Collections.emptyList()));
        l.add(new User(3, "Nik", 30.0, List.of(UserRole.USER, UserRole.ADMIN)));
        l.add(new User(4, "Olga", 45.0, List.of(UserRole.ADMIN)));


        System.out.println(l.stream().flatMap(u -> u.getRoles().stream())
                .collect(Collectors.toSet()));

        System.out.println(l.stream()
                .collect(Collectors.groupingBy(
                                User::getName,
                                Collectors.collectingAndThen(Collectors.summarizingDouble(u -> u.getMoney()), a -> a.getAverage())
                        )
                ));

        var s = IntStream.empty().summaryStatistics();
        System.out.println(s.getMax());
    }

}
