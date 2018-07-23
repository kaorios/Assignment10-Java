import java.util.function.*;

public class SupplierExample {

    public static void main(String[] args) {

        /*
        Interface BooleanSupplier
        Using BooleanSupplier, write a method which return always true.
         */
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());

        /*
        Interface DoubleSupplier
        Using DoubleSupplier, write a method which return pi.
         */
        DoubleSupplier pi = () -> 3.14d;
        System.out.println(pi.getAsDouble());

        /*
        Interface IntSupplier
        Using IntSupplier, write a method which return MAX_VALUE of Integer.
         */
        IntSupplier maxInteger = () -> Integer.MAX_VALUE;
        System.out.println(maxInteger.getAsInt());

        /*
        Interface LongSupplier
        Using LongSupplier, write a method which return MAX_VALUE of Long.
         */
        LongSupplier maxLong = () -> Long.MAX_VALUE;
        System.out.println(maxLong.getAsLong());

        /*
        Interface Supplier<T>
        Using Supplier, write a method which return URL.
         */
        Supplier<String> url  = ()-> "abcde.com";
        System.out.println(url.get());

    }

}
