import java.util.Scanner;

public class Uri1060 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        float num;
        int qtdade=0;

        for (int cont=1; cont<=6; cont++){ 
            num = teclado.nextFloat();

                        if (num > 0){ 
                        qtdade = qtdade + 1;             
             }   
        }

        System.out.println (qtdade +" valores positivos");


    }
}
