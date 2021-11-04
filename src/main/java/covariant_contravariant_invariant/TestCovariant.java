package covariant_contravariant_invariant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Arrays are COVARIANT
 * Generics T is INVARIANT
 * Generics ? extends A is COVARIANT
 * Generics ? super A is CONTRAVARIANT
 */
public class TestCovariant {

    public static void main(String[] args) {
        Object o = new Integer(1);
        Object[] arr = new Integer[] {1};
        Object[] arr2 = new String[] {"", "2a", "3"};

        System.out.println(o);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        List<Integer> list1 = List.of(1,2,3);
//        List<Object> l = list1;

        List<A> a = new ArrayList<>();
        a.add(new A());
        List<B> b = new ArrayList<>();
        b.add(new B());

//        a = b; INVARIANT

        List<? extends A> a2 = b;
//        a2.add(new A()); not possible
//        a2.add(new B()); not possible
        a2.add(null);

        List a3 = b;
        a3.add(new A());
        System.out.println(a3);

        List<? super A> a5 = a;
        a5.add(new B());
        a5.add(new A());
        E[] e = new A[]{};
    }

    private static class E {

    }

    private static class A extends E {

    }

    private static class B extends A {

    }
}
