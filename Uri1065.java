import java.util.Scanner;

public class Uri1065 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int num;
        int qtdade=0;

        for (int contador=1; contador<=5; contador++){ 
            num = teclado.nextInt();
            if (num % 2 ==0){ 
                  qtdade = qtdade + 1;  
            }
            
        }

        System.out.println (qtdade +" valores pares");



    }
}

