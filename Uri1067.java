import java.util.Scanner;

public class Uri1067 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int x;
        x = teclado.nextInt();

        int contador =1;

        while (contador <=1000 && contador <= x){ 
            System.out.println (contador);
            contador = contador +2;
        } 
         
               
                      


    }
}