import java.util.Scanner;

public class Uri1114 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a;

                      
        
        do { 
            a = teclado.nextInt();
            if (a != 2002){ 
            System.out.println ("Senha Invalida");
            }
        }
        while (a != 2002);

            System.out.println ("Acesso Permitido");
        

    }
}