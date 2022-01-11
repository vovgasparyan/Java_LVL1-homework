package howeworks.homework2;

public class Exercise7 {

    public static void main(String[] args) {
        numberOfDaysInMonth(2002, 1);
    }

    public static void numberOfDaysInMonth(int year, int monthNumber) {
        String monthName = "";
        switch (monthNumber) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> System.out.println("Enter month number from 1 to 12");
        }

        byte dayNumber;
        if (monthNumber != 1 && monthNumber != 3 && monthNumber != 5 && monthNumber != 7 && monthNumber != 8 && monthNumber != 10 && monthNumber != 12) {
            if (monthNumber == 2) {
                if (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) {
                    dayNumber = 28;
                } else {
                    dayNumber = 29;
                }
                System.out.println(monthName + " " + year + " has a " + dayNumber + " days");
            } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
                dayNumber = 30;
                System.out.println(monthName + year + " has a " + dayNumber + " days");
            }
        } else {
            dayNumber = 31;
            System.out.println(monthName + " " + year + " has a " + dayNumber + " days");
        }
    }
}
