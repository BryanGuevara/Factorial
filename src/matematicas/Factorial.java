package matematicas;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("=================================================== <[Entrada]> ==================================================");
            System.out.print("Introduzca un numero: ");
            int num = scan.nextInt();
            System.out.println("Para saber cuanto es " + num + "! hacemos la siguiente multiplicación");
            System.out.println("=================================================== <[Calculo]> ==================================================");

            if (num < 0) {
                System.out.println("=================================================== <[Error]> ====================================================");
                System.err.println("Error, Solo numeros mayores o iguales a 0");
                System.out.println("==================================================================================================================");
                return;
            }

            if (num == 0) {
                System.out.println("0! = 1");
                System.out.println("==================================================================================================================");
                return;
            }
            if (num == 1) {
                System.out.println("1! = 1");
                System.out.println("==================================================================================================================");
                return;
            }

            BigInteger factorial = BigInteger.ONE;
            for (int i = num; i > 1; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                System.out.println(i + " X ");
            }
            factorial = factorial.multiply(BigInteger.ONE);

            String factorialStr = factorial.toString();
            StringBuilder result = new StringBuilder();
            int largo = 0;
            for (char c : factorialStr.toCharArray()) {
                if (largo >= 105) {
                    result.append("\n");
                    largo = 0;
                }
                result.append(c);
                largo++;
            }

            System.out.println("1");
            System.out.println("_________");
            System.out.println(result.toString());
            System.out.println("==================================================================================================================");

        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }
    }
}
