import java.util.Arrays;
//Begin by creating a new class named WeekdaysPrinter.
public class WeekdaysPrinter {
    //Inside the WeekdaysPrinter class, write the main method.
    public static void main(String[] args) {

        //In the main method, declare an array to hold the names of the days of the week
        String[] days = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //Implement a for loop that iterates through your array of days.
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        //Print Only Weekdays
        for (int i = 0; i < days.length; i++) {
            if (i >= 5) break;
            System.out.println(days[i]);
        }
    }
}