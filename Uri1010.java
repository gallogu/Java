import java.util.Scanner;

public class Uri1010 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a,b,c,d;
        double x,y,soma,preco1,preco2;

        //Entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        x = teclado.nextDouble();

        c = teclado.nextInt();
        d = teclado.nextInt();
        y = teclado.nextDouble();

        //Saida
        preco1 = b*x;
        preco2 = d*y;
        soma = preco1 + preco2;

        System.out.printf ("VALOR A PAGAR: R$ %.2f%n", soma);

    }
}
