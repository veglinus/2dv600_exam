import java.util.Scanner;

/**
 *  Solution for 1
 */

public class Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer inputDay = -1;
        Integer futureDay = -1;

        while (inputDay > 6 || inputDay < 0) {
            System.out.println("Enter the current day(0-6):");
            Integer input1 = scanner.nextInt();

            if (input1 > 6 || input1 < 0) {
                System.out.println("Error. Enter a valid number 0-6.");
            } else {
                inputDay = input1;
            }


            while (futureDay > 6 || futureDay < 0) {
                System.out.println("Enter the number of days after today: ");
                Integer input2 = scanner.nextInt();

                if (input2 > 6 || input2 < 0) {
                    System.out.println("Error. Enter a valid number 0-6.");
                } else {
                    futureDay = input2;
                }
                
            }
        }

        String dayString = "";
        String futureDayString = "";

        // Quick but dirty switch statements for day corresponding to integer value
        switch (inputDay) {
            case 0:
                dayString = "Sunday";
                break;
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3: 
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "";
                break;
        }

        futureDay = inputDay + futureDay;

        if (futureDay >= 7 ) {
            futureDay = futureDay - 7;
        }

        switch (futureDay) {
            case 0:
                futureDayString = "Sunday";
                break;
            case 1:
                futureDayString = "Monday";
                break;
            case 2:
                futureDayString = "Tuesday";
                break;
            case 3: 
                futureDayString = "Wednesday";
                break;
            case 4:
                futureDayString = "Thursday";
                break;
            case 5:
                futureDayString = "Friday";
                break;
            case 6:
                futureDayString = "Saturday";
                break;
            default:
                futureDayString = "";
                break;
        }


        System.out.println("Today is " + dayString + " and the future day is " + futureDayString);
    }

}