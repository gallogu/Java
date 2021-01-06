import java.util.Scanner;

public class Uri1070 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int x,a;
        int valor;
        x = teclado.nextInt();


        if (x %2 ==0){
            x++;
        } 

        for (int cont=1; cont<=6; cont++){             
                System.out.println (x);
                x += 2;            

        }

    }
}