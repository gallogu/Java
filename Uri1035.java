import java.util.Scanner;

public class Uri1035 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int A,B,C,D;

        /*  se B for maior do que C 
         D for maior do que A, 
         soma de C com D for maior que a soma de A e B 
         se C e D, ambos, forem positivos 
        a variável A for par
        */

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A %2 == 0) {
            System.out.println ("Valores aceitos");
        }
        else {
           System.out.println ("Valores nao aceitos");
        }



    }
}
