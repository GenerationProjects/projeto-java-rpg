package controller;

import entities.Arcano;
import entities.Cacador;
import entities.Guerreiro;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static views.MenuView.*;

public class ControleMenu {

    Scanner sc = new Scanner(System.in);


    ControllerHeroi heroi = new ControllerHeroi();

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

        } else {
            continuacao2();
        }

        int hpMonstroGoblins = 5000;
        int hpHeroi = heroi.hpHeroi;
        int vez = 0;
        do {
            if (vez % 2 == 0) {
                System.out.println("\nAgora é hora de Atacar!");
                keyPress(vez);
                hpMonstroGoblins -= heroi.atacar(rolarDados());

            } else {
                System.out.println("\nAgora é hora de se defender!");
                keyPress(vez);
                hpHeroi -= heroi.defender(rolarDados());
            }
            vez++;
        } while (hpHeroi > 0 && hpMonstroGoblins > 0);

        if (hpMonstroGoblins <= 0) {
            System.out.println("\nVocê matou os goblis saqueadores!!!");
            segundaPartedaHistoria();
        } else if (hpHeroi < 0) {
            System.out.println("\nVocê foi morto pelos goblins saqueadores!!!");
            terminarJogo();
        }

    }

    public void segundaPartedaHistoria() {
        continuacao3();

        // colocar armadura e ganhar equipamentos

        continuacao4();
        segundaEscolha();
        int op = sc.nextInt();
        int hpOgro = 7000;
        int hpHeroi = heroi.hpHeroi;


        switch (op) {
            case 1:
                int vez = 0;
                do {
                    if (vez % 2 == 0) {
                        System.out.println("\nAgora é hora de Atacar!");
                        keyPress(vez);
                        hpOgro -= heroi.atacar(rolarDados());

                    } else {
                        System.out.println("\nAgora é hora de se defender!");
                        keyPress(vez);
                        hpHeroi -= heroi.defender(rolarDados());
                    }
                    vez++;
                } while (hpHeroi > 0 && hpOgro > 0);

                if (hpOgro <= 0) {
                    System.out.println("\nVocê matou o ogro e o burro monta num dragão e foge!!!");
                    terceiraPartedaHistoria();
                } else if (hpHeroi < 0) {
                    System.out.println("\nVocê foi esmagado pelo ogro!!!");
                    terminarJogo();
                }
                break;
            case 2:
                int i = rolarDados();
                if (i <= 5) {
                    System.out.println("Seus argumentos foram convincentes e o ogro deixou vocês passarem");
                } else {
                    System.out.println("O ogro se irritou: Você entrou no meu pântano!!");
                    vez = 0;
                    do {
                        if (vez % 2 == 0) {
                            System.out.println("\nAgora é hora de Atacar!");
                            keyPress(vez);
                            hpOgro -= heroi.atacar(rolarDados());

                        } else {
                            System.out.println("\nAgora é hora de se defender!");
                            keyPress(vez);
                            hpHeroi -= heroi.defender(rolarDados());
                        }
                        vez++;
                    } while (hpHeroi > 0 && hpOgro > 0);

                    if (hpOgro <= 0) {
                        System.out.println("\nVocê matou o ogro e o burro monta num dragão e foge!!!");
                        terceiraPartedaHistoria();
                    } else if (hpHeroi < 0) {
                        System.out.println("\nVocê foi esmagado pelo ogro!!!");
                        terminarJogo();
                    }
                    break;
                }

        }
    }

    private void terceiraPartedaHistoria() {
        continuacao5();
        int hpZumbi = 10000;
        int hpHeroi = heroi.hpHeroi;
        int vez = 0;
        do {
            if (vez % 2 == 0) {
                System.out.println("\nAgora é hora de Atacar!");
                keyPress(vez);
                hpZumbi -= heroi.atacar(rolarDados());

            } else {
                System.out.println("\nAgora é hora de se defender!");
                keyPress(vez);
                hpHeroi -= heroi.defender(rolarDados());
            }
            vez++;
        } while (hpHeroi > 0 && hpZumbi > 0);

        if (hpZumbi <= 0) {
            System.out.println("\nVocê dizimou a orda de zumbi!!!");
            terceiraPartedaHistoria();
        } else if (hpHeroi < 0) {
            System.out.println("\nVocê foi devorado pelos zumbis!!!");
            terminarJogo();
        }

    }


    public static void terminarJogo() {
        voceEstaMorto();
    }


}


