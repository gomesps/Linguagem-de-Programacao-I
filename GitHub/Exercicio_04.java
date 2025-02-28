import java.util.Scanner;

public class Exercicio_04{

     public static void main(String []args){
         float custo, fabrica, impostos, distribuidor;
         
    Scanner input = new Scanner(System.in);
         
        System.out.print("Qual o custo da fabrica para fabricar um carro? ");
        fabrica = input.nextFloat();
        
        distribuidor = fabrica * 28/100 ;
        impostos = fabrica * 45/100 ;
        custo = fabrica + impostos + distribuidor;
        
        System.out.print("Vai custar para o cliente: " + custo );
        
        }
}
