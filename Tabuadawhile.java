
import java.util.Scanner;

public class Tabuadawhile {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int numero;
        int contador;

        System.out.println ("Digite o numero para calcular a tabuada");
        numero = teclado.nextInt();

        contador = 1;

        while (contador <= 10){ 
            System.out.println (numero +" x " + contador + " = " + (numero * contador));
            contador ++; // OU contador = contador + 1;
        }





    }
}

