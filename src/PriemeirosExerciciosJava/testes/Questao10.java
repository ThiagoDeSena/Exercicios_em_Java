package PriemeirosExerciciosJava.testes;

import java.util.Scanner;
//10. Sabe-se que: 1 pé = 12 polegadas | 1 jarda = 3 pés | 1 milha = 1.760 jardas
//Faça um programa que receba uma medida em pés , faça as conversões a seguir e mostre os resultados.
//a. polegadas;
//b. jardas;
//c. milhas.
public class Questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pe,polegada,jarda,milha;

        System.out.println("Digite a medida em pés(\"):");
        pe=scan.nextDouble();

        polegada=pe*12;
        jarda=pe/3;
        milha=jarda/1760;

        System.out.println(polegada+" Polegadas");
        System.out.println(jarda+" Jardas");
        System.out.println(milha+" Milhas");
    }
}
