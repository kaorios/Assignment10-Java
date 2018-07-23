import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;

public class FunctionExample {

    public static void main(String[] args) {

        /*
        Interface BiFunction<T,U,R>
        Using BiFunction, write a method which takes two array lists of integer and append the second array list to the first one and return a new arraylist.
         */
        BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> bi =
                (list1, list2) -> {
                    ArrayList<Integer> list3 = new ArrayList<>();
                    for(Integer i : list1) {
                        list3.add(i);
                    }
                    for(Integer i : list2) {
                        list3.add(i);
                    }
                    return list3;
        };
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(7,8,9,10,11,12));
        System.out.println(bi.apply(l1, l2).size());

        /*
        Interface DoubleFunction<R>
        Using DoubleFunction, write a method which takes one Number and return it as a String.
         */
        DoubleFunction<String> df = (d) -> d +" is a string";
        System.out.println(df.apply(3.14));

        /*
        Interface DoubleToIntFunction
        Using DoubleToIntFunction, write a method which takes one Number and return it added 2.
         */
        DoubleToIntFunction dif = (x) -> (int)x+2;
        System.out.println(dif.applyAsInt(3.14));

        /*
        Interface DoubleToLongFunction
        Using DoubleToLongFunction, write a method which takes one Number and return it added 2.
         */
        DoubleToLongFunction dlf = (x) -> (long)x+2;
        System.out.println(dif.applyAsInt(3.14));

        /*
        Interface Function<T,R>
        Using Function, write a method which takes one Number and return it as a String.
         */
        Function<Double,String> f = (d) -> d +" is a string";
        System.out.println(f.apply(3.14));

        /*
        Interface IntFunction<R>
        Using IntFunction, write a method which takes one Number and return it as a String.
         */
        IntFunction<String> i = (n) -> n +" is a string";
        System.out.println(i.apply(5));

        /*
        Interface IntToDoubleFunction
        Using IntToDoubleFunction, write a method which takes one Number and return sin of it.
         */
        IntToDoubleFunction idf = (x) -> Math.sin(x);
        System.out.println(idf.applyAsDouble(5));

        /*
        Interface IntToLongFunction
        Using IntToLongFunction, write a method which takes one Number and return the result subtracted from long.MAX_VALUE.
         */
        IntToLongFunction ilf = (x) -> Long.MAX_VALUE-x;
        System.out.println(ilf.applyAsLong(5));

        /*
        Interface LongFunction<R>
        Using LongFunction, write a method which takes one Number and return the result subtracted from long.MAX_VALUE.
         */
        LongFunction<String> lf = (l) -> l +" is a string";
        System.out.println(lf.apply(Long.MAX_VALUE));

        /*
        Interface LongToDoubleFunction
        Using LongToDoubleFunction, write a method which takes one Number and return sin of it.
         */
        LongToDoubleFunction ldf = (l) -> Math.sin(l);
        System.out.println(ldf.applyAsDouble(Long.MAX_VALUE));

        /*
        Interface LongToIntFunction
        Using LongToIntFunction, write a method which takes one Number and return it as Integer.
         */
        LongToIntFunction lif = (l) -> (int)l;
        System.out.println(lif.applyAsInt(5));

        /*
        Interface ToDoubleBiFunction<T,U>
        Using ToDoubleBiFunction, write a method which takes two Number and return the result added sin of these.
         */
        ToDoubleBiFunction<Integer, Integer> tdbf = (x,y)-> Math.sin(x)+Math.sin(y);
        System.out.println(tdbf.applyAsDouble(5, 3));

        /*
        Interface ToDoubleFunction<T>
        Using ToDoubleFunction, write a method which takes one Number and return sin of it.
         */
        ToDoubleFunction<Integer> tdf = (x)-> Math.sin(x);
        System.out.println(tdf.applyAsDouble(5));

        /*
        Interface ToIntBiFunction<T,U>
        Using ToIntBiFunction, write a method which takes two Number and return the sum as a Integer.
         */
        ToIntBiFunction<Double, Double> tibf = (x,y)-> (int)(x+y);
        System.out.println(tibf.applyAsInt(5.3, 3.14));

        /*
        Interface ToIntFunction<T>
        Using ToIntFunction, write a method which takes two Number and return it times 2 as a Integer.
         */
        ToIntFunction<Double> tif = (x)-> (int)(x * 2);
        System.out.println(tif.applyAsInt(5.3));

        /*
        Interface ToLongBiFunction<T,U>
        Using ToLongBiFunction, write a method which takes two Number and return the sum as a Long.
         */
        ToLongBiFunction<Double, Double> tlbf = (x,y)-> (long)(x+y);
        System.out.println(tibf.applyAsInt(5.3, 3.14));

        /*
        Interface ToLongFunction<T>
        Using ToLongFunction, write a method which takes two Number and return it times 2 as a Long.
         */
        ToLongFunction<Double> tlf = (x)-> (long)(x * 2);
        System.out.println(tif.applyAsInt(5.3));
    }
}
