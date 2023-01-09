import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date today = new Date();
        System.out.println("Print Date as it is : "+today);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Print Date with calender as it is : "+ calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");

        System.out.println("Today's date is : " + sdf.format(today)); // here we are formating the given date in above format...
        // BOTH THE LINE WRITTEN BELOW AND ABOVE ARE SAME
        System.out.println("Today's date is with using calender : "+sdf.format(calendar.getTime()));


        System.out.println("Date After 2 days : "+ addOrSubtractDaysFromToday(2));
        System.out.println("Date After 2 months : "+ addOrSubtractMonthsFromToday(2));
        System.out.println("Date After 2 years : "+ addOrSubtractYearsFromToday(2));

    }

    public static String addOrSubtractDaysFromToday(int numberOfDays) {
        SimpleDateFormat sdf = new SimpleDateFormat("d/MMMM/yyyy");

        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DATE,numberOfDays); // this will add or subtract the days from today's date...

        String requiredDate = sdf.format(cal.getTime());

        return requiredDate;
    }

    public static String addOrSubtractMonthsFromToday(int numberOfMonths) {
        SimpleDateFormat sdf = new SimpleDateFormat("d/MMMM/yyyy");

        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.MONTH,numberOfMonths); // this will add or subtract the months from today's date...

        String requiredDate = sdf.format(cal.getTime());

        return requiredDate;
    }

    public static String addOrSubtractYearsFromToday(int numberOfYears) {
        SimpleDateFormat sdf = new SimpleDateFormat("d/MMMM/yyyy");

        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.YEAR,numberOfYears); // this will add or subtract the years from today's date...

        String requiredDate = sdf.format(cal.getTime());

        return requiredDate;
    }
}