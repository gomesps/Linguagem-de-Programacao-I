import java.util.Scanner;


public class Exercicio_02 {
    public static void main(String[] args) throws Exception {
        float percentualb, percentualn, percentualv; //Declarando as variaveis
        float eleitores, brancos, nulos, validos;

        Scanner input = new Scanner(System.in); //criando a interacao com o usuario
        
        //criando as interacoes

        System.out.print("Quantos eleitores tem no municipio? ");
        eleitores = input.nextInt();
        System.out.print("Quantos votaram em branco? ");
        brancos = input.nextInt();
        System.out.print("Quantos votaram nulo? ");
        nulos = input.nextInt();
        System.out.print("Quantos foram validados? ");
        validos = input.nextInt();
        
        //calculos
       percentualb = brancos/eleitores * 100;
       percentualn = nulos/eleitores * 100;
       percentualv = validos/eleitores * 100;
        
        //print
        System.out.print("Total: Votos em Branco: " + percentualb + "%" + " Votos nulos: " + percentualn + "%" + " Votos que foram validados: " + percentualv + "%");
    }
}
