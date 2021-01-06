import java.util.Scanner;

public class Uri1017 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        double a,b;
        double litros;

        //Entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
       

        //Saida
        litros = (a*b)/12;

        System.out.printf ("%.3f%n", litros);




    }
}
