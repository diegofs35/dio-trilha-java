import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        int n1 = 0;
        int n2 = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            n2 = sc.nextInt();
            if (n1 > n2){
                System.out.println("O Segundo número digitado deve ser maior que o primeiro.");
            }   
            else{
                resultado = n2 - n1;
                System.out.println("O resultado é "+ resultado);
            
            }
            for (int i = 1; i <= resultado; i++){
                System.out.println("Imprimindo o número "+ i);
            }
            
                
       }    
            
        
        
    }

