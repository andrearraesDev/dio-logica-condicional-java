import java.util.Scanner;

/**
 * Calculadora de Salário Líquido
 *
 * Este programa calcula o salário líquido de um colaborador com base no salário bruto informado,
 * aplicando a alíquota de imposto de renda correspondente e somando o valor dos benefícios.
 *
 * Faixas de imposto:
 * - Até R$ 1.100,00: 5%
 * - De R$ 1.100,01 até R$ 2.500,00: 10%
 * - Acima de R$ 2.500,00: 15%
 *
 * Desenvolvido por: André Arraes
 * GitHub: https://github.com/andrearraesDev
 */

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalho();

        System.out.print("Informe o valor do salário bruto: R$ ");
        float salario = scanner.nextFloat();

        System.out.print("Informe o valor dos benefícios: R$ ");
        float beneficio = scanner.nextFloat();

        float imposto = calcularImposto(salario);
        float salarioLiquido = salario - imposto + beneficio;

        exibirResumo(salario, imposto, beneficio, salarioLiquido);

        scanner.close();
    }

    private static float calcularImposto(float salario) {
        if (salario <= 1100.00f) {
            return salario * 0.05f;
        } else if (salario <= 2500.00f) {
            return salario * 0.10f;
        } else {
            return salario * 0.15f;
        }
    }

    private static void exibirCabecalho() {
        System.out.println("==============================================");
        System.out.println("        CALCULADORA DE SALÁRIO LÍQUIDO        ");
        System.out.println("==============================================");
        System.out.println("Este sistema calcula o salário líquido do(a) ");
        System.out.println("colaborador(a) com base no salário bruto,     ");
        System.out.println("aplicando a alíquota de imposto e somando     ");
        System.out.println("os benefícios informados.\n");
    }

    private static void exibirResumo(float salario, float imposto, float beneficio, float liquido) {
        System.out.println("\n--------------- RESUMO DO CÁLCULO ---------------");
        System.out.printf("Salário Bruto:       R$ %.2f%n", salario);
        System.out.printf("(-) Imposto:         R$ %.2f%n", imposto);
        System.out.printf("(+) Benefícios:      R$ %.2f%n", beneficio);
        System.out.println("-------------------------------------------------");
        System.out.printf("Salário Líquido:     R$ %.2f%n", liquido);
        System.out.println("-------------------------------------------------");
    }
}