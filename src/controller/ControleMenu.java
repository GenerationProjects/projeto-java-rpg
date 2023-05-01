package controller;

import entities.Arcano;
import entities.Cacador;
import entities.Guerreiro;
import entities.Heroi;
import java.util.InputMismatchException;
import java.util.Random;
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
                switch (op) {
                    case 1 -> iniciarJogo();
                    case 2 -> iniciarJogo();
                    case 3 -> iniciarJogo();
                }

            } catch (InputMismatchException e) {
                System.out.println("Errou !! (Fausto silva). Vamos começar mesmo assim!");
                op = 1;
            }

        }
    }

    // Metodo para iniciar jogo.
    public static void iniciarJogo() {

        Scanner sc = new Scanner(System.in);
        int op = 0;
        Heroi heroi;

        loreInicial();

        while (op == 0) {
            escolhaDeClasse();

            try {
                op = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nEscolha uma classe! Vamos tentar de novo...");
                op = 0;
            }

            switch (op) {
                case 1 -> escolhaDoNomeERaca(sc, op);
                case 2 -> escolhaDoNomeERaca(sc, op);
                case 3 -> escolhaDoNomeERaca(sc, op);
                default -> {
                    System.out.println("Opção inválida! Vamos novamente...");
                    op = 0;
                }
            }
        }

    }

    public static int rolarDados() {
        return new Random().nextInt(1, 20);
    }

    public static void escolhaDoNomeERaca(Scanner sc, int op) {

        String nome, raca, tipoClasse = (op == 1) ? "Guerreiro" : (op == 2) ? "Arcano" : "Caçador", genero;
        float altura;
        int esc;

        System.out.println("\nClasse selecionada: " + tipoClasse);

        if (op == 1) {

        } else if (op == 2) {

        } else {

        }

        System.out.print("Escolha seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();
        escolhaDeRaca();

        esc = sc.nextInt();
        sc.nextLine();

        raca = (esc == 1) ? "Humano" : (esc == 2) ? "Orc" : "Elfo";

        escolhaDeGenero();

        esc = sc.nextInt();
        sc.nextLine();

        genero = (esc == 1) ? "Masculino" : "Feminino";

        Heroi heroi = (op == 1) ? new Guerreiro(nome, 2000, altura, genero, raca) :
                (op == 2) ? new Arcano(nome, 1000, altura, genero, raca) :
                        new Cacador(nome, 1500, altura, genero, raca);

    }

}