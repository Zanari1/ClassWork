package ClassWork;

import java.util.Scanner;

public class Login {
    public    void main(String[] args) {
        int pass = takeIntFromScanner();
        String login = takeStringFromScanner();
        LoginInSystemPass(pass, login);

        String exersise = takeStringFromScanner2();
        makeChoose(exersise);

    }

    public  void LoginInSystemPass(int pass, String login) {
        if (pass != 123) {
            System.out.println(" Пароль не верный");
            System.exit(0);
        }else if (!("Oleg".equals(login))) {
            System.out.println(" Логин не верный");
            System.exit(0);
        }


    }
    public  void makeChoose(String s1){
        Reverse reverseString = new Reverse();
        Replace replaceSomeString = new Replace();
        Fibonacci fibonacci50 = new Fibonacci();
        Armstrong isArmstrong  = new Armstrong();
        EvenNumb isEven = new EvenNumb();

        if (s1.equals("1")) {
            String s2 = takeStringFromScanner3();
            isEven.eventNumb(s2);
        } else if (s1.equals("2")) {
            int i1 = takeIntFromScanner1();
           isArmstrong.armstrong(i1);
        } else  if (s1.equals("3")) {
            String s2 = takeStringFromScanner3();
            reverseString.reverse(s2);
        }  else if (s1.equals("4")) {
            int i1 = takeIntFromScanner1();
            fibonacci50.Fibonacci(i1);
        } else if (s1.equals("5")) {
            String s2 = takeStringFromScanner3();
            replaceSomeString.replaceString(s2);
        } else {
            System.out.println("Такого действия нету");
        }
    }



    public  int takeIntFromScanner() {
        System.out.println("Введите пароль");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public  String takeStringFromScanner() {
        System.out.println("Введите логин");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public  String takeStringFromScanner2() {
            System.out.println("Выберете номер задания:\n" +
                    "1. Even Number\n" +
                    "2. Armstrong\n" +
                    "3. Reverse\n" +
                    "4. Fibonacci\n" +
                    "5. Replace\n");
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }
    public   String takeStringFromScanner3() {
        System.out.println("Введите вашу стрингу ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public  int takeIntFromScanner1(){
        System.out.println("Введите ваш число");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}

