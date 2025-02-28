import java.util.Scanner;


public class Exercicio_01 {
    public static void main(String[] args) throws Exception {
        int anos, total, meses, dias; //Declarando as variaveis

        Scanner input = new Scanner(System.in); //criando a interacao com o usuario
        
        //criando as interacoes

        System.out.print("Anos: ");
        anos = input.nextInt() * 365;
        System.out.print("Meses: ");
        meses = input.nextInt() * 30;
        System.out.print("Dias: ");
        dias = input.nextInt();
        
        //calculos
        total = anos + meses + dias;
        
        //print
        System.out.print("Sua idade em dias: " + total);
    }
}
