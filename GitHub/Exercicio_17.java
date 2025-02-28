import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de notas
        System.out.print("Digite a nota da Prova1: ");
        float P1 = input.nextFloat();
        System.out.print("Digite a nota do Trabalho1: ");
        float E1 = input.nextFloat();
        System.out.print("Digite a nota do Trabalho2: ");
        float E2 = input.nextFloat();
        System.out.print("Quantos pontos extras? ");
        float extra = input.nextFloat();
        System.out.print("Qual a nota da API: ");
        float api = input.nextFloat();

        // Cálculo da mediaPrincipal
        double mediaPrincipal = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        
        // Aplicando a fórmula fornecida para calcular a média final
        double ajuste = Math.max(mediaPrincipal - 5.9, 0);
        double impactoAPI = 0;

        if (ajuste > 0) {
            impactoAPI = (ajuste / (mediaPrincipal - 5.9)) * (api * 0.5);
        }

        // Pontuação extra
        float sub = 0;
        double notaFinal;

        // Cálculo da nota final considerando a SUB (se necessário)
        if ((mediaPrincipal * 0.5 + impactoAPI + extra) < 6) {
            System.out.print("Qual sua nota na SUB: ");
            sub = input.nextFloat();
        }

        // Fórmula final para o cálculo da nota
        notaFinal = (mediaPrincipal * 0.5) + impactoAPI + extra + (sub * 0.3);

        // Exibindo o resultado final
        if (notaFinal >= 6) {
        
            System.out.println("Media final: " + notaFinal + " Parabens! Aprovado");
        } else {
            
            System.out.println("Media final: " + notaFinal + "Reprovado ");
        }

        input.close();
    }
}