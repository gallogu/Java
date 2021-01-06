import java.util.Scanner;

public class Uri1008 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int A,B;
        double C,salario;

        //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextDouble();

        //Saida
        salario = B*C;

        System.out.println ("NUMBER = " +A);
        System.out.printf ("SALARY = U$ %.2f%n", salario);



    }
}