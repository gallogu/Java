import java.util.Scanner;

public class Uri1018 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a,x,y,z,w,k,j,resto1,resto2,resto3,resto4,resto5,resto6;

        //Entrada
        a = teclado.nextInt();

        //Saida
        x = a/100; //Nota de 100
        resto1 = a % 100;

        y = resto1 / 50; //Nota de 50
        resto2 = resto1 % 50;

        z = resto2 / 20; //Notas de 20
        resto3 = resto2 % 20;

        w = resto3 / 10; //Nota de 10
        resto4 = resto3 % 10;

        k = resto4 / 5; //Notas de 5
        resto5 = resto4 % 5;

        j = resto5 / 2; //Notas de 2

        resto6 = resto5 % 2; //Notas de 1

        System.out.println ("" +a);
        System.out.println (x +" nota(s) de R$ 100,00");
        System.out.println (y +" nota(s) de R$ 50,00");
        System.out.println (z +" nota(s) de R$ 20,00");
        System.out.println (w +" nota(s) de R$ 10,00");
        System.out.println (k +" nota(s) de R$ 5,00");
        System.out.println (j +" nota(s) de R$ 2,00");
        System.out.println (resto6 +" nota(s) de R$ 1,00");



    }
}

