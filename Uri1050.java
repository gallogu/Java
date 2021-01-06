import java.util.Scanner;

public class Uri1050 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a; 
        String cidade;
       
        
        //Entrada
        a = teclado.nextInt();

        //Proc
        if (a == 61) {
            cidade = "Brasilia";    
        }
        else if (a == 71){
            cidade = "Salvador";
        }
        else if (a == 11){
            cidade = "Sao Paulo";
        }
        else if (a == 21){
            cidade = "Rio de Janeiro";
        }
        else if (a == 32){
            cidade = "Juiz de Fora";
        }
        else if (a == 19){
            cidade = "Campinas";
        }
        else if (a == 27){
            cidade = "Vitoria";
        }
        else if (a == 31){
            cidade = "Belo Horizonte";
        } 
        else {
            cidade = "DDD nao cadastrado";
        }

        //Saida
        System.out.println (cidade);

    }
}