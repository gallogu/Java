import java.util.Scanner;

public class Uri1047 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int hi,mi,hf,mf,duracao,duracao1,duracao2,a,b;
        duracao1 = 0;
        duracao2 = 0; 

        //entrada
        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();

        //Saida 

        a = hi * 60; 
        b = hf * 60;

        duracao = b + mf - a - mi;

        if (duracao <0){ 
            duracao = 1440 +b +mf -a -mi;
        }
        else if (duracao == 0){ 
            duracao = 1440;
        }

        duracao1 = duracao /60; //horas

        duracao2 = duracao % 60; //Minutos  


        System.out.println ("O JOGO DUROU " + duracao1 + " HORA(S)" +" E " + duracao2 + " MINUTO(S)");



    }
}
