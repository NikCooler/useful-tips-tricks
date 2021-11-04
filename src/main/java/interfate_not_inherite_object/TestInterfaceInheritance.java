package interfate_not_inherite_object;

import java.util.function.Function;

public class TestInterfaceInheritance {

    public static void main(String[] args) {
        Function<String, String> f = null;
        Object o = null;
        Integer i = null;
        System.out.println(f instanceof Object);
        System.out.println(i instanceof Object);
    }

}
