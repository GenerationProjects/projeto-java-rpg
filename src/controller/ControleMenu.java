package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import static views.MenuView.*;

public class ControleMenu {

    public static void controleInicial() {


        Scanner sc = new Scanner(System.in);
        int op = 0;

        introLore();

        while (op == 0) {
            inicialMenu();
            try {
                op = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Errou !! (Fausto silva). Vamos começar mesmo assim!");
                op = 1;
            }


        }

    }

    //Metodo para iniciar jogo.
    public static void iniciarJogo() {


        Scanner sc = new Scanner(System.in);
        int op = 0;

        loreInicial();

        while (op == 0) {
            escolhaDeClasse();

            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nEscolha uma classe! Vamos tentar de novo...");
                op = 0;
            }

            escolhaDeClasse();


            switch (op) {
                case 1 -> {
                    System.out.println("Classe selecionada: Guerreiro");
                    System.out.println("Escolha seu nome: ");
                    sc.nextLine();
                }
                case 2 -> {
                    System.out.println("Classe selecionada: Arcano");
                    System.out.println("Escolha seu nome: ");
                    sc.nextLine();
                }
                case 3 -> {
                    System.out.println("Classe selecionada: Caçador");
                    System.out.println("Escolha seu nome: ");
                    sc.nextLine();
                }
                default -> {
                    System.out.println("Opção inválida! Vamos novamente...");
                    op = 0;
                }

            }
        }

    }
}


