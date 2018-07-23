public class DateUnaryOperatorExample {

    public static void main(String[] args) {
        DateUnaryOperator date = (year, month, day) -> {
            return year + "年" + month + "月" + day + "日";
        };
        System.out.println(date.format("2018", "12", "24"));
    }
}
