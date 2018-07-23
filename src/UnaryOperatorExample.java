import java.util.function.*;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        /*
        Interface UnaryOperator<T>
        Using UnaryOperator, write a method which takes one String and return the String changed upper case.
         */
        UnaryOperator<String> uo = (x)-> x.toUpperCase();
        System.out.println(uo.apply("abcde.com"));

        /*
        Interface DoubleUnaryOperator
        Using DoubleUnaryOperator, write a method which takes two number and return the power of it.
         */
        DoubleUnaryOperator duo = (x) -> x*x;
        System.out.println(duo.applyAsDouble(3.14));

        /*
        Interface IntUnaryOperator
        Using IntUnaryOperator, write a method which takes two number and return the power of it.
         */
        IntUnaryOperator iuo = (x) -> x*x;
        System.out.println(iuo.applyAsInt(3));

        /*
        Interface LongUnaryOperator
        Using LongUnaryOperator, write a method which takes two number and return the power of it.
         */
        LongUnaryOperator luo = (x) -> x*x;
        System.out.println(luo.applyAsLong(3));
    }
}
