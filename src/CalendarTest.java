import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

//        Set to start of month
//        定于本月初
        date = date.minusDays(today - 1);
//        System.out.println(date);
        DayOfWeek weekday = date.getDayOfWeek();
//        System.out.println(weekday);
//        1=Monday,...7=Sunday
        int value = weekday.getValue();
//        System.out.println(value);
        System.out.println("Mon    Tue    Wed    Thu    Fri    Sat    Sun ");
        for (int i = 1; i < value; i++)
        {
            System.out.print("      ");
        }
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getDayOfMonth());

        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
            {
                System.out.print("*   ");
            } else
            {
                System.out.print("    ");
            }
            date = date.plusDays(1);
//            System.out.println(date);
            if (date.getDayOfWeek().getValue() == 1)
            {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1)
        {
            System.out.println();
        }
    }
}
