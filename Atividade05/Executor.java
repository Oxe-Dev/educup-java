package Atividade05;

import java.util.Scanner;

//Ponto 1
public class Executor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Ponto 2
        /** Ponto 4 */
        System.out.println("Nome: "); //Ponto 3
        String nome = entrada.nextLine();
        System.out.println("Peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Altura: ");
        double altura = entrada.nextDouble();
        double imc;

        imc = peso / (altura * altura); // Ponto 5

        System.out.println("O IMC de "+nome+" está "+imc); //Ponto 6
    }
}
