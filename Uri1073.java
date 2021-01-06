import java.util.Scanner;

public class Uri1073 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int N, resultado;
        N = teclado.nextInt();

        

        for (int cont=2; cont<2000; cont += 2){ 
           if (cont <= N ){
               resultado = cont * cont;
               System.out.println (cont + "^2" +" = " +resultado);
            } 

        }  
           


        
       

       }

}