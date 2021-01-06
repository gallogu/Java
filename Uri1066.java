import java.util.Scanner;

public class Uri1066 {
    public static void main (String args[]) { 

        Scanner teclado = new Scanner (System.in);

          int num;
          int qtdpar=0;
          int qtdimpar=0;
          int qtdpositivo=0;
          int qtdnegativo=0;


          for (int cont=1; cont<=5; cont++) { 
              num = teclado.nextInt();
              
                if (num > 0){ 
                     qtdpositivo = qtdpositivo + 1;   
                }
                if (num <0){ 
                    qtdnegativo = qtdnegativo +1;
                }
                if (num % 2==0){ 
                    qtdpar = qtdpar +1;
                }
                if (num %2 != 0){ 
                    qtdimpar = qtdimpar +1;
                }
              }
        
        System.out.println (qtdpar +" valor(es) par(es)");
        System.out.println (qtdimpar +" valor(es) impar(es)");
        System.out.println (qtdpositivo +" valor(es) positivo(s)");
        System.out.println (qtdnegativo +" valor(es) negativo(s)");


    }
}

