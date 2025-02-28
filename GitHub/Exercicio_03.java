import java.util.Scanner;

public class Exercicio_03{

     public static void main(String []args){
         float salario, reajuste, porcentagem, novo;
         
    Scanner input = new Scanner(System.in);
         
        System.out.print("Qual o seu salario atual? ");
        salario = input.nextInt();
        System.out.print("Quantos porcento aumentou no seu reajuste? ");
        reajuste = input.nextInt();
        
        porcentagem = salario * reajuste /100;
        novo = salario + porcentagem;
        
        System.out.print("Seu novo salario: " + novo);
        }
}
