package controller;

import entities.Arcano;
import entities.Cacador;
import entities.Guerreiro;
<<<<<<< HEAD
import entities.Heroi;

=======
>>>>>>> main

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static views.MenuView.*;

public class ControleMenu {

	ControllerHeroi heroi = new ControllerHeroi();

	public static void controleInicial() {

		Scanner sc = new Scanner(System.in);
		int op = 0;

		introLore();

<<<<<<< HEAD
        while (op == 0) {
            inicialMenu();
            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Errou !! (Fausto silva). Vamos começar mesmo assim!");
                op = 1;
            }

            switch (op) {
                case 1 -> iniciarJogo();
                case 2 -> iniciarJogo();
                case 3 -> iniciarJogo();
                default -> {
                    System.out.println("Opção inválida! Vamos novamente...");
                    sc.nextLine();
                    op = 0;
                }
            }

        }
    }

    // Metodo para iniciar jogo.
    public static void iniciarJogo() {
        loreInicial();
        condicaoDeClasse();
    }

    public static void condicaoDeClasse() {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        Heroi heroi;

        while (op == 0) {
            escolhaDeClasse();

            try {
                op = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nEscolha uma classe! Vamos tentar de novo...");
                sc.nextLine();
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
=======
		while (op == 0) {
			inicialMenu();
			try {
				op = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Errou !! (Fausto silva). Vamos começar mesmo assim!");
				op = 1;
			}

			switch (op) {
				case 1 -> iniciarJogo();
				case 2 -> iniciarJogo();
				case 3 -> iniciarJogo();
				default -> {
					System.out.println("Opção inválida! Vamos novamente...");
					sc.nextLine();
					op = 0;
				}
			}

		}
	}

	public static void iniciarJogo() {
		loreInicial();
		condicaoDeClasse();
	}

	public static void condicaoDeClasse() {
		Scanner sc = new Scanner(System.in);
		int op = 0;

		while (op == 0) {
			escolhaDeClasse();

			try {
				op = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("\nEscolha uma classe! Vamos tentar de novo...");
				sc.nextLine();
				op = 0;
			}

			switch (op) {
				case 1 -> new ControleMenu().escolhaDoNomeERaca(sc, op);
				case 2 -> new ControleMenu().escolhaDoNomeERaca(sc, op);
				case 3 -> new ControleMenu().escolhaDoNomeERaca(sc, op);
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

	public void escolhaDoNomeERaca(Scanner sc, int op) {
>>>>>>> main

		String nome, raca, tipoClasse = (op == 1) ? "Guerreiro" : (op == 2) ? "Arcano" : "Caçador", genero;
		float altura;
		int esc;

		System.out.println("\nClasse selecionada: " + tipoClasse);
		int conf = 0;

		switch (op) {
			case 1 -> {
				loreGuerreiro();
				while (conf == 0) {
					System.out.println("""
						Deseja confirmar?
						1 - Sim.
						2 - Escolher outra classe.
						""");
					try {
						conf = sc.nextInt();
						sc.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("\nConfirme ou escolha outra classe para continuar...");
						sc.nextLine();
						conf = 0;
					}
					if (conf > 2 || conf < 0) {
						System.out.println("Opção inválida, vamos de novo!");
						conf = 0;
					}
				}
				if (conf == 2) {
					condicaoDeClasse();
				}
			}
			case 2 -> {
				loreArcanista();
				while (conf == 0) {
					System.out.println("""
						Deseja confirmar?
						1 - Sim.
						2 - Escolher outra classe.
						""");
					try {
						conf = sc.nextInt();
						sc.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("\nConfirme ou escolha outra classe para continuar...");
						sc.nextLine();
						conf = 0;
					}
					if (conf > 2 || conf < 0) {
						System.out.println("Opção inválida, vamos de novo!");
						conf = 0;
					}
				}
				if (conf == 2) {
					condicaoDeClasse();
				}
			}
			case 3 -> {
				loreCacador();
				while (conf == 0) {
					System.out.println("""
						Deseja confirmar?
						1 - Sim.
						2 - Escolher outra classe.
						""");
					try {
						conf = sc.nextInt();
						sc.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("\nConfirme ou escolha outra classe para continuar...");
						sc.nextLine();
						conf = 0;
					}
					if (conf > 2 || conf < 0) {
						System.out.println("Opção inválida, vamos de novo!");
						conf = 0;
					}
				}
				if (conf == 2) {
					condicaoDeClasse();
				}
			}
		}

<<<<<<< HEAD
        System.out.println("\nClasse selecionada: " + tipoClasse);
        int conf = 0;

        switch (op) {
            case 1 -> {
                loreGuerreiro();
                while (conf == 0) {
                    System.out.println("""
                            Deseja confirmar?
                            1 - Sim.
                            2 - Escolher outra classe.
                            """);
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme ou escolha outra classe para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf>2 || conf<0){
                        System.out.println("Opção inválida, vamos de novo!");
                        conf = 0;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
            case 2 -> {
                loreArcanista();
                while (conf == 0) {
                    System.out.println("""
                            Deseja confirmar?
                            1 - Sim.
                            2 - Escolher outra classe.
                            """);
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme ou escolha outra classe para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf>2 || conf<0){
                        System.out.println("Opção inválida, vamos de novo!");
                        conf = 0;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
            case 3 -> {
                loreCacador();
                while (conf == 0) {
                    System.out.println("""
                            Deseja confirmar?
                            1 - Sim.
                            2 - Escolher outra classe.
                            """);
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme ou escolha outra classe para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf>2 || conf<0){
                        System.out.println("Opção inválida, vamos de novo!");
                        conf = 0;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
        }
=======
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
>>>>>>> main

		genero = (esc == 1) ? "Masculino" : "Feminino";

		heroi.adicionarHeroi((op == 1) ? new Guerreiro(nome, 2000, altura, genero, raca)
				: (op == 2) ? new Arcano(nome, 1000, altura, genero, raca)
				: new Cacador(nome, 1500, altura, genero, raca));
		continuacao();

	}

	public void continuacao() {
		impressaoLentaPorCaracter(heroi.mostrarnome());
		inicioJornada();
		int op;
		Scanner sc = new Scanner(System.in);

		primeiraEscolha();
		op = sc.nextInt();

		if (op == 1) {
			voceEstaMorto();

		}else {
			continuacao2();
		}

		int hpMonstroGoblins = 5000;
		do {
			keyPress();
			hpMonstroGoblins -= heroi.atacar(rolarDados());
		} while (hpMonstroGoblins > 0);

		}

}
