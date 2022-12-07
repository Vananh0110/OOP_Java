import java.util.Scanner;

public class Bai_6_4 {
    public static void main(String[] args) {
        String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
                "Nov", "Dec", "Jan.", "Feb.", "Mar.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        String month_31_day[] = { "January", "March", "May", "July", "August", "October", "December", "Jan", "Mar",
                "May", "Jul", "Aug", "Oct", "Dec", "Jan.", "Mar.", "May.", "Jul.", "Aug.", "Oct.", "Dec.", "1", "3",
                "5", "7", "8", "10", "12" };
        String month_28_29_day[] = { "February", "Feb", "Feb.", "2" };
        String iMonth;
        int iYear;
        boolean isInvalid = true;
        int index;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Input month: ");
            iMonth = input.next();
            System.out.print("Input year: ");
            iYear = input.nextInt();
            for (int i = 0; i < month.length; i++) {
                if (iMonth.equals(month[i]) && iYear >= 0) {
                    isInvalid = false;
                    index = i;
                    break;
                }
            }
            if (isInvalid) {
                System.out.println("Invalid!");
            }
        } while (isInvalid);
        for (int i = 0; i < month_28_29_day.length; i++) {
            if (iMonth.equals(month_28_29_day[i])) {
                if (iYear % 4 == 0) {
                    if (iYear % 100 == 0) {
                        if (iYear % 400 == 0) {
                            System.out.println(iMonth + "/" + iYear + " have 29 days!");
                        } else {
                            System.out.println(iMonth + "/" + iYear + " have 28 days!");
                        }
                    }
                }
                System.exit(0);
            }
        }
        for (int i = 0; i < month_31_day.length; i++) {
            if (iMonth.equals(month_31_day[i])) {
                System.out.println(iMonth + "/" + iYear + " have 31 days!");
                System.exit(0);
            }
        }
        System.out.println(iMonth + "/" + iYear + " have 30 days!");
    }
}