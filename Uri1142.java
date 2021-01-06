import java.util.Scanner;

public class Uri1142 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int N;
        int a,b,c;

        N = teclado.nextInt();        

        
        for (int cont=0; cont<N; cont++){             
            a = 1+(cont*4);
            b = 2+(cont*4);
            c = 3+(cont*4);
            
            System.out.println (a + " " +b + " " +c +" PUM");
                        
        }

    }
}