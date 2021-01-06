import java.util.Scanner;

public class Uri1038 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int A,B;
        double total;

        //Entrada
        A = teclado.nextInt(); //codigo
        B = teclado.nextInt(); // quantidade

        //Proc
        if (A == 1){
            total = B * 4.00;
            }
            else if (A == 2) {
            total = B * 4.50;
            }
            else if (A == 3) {
            total = B * 5.00;
            }
            else if (A == 4){
            total = B * 2.00;
            }
            else {
            total = B * 1.50;
            }   

            //Saida

            System.out.printf ("Total: R$ %.2f%n", total);
    

    }
}
