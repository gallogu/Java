import java.util.Scanner;

public class Leitura {
    public static void main (String args[]) { 

        // declarar um componente do tipo scanner

        Scanner teclado;

        // indicar que o scanner vai ler do meu teclado

        teclado = new Scanner (System.in);

        int a;
        double b;

        System.out.println  ("Digite um valor inteiro");
        a = teclado.nextInt();

        System.out.println  ("Digite um valor real");
        b = teclado.nextDouble();

        System.out.println  ("Voce digitou os valores " + a + " e "  +b);

        

    }
}