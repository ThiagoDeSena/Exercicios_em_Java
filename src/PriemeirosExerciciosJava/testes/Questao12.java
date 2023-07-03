package PriemeirosExerciciosJava.testes;

import java.util.Scanner;
//12. O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao
//preço de fábrica. Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de
//impostos, calcule e mostre: a. o valor correspondente ao lucro do distribuidor; b. o valor correspondente aos impostos; c. o preço final do produto.
public class Questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double prrecoFabrica,distribuidor,imposto,lucrodistribuidor,impostoPago;

        System.out.println("Digite o custo de fábrica do carro(R$):");
        prrecoFabrica = scan.nextDouble();
        System.out.println("Digite o percentual(%) de lucro do distribuidor do preço de fábrica(R$):");
        distribuidor= scan.nextDouble();
        System.out.println("Digite o percentual(%) de imposto sobre o preço de fábrica:");
        imposto=scan.nextDouble();

        lucrodistribuidor = (distribuidor/100)*prrecoFabrica;
        impostoPago=(imposto/100)*prrecoFabrica;
    }
}
