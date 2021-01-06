import java.util.Scanner;

public class Uri1144 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int linha = teclado.nextInt();

        for (int num=1; num<=linha; num++){ 
            System.out.println (num +" " +num * num +" " + num * num* num);
            System.out.println (num +" " + (num * num +1) +" " + (num * num* num +1));
        }

    }
}