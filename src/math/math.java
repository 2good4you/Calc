package math;


import java.util.Scanner;

public class math {

    public static double value(Flag flag) {
        double value = 0;

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()) {
            value = sc.nextDouble();
            flag.flag = 1;
        } else {
            System.out.println("Вы ввели не целое число");
        }

        return value;
    }

    public static void operation(Flag flag, double firstValue, double secondValue){
        char operation = ' ';

        Scanner sc = new Scanner(System.in);

        operation = sc.next().charAt(0);

        if (operation == '/') {
            System.out.printf("%.1f %s %.1f = %.1f %n", firstValue,operation, secondValue, firstValue/secondValue);
            flag.flag = 1;
        } else if (operation == '*') {
            System.out.printf("%.1f %s %.1f = %.1f %n", firstValue,operation, secondValue, firstValue*secondValue);
            flag.flag = 1;
        } else if (operation == '-') {
            System.out.printf("%.1f %s %.1f = %.1f %n", firstValue,operation, secondValue, firstValue-secondValue);
            flag.flag = 1;
        } else if (operation == '+') {
            System.out.printf("%.1f %s %.1f = %.1f %n", firstValue,operation, secondValue, firstValue+secondValue);
            flag.flag = 1;
        } else {
            System.out.println("Вы ввели неверную операцию");
        }

    }

    static class Flag{
        int flag = 0;
    }


    public static void main(String[] args) {
        double firstValue = 0;
        double secondValue = 0;
        Flag flag = new Flag();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Введите первое целое число: ");
            firstValue = value(flag);
        } while (flag.flag == 0);

        flag.flag = 0;
        do {
            System.out.print("Введите второе целое число: ");
            secondValue = value(flag);
        } while (flag.flag == 0);

        System.out.println("первое введеное число; " + firstValue + "; второе введеное число: " + secondValue);

        flag.flag = 0;
        do {
            System.out.print("введите операцию, которую нужно произвести с числами: ");
            operation(flag, firstValue, secondValue);
        } while (flag.flag == 0);

    }
}
