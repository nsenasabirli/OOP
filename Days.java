import java.util.Scanner;
public class Days {
    enum WeekDays {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Day = ");
        String inputdayString = input.nextLine();
        switch (WeekDays.valueOf(inputdayString)) {
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Weekday");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
        }
    }
}

