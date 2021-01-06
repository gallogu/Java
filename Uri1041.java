import java.util.Scanner;

public class Uri1041 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        double x,y;
        String resultado = "";

        //Entrada
        x = teclado.nextDouble();
        y = teclado.nextDouble();

        //Saida

        //Q1 = x>0 e y>0
        //Q2 = x<0 e y>0
        //Q3 = x <0 e y<0
        //Q4 = x >0 e y<0
        // Origem x e y =0
        //Eixo x - y=0
        //Eixo y - x=0

        if (x>0 && y>0){
            resultado = "Q1";
        }
        else if (x<0 && y>0){
            resultado = "Q2";
        }
        else if (x<0 && y<0){
            resultado = "Q3";
        }
        else if (x>0 && y<0){
            resultado = "Q4";
        }
        else if (x == 0 && y == 0){
            resultado = "Origem";
        }
        else if (x == 0 && y!=0){
            resultado = "Eixo Y";
        }
        else if (x!=0 && y ==0){
            resultado = "Eixo X";
        }

        System.out.println (resultado); 


    }
}
