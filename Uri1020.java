import java.util.Scanner;

public class Uri1020 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a;
        int x,y,z,resto1,resto2;


        //Entrada
        a = teclado.nextInt();

        //Saida
        x = a / 365; //anos
        resto1 = a % 365;

        y = resto1 / 30; //meses
        resto2 = resto1 % 30;

        z = resto2; // dias

        System.out.println (x +" ano(s)");
        System.out.println (y +" mes(es)");
        System.out.println (z +" dia(s)");



    }
}

