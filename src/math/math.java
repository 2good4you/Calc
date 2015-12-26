package math;


import java.util.Scanner;

public class math {
    public static char operationInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        char result = sc.next().charAt(0);
        switch (result) {
            case '/':
            case '*':
            case '-':
            case '+':
                return result;
        }
        throw new Exception("Unknown operation");
    }

    public static double valueInput() throws Exception {
        Scanner sc = new Scanner(System.in);
//        if (!sc.hasNextLine()) {
//            throw new Exception("Unknown value");
//        }
//        return Double.parseDouble(sc.nextLine().replaceAll("[^\\-\\d]", ""));
        return Double.parseDouble(sc.nextLine().replaceAll("[^-\\d]", ""));
    }

    public static double calc(double a, double b, char c) throws Exception{
        switch (c) {
            case '/':
                if(b==0){
                    throw new Exception("Error ...");
                }
                return a / b;
            case '*':
                return a * b;
            case '-':
                return a - b;
            case '+':
                return a + b;
        }
        throw new Exception("Unknown operation");
    }

    public static void main(String[] args) {
        double a, b;
        char o;

        while(true) {
            try{
                System.out.print("Введите первое целое число: ");
                a = valueInput();
                break;
            }
            catch(Exception e){}
        }

        while(true) {
            try{
                System.out.print("Введите второе целое число: ");
                b = valueInput();
                break;
            }
            catch(Exception e){}
        }

        while(true) {
            try {
                System.out.print("введите операцию, которую нужно произвести с числами: ");
                o = operationInput();
                break;
            }
            catch(Exception e){}
        }

        try {
            System.out.printf("%.2f %c %.2f = %.2f\n", a, o, b, calc(a, b, o));
        }
        catch(Exception e){
            System.out.printf("%.2f %c %.2f = %s\n", a, o, b, e.getMessage());
        }
    }
}
