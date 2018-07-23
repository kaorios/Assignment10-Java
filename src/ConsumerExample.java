import java.util.function.*;


public class ConsumerExample {

    public static void main(String[] args) {
        /*
        Interface Consumer<T>
        Using Consumer, write a method which takes one String and return the String changed upper case and print it.
         */
        Consumer<String> c = (x) -> System.out.println(x.toUpperCase());
        c.accept("abcde.com");

        /*
        Interface BiConsumer<T,U>
        Using BiConsumer, write a method which takes two String and append the second String to the first one and print it.
         */
        BiConsumer<String, String> bc = (str1, str2) -> System.out.println(str1 + str2);
        bc.accept("John", "Green");

        /*
        Interface DoubleConsumer
        Using DoubleConsumer, write a method which takes one Number and multiple it by 2 and print it.
         */
        DoubleConsumer dc = (x) -> System.out.println(x*2);
        dc.accept(0.23);

        /*
        Interface IntConsumer
        Using IntConsumer, write a method which takes one Number and multiple it by 2 and print it.
         */
        IntConsumer ic = (x) -> System.out.println(x*2);
        ic.accept(5);

        /*
        Interface LongConsumer
        Using LongConsumer, write a method which takes one Number and multiple it by 2 and print it.
         */
        LongConsumer lc = (x) -> System.out.println(x*2);
        lc.accept(5);

        /*
        Interface ObjDoubleConsumer<T>
        Using ObjDoubleConsumer, write a method which takes one String and one Number, and print these.
         */
        ObjDoubleConsumer<String> odc = (x, y) -> System.out.println(x + y);
        odc.accept("Double", 0.23);

        /*
        Interface ObjIntConsumer<T>
        Using ObjIntConsumer, write a method which takes one String and one Number, and print these.
         */
        ObjIntConsumer<String> oic = (x, y) -> System.out.println(x + y);
        oic.accept("Int", 4);

        /*
        Interface ObjLongConsumer<T>
        Using ObjLongConsumer, write a method which takes one String and one Number, and print these.
         */
        ObjLongConsumer<String> olc = (x, y) -> System.out.println(x + y);
        oic.accept("Int", 4);
    }


}
