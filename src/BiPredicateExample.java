import java.util.function.*;


public class BiPredicateExample {

    public static void main(String[] args) {

        /*
        Interface BiPredicate<T,U>
        Using BiPredicate, write a method which takes two number of Integer, x and y, and return the result of true if x > y.
         */
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
        System.out.println(bi.test(2, 3));

        /*
        Interface DoublePredicate
        Using DoublePredicate, write a method which takes one number and return the result of true if x > 0.
         */
        DoublePredicate dp = (d) -> d > 0;
        System.out.println(dp.test(-2.3));

        /*
        Interface IntPredicate
        Using IntPredicate, write a method which takes one number and return the result of true if x > 0.
         */
        IntPredicate ip = (i) -> i > 0;
        System.out.println(ip.test(-2));

        /*
        Interface LongPredicate
        Using LongPredicate, write a method which takes one number and return the result of true if x > 0.
         */
        LongPredicate lp = (i) -> i > 0;
        System.out.println(lp.test(-2));

        /*
        Interface Predicate<T>
        Using Predicate, write a method which takes one String and return the result of true if length of String is over 5.
         */
        Predicate<String> p  = (s)-> s.length() > 5;
        System.out.println(p.test("abcde.com "));
    }
}
