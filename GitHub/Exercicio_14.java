import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Inicio: ");
    int inicio = input.nextInt();
    System.out.print("Fim: ");
    int fim = input.nextInt();
    int duracao;
    duracao = inicio - fim;
    
    if (duracao < 0 ){
        duracao = duracao * -1;
    }
    
    System.out.print("Esta partida durou: " + duracao + " Horas");
    
    
    }
}

