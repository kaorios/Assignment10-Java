import java.util.function.*;


public class BinaryOperatorExample  {

    public static void main(String[] args) {

        /*
        Interface BinaryOperator<T>
        Using BiOperator, write a method which takes two number of Integer and add.
         */
        BinaryOperator<Integer> bo = (n1, n2) -> n1 + n2;
        System.out.println(bo.apply(3, 10));

        /*
        Interface DoubleBinaryOperator
        Using DoubleBinaryOperator, write a method which takes two number and add.
         */
        DoubleBinaryOperator dbo = (x, y) -> x + y;
        System.out.println(dbo.applyAsDouble(0.23, 0.45));

        /*
        Interface IntBinaryOperator
        Using IntBinaryOperator, write a method which takes two number and add.
         */
        IntBinaryOperator ibo = (x, y) -> x + y;
        System.out.println(ibo.applyAsInt(3, 10));

        /*
        Interface LongBinaryOperator
        Using LongBinaryOperator, write a method which takes two number and add.
         */
        LongBinaryOperator lbo = (x, y) -> x + y;
        System.out.println(lbo.applyAsLong(3, 10));
    }
}
