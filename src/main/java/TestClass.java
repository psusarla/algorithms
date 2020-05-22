import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestClass {

    public static void main(String args[]) {
      findMonths();
    }

    public static long findMonths() {
        long monthsBetween = ChronoUnit.MONTHS.between(
                LocalDate.parse("2016-08-31").withDayOfMonth(1),
                LocalDate.parse("2016-11-30").withDayOfMonth(1));
        System.out.println(monthsBetween); //3
        return monthsBetween;
    }

}
