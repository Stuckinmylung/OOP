package BaiTap_Buoi1;

public class PrintDayInWord {
    public static void main(String[] args) {
        int dayNumber=0;
        if (dayNumber == 0) {
            System.out.println("MONDAY");
        } else if (dayNumber == 1) {
            System.out.println("TUESDAY");
        } else if (dayNumber == 2) {
            System.out.println("WEDNESDAY");
        } else if (dayNumber == 3) {
            System.out.println("THURSDAY");
        }else if (dayNumber == 4) {
            System.out.println("FRIDAY");
        }else if (dayNumber == 5) {
            System.out.println("SATURDAY");
        }else if (dayNumber == 6) {
            System.out.println("SUNDAY");
        }
        else {
            System.out.println("other");
        }
        switch (dayNumber) {
            case 0:
                System.out.println("MONDAY");
                break;
            case 1:
                System.out.println("TUESDAY");
                break;
            case 2:
                System.out.println("WEDNESDAY");
                break;
            case 3:
                System.out.println("FRIDAY");
                break;
            case 4:
                System.out.println("SATURDAY");
                break;
            case 5:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("other");
        }
    }
}
