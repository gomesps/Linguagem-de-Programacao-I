import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor 01: ");
    double valor1 = input.nextDouble();
    System.out.println("Digite o valor 02: ");
    double valor2 = input.nextDouble();
    if(valor1 > valor2){
        System.out.println("Valor 01 e maior");
    }
    else{
        System.out.println("Valor 02 e maior");
    }
    }
}
