// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entrada, com métodos úteis com prefixo "next";
// - System.out.println: .imprime um testo de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Insira o bruto do salário: ");
        float valorSalario = leitorDeEntradas.nextFloat();

        System.out.println("Insira o adicional dos benefícios: ");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        }else {
            valorImposto = 0.15F * valorSalario;
        }
        //Todo: Criar as demais condições para as aliquotas de 10.00% e 15.00%.

        //Calcula e imprime a Saída (com 2 casas decimais)
        System.out.println("Salário líquido: ");
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
