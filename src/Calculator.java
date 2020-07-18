

import java.util.Scanner;

import static java.util.Scanner.*;

public class Calculator {
    public static void main(String[] args) {
        boolean terminate = false;
        do {
            System.out.println("Would you like to make floating point calculations? Type y for yes and anything else for integer calculations");
            Scanner sc = new Scanner(System.in);

            String yes = sc.nextLine();
            while (!yes.equals("y") && !yes.equals("n")) {
                System.out.println("Enter y or n");
                yes = sc.nextLine();
            }
            System.out.println("Input first Number");
            int numb1 = sc.nextInt();
            System.out.println("Input second Number");
            int numb2 = sc.nextInt();
            System.out.println("""
                    You can make the following calculationsy:
                    1.   addition
                    2.   subtraction
                    3.   divide
                    4.   modulo
                    5.   pythagoras you can calculate the hypotenuse c

                    To select a calculation please press the corresponding number""");

            int choose = sc.nextInt();

            double sum = calcu(numb1, numb2, choose);
            if (yes.equals("y")) {
                System.out.print(sum);
            } else {
                int i = (int) sum;
                System.out.print(i);
            }
            System.out.println();

        } while (!terminate);
    }

    private static double calcu(double numb1, double numb2, int choose) {


        switch (choose) {
            case 1:
                double erg1 = numb1 + numb2;
                System.out.print(numb1 + "+" + numb2 + "=");
                return erg1;
            case 2:
                double erg2 = numb1 - numb2;
                System.out.print(numb1 + "-" + numb2 + "=");
                return erg2;
            case 3:
                double erg3 = numb1 / numb2;
                System.out.print(numb1 + ":" + numb2 + "=");
                return erg3;
            case 4:
                double erg4 = numb1 % numb2;
                System.out.print(numb1 + "%" + numb2 + "=");
                return erg4;
            case 5:
                double erg5 = Math.sqrt(Math.pow(numb1, 2) * Math.pow(numb2, 2));
                System.out.print(numb1 + "^2" + "*" + numb2 + "^2" + "=");
                return erg5;
            default:
                return 0;
        }
    }
}
