import java.util.Scanner;

public class Uri1001 {
    public static void main (String args[]) { 

    Scanner teclado = new Scanner (System.in);
    int A,B,X;

    //Entrada   
    A = teclado.nextInt();
    B = teclado.nextInt();

    //Saida
    X = A + B;

    System.out.println ("X = " +X);

    }
}