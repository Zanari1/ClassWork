package ClassWork;

import java.util.Scanner;

public class EvenNumb {
    public static void eventNumb(String number1) {
        System.out.println(isEven(number1));
    }

    public static boolean isEven(String args) {
        String  regex = "\\d+";
        int o = 0;
        if ((args.matches(regex))) {
            o = Integer.parseInt(args);
        } else {
            System.out.println("Введите целое число");
            System.exit(0);
        }
        return o % 2 == 0;
    }







    public static String takeStringFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}