import java.util.Scanner;

public class Uri1019 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a,x,y,z;
        int resto1,resto2;

        //Entrada
        a = teclado.nextInt ();

        //Saida
        x = a / 3600; //horas
        resto1 = a % 3600;  

        y = resto1 / 60; //minutos
        resto2 = resto1 % 60; //segundos

        
        
        System.out.println (x +":" +y +":" +resto2);




    }
}
