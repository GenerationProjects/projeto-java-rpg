package controller;

import static views.MenuView.escolhaDeClasse;
import static views.MenuView.escolhaDeRaca;
import static views.MenuView.inicialMenu;
import static views.MenuView.introLore;
import static views.MenuView.loreInicial;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

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
		String nome, raca;
		float altura;
		int esc;

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
			case 1 -> {
				System.out.println("Classe selecionada: Guerreiro");
				System.out.print("Escolha seu nome: ");
				nome = sc.nextLine();
				System.out.print("Digite sua altura: ");
				altura = sc.nextFloat();
				escolhaDeRaca();
				esc = sc.nextInt();
				sc.nextLine();

				if (esc == 1)
					raca = "Humano";
				else if (esc == 2)
					raca = "Orc";
				else
					raca = "Elfo";
			}
			case 2 -> {
				System.out.println("Classe selecionada: Arcano");
				System.out.print("Escolha seu nome: ");
				nome = sc.nextLine();
				System.out.print("Digite sua altura: ");
				altura = sc.nextFloat();
				escolhaDeRaca();

				esc = sc.nextInt();
				sc.nextLine();

				if (esc == 1)
					raca = "Humano";
				else if (esc == 2)
					raca = "Orc";
				else
					raca = "Elfo";
			}
			case 3 -> {
				System.out.println("Classe selecionada: Caçador");
				System.out.print("Escolha seu nome: ");
				nome = sc.nextLine();
				System.out.print("Digite sua altura: ");
				altura = sc.nextFloat();
				escolhaDeRaca();

				esc = sc.nextInt();
				sc.nextLine();

				if (esc == 1)
					raca = "Humano";
				else if (esc == 2)
					raca = "Orc";
				else
					raca = "Elfo";
			}
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

}