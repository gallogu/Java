import java.util.Scanner;

public class Uri1048 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        double x;

        //Entrada
        x = teclado.nextDouble();

        //Saida
        if (x<=400.00){ 
           System.out.printf ("Novo salario: %.2f%n", x + x*15/100);
           System.out.printf ("Reajuste ganho: %.2f%n", x*15/100);
           System.out.println ("Em percentual: 15 %");
        }
        else if (x>400.00 && x<=800.00){ 
           System.out.printf ("Novo salario: %.2f%n", x +x*12/100);
           System.out.printf ("Reajuste ganho: %.2f%n", x*12/100);
           System.out.println ("Em percentual: 12 %");
        }
        else if (x>800.00 && x<=1200.00){ 
               System.out.printf ("Novo salario: %.2f%n", x + x*10/100);
           System.out.printf ("Reajuste ganho: %.2f%n", x*10/100);
           System.out.println ("Em percentual: 10 %" );
        }
        else if (x>1200.00 && x<=2000.00){ 
            System.out.printf ("Novo salario: %.2f%n", x + x*7/100);
           System.out.printf ("Reajuste ganho: %.2f%n", x*7/100);
           System.out.println ("Em percentual: 7 %");
        }
        else { 
            System.out.printf ("Novo salario: %.2f%n", x + x*4/100);
           System.out.printf ("Reajuste ganho: %.2f%n", x*4/100);
           System.out.println ("Em percentual: 4 %");
        }
        
    }
}
