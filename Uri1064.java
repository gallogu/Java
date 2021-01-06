import java.util.Scanner;

public class Uri1064 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        double num;
        double qtdade=0;
        double soma=0;
        double somatotal=0; 
        double media=0;

        for (int cont=1; cont<=6; cont++){ 
            num = teclado.nextFloat();

                        if (num > 0){ 
                        qtdade = qtdade + 1;
                         soma += num; 
                                 
             }   

             
        }

        media = soma / qtdade;

        System.out.printf ("%.0f valores positivos%n", qtdade);
        System.out.printf ("%.1f%n", media);


    }
}