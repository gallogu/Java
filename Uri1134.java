import java.util.Scanner;

public class Uri1134 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int x;
        int qtdalc=0;
        int qtddiesel=0;
        int qtdgas=0;

        do{ 
            x = teclado.nextInt();
            if (x ==1){ 
                qtdalc++;
            }
            else if (x ==2){ 
                qtdgas++;
            } 
            else if (x ==3){ 
                qtddiesel++;
            }
        }
        while (x != 4);
        System.out.println ("MUITO OBRIGADO");
        System.out.println ("Alcool: " +qtdalc);
        System.out.println ("Gasolina: " +qtdgas);
        System.out.println ("Diesel: " +qtddiesel);


    }
}