import java.util.Scanner;

public class Uri1051 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        double a,imposto;
        

        //Entrada
        a = teclado.nextDouble();

        //Saida

        if (a <= 2000.00){ 
            System.out.println ("Isento");
        }
        else if (a<=3000.00){ 
            imposto = (a - 2000.00) * 0.08;
            System.out.printf ("R$ %.2f%n", imposto);
        }
        else if (a<= 4500.00){ 
            imposto = 80 + (a - 3000.00) * 0.18;
            System.out.printf ("R$ %.2f%n", imposto); 
        }
        else { 
            imposto = 350 + (a - 4500.00) * 0.28;
            System.out.printf ("R$ %.2f%n", imposto);
        }


    }
}
