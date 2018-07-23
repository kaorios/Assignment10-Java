import java.util.function.Supplier;

@FunctionalInterface
public interface DateUnaryOperator {
    String format(String year, String month, String day);
}
