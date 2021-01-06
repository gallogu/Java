import java.util.Scanner;

public class Uri1046 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int x,y,duracao;

        //Entrada
        x = teclado.nextInt();
        y = teclado.nextInt();

        //Saida
        if (y>x){ 
            duracao = y-x;
        }
        else if (y==x){ 
            duracao = 24;
        }
        else { 
            duracao = 24 - x + y;
        }

        System.out.println ("O JOGO DUROU " +duracao +" HORA(S)"); 



    }
}
