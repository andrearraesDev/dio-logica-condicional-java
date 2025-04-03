import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {

         // Lê os valores de entrada:
        Scanner LeitorDeEntradas = new Scanner(System.in);
        
        System.out.println("Valor do Salario:");
        float valorSalario = LeitorDeEntradas.nextFloat();
        System.out.println("Valor do Beneficio:");
        float valorBeneficios = LeitorDeEntradas.nextFloat();
        float valorImposto = 0;

        
        // Atribui a alíquota conforme o salário:
        if (valorSalario >= 0 && valorSalario <= 1100.00) { 
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        }else if (valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        }

         // Calcula e imprime a saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        LeitorDeEntradas.close();

    }
}