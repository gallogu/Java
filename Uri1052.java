import java.util.Scanner;

public class Uri1052 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

        int a;
        String mes;

        //Entrada
        a = teclado.nextInt();

        //Saida

        if (a == 1){
            mes = "January";
        }
        else if (a == 2) {
            mes = "February";
        }
        else if (a ==3) {
            mes = "March";
        }
        else if (a ==4){
            mes = "April";
        }
        else if (a== 5){
            mes = "May";
        }
        else if (a == 6){
            mes = "June";
        }
        else if (a == 7){
            mes = "July";
        }
        else if (a ==8){
            mes = "August";
        }
        else if (a ==9){
            mes = "September";
        }
        else if (a==10){
            mes = "October";
        }
        else if (a == 11){
            mes = "November";
        }
        else {
            mes = "December";
        }

        System.out.println (mes);

    }
}
