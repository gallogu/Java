import java.util.Scanner;

public class Uri1007 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int A,B,C,D,DIFERENCA;

        //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        //Saida
        DIFERENCA = (A * B - C * D);

        System.out.println ("DIFERENCA = " +DIFERENCA);
        

    }
}
