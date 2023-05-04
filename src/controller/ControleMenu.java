package controller;

import entities.Arcano;
import entities.Cacador;
import entities.Guerreiro;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static views.HistoriaView.*;
import static views.MenuView.*;

public class ControleMenu {
    Scanner sc = new Scanner(System.in);
    ControllerHeroi heroi = new ControllerHeroi();

    public static void controleInicial() {

        Scanner sc = new Scanner(System.in);
        int op00 = 0;


        introLore();

        while (op00 == 0) {
            inicialMenu();
            try {
                op00 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Errou !! (Fausto silva). Vamos começar a história mesmo assim!");
                op00 = 1;
            }

            switch (op00) {
                case 1 -> iniciarJogo();
                case 2 -> iniciarJogo();
                case 3 -> iniciarJogo();
                default -> {
                    System.out.println("Opção inválida! Mas você já sabia... Vamos começar a história mesmo assim!");
                    sc.nextLine();
                    op00 = 1;
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
        int op01 = 0;

        while (op01 == 0) {
            escolhaDeClasse();

            try {
                op01 = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nEscolha uma classe com '1', '2' ou '3'! Vamos tentar de novo...");
                sc.nextLine();
                op01 = 0;
            }

            switch (op01) {
                case 1 -> new ControleMenu().escolhaDoNomeERaca(sc, op01);
                case 2 -> new ControleMenu().escolhaDoNomeERaca(sc, op01);
                case 3 -> new ControleMenu().escolhaDoNomeERaca(sc, op01);
                default -> {
                    System.out.println("Opção inválida... só tem essas classes! Vamos novamente...");
                    op01 = 0;
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
                            2 - Escolher outra classe.""");
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme(1) ou escolha outra classe(2) para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf > 2 || conf < 0) {
                        System.out.println("\nNão tem essa opção... então vamos confirmar pra você!");
                        conf = 1;
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
                            2 - Escolher outra classe.""");
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme(1) ou escolha outra classe(2) para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf > 2 || conf < 0) {
                        System.out.println("Não tem essa opção... então vamos confirmar pra você!");
                        conf = 1;
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
                            2 - Escolher outra classe""");
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme(1) ou escolha outra classe(2) para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf > 2 || conf < 0) {
                        System.out.println("Não tem essa opção... então vamos confirmar pra você!");
                        conf = 1;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
        }

        System.out.print("\nEscolha seu nome: ");
        nome = sc.nextLine();
        impressaoLentaPorCaracter("\nQue nome peculiar...\n");

        try {
            System.out.print("\nDigite sua altura: ");
            altura = sc.nextFloat();
        } catch (InputMismatchException e) {
            impressaoLentaPorCaracter("\nPor não estar de acordo com a nossa política você será punido... vamos te atribuir a altura de um anão.");
            sc.nextLine();
            altura = 1.30f;

        }

        try {
            escolhaDeRaca();
            esc = sc.nextInt();
        } catch (InputMismatchException e) {
            impressaoLentaPorCaracter("\nInteressante escolha... vamos te atribuir como 'Elfo' e prosseguir");
            sc.nextLine();
            esc = 3;

        }

        raca = (esc == 1) ? "Humano" : (esc == 2) ? "Orc" : "Elfo";
        if (esc > 3 || esc < 1) {
            impressaoLentaPorCaracter("\nInteressante escolha... vamos te atribuir como 'Elfo' e prosseguir");
        }

        try {
            escolhaDeGenero();
            esc = sc.nextInt();
        } catch (InputMismatchException e) {
            impressaoLentaPorCaracter("\nInteressante escolha... vamos te atribuir como 'Feminino' e prosseguir");
            sc.nextLine();
            esc = 2;

        }

        genero = (esc == 1) ? "Masculino" : "Feminino";
        if (esc > 2 || esc < 1) {
            impressaoLentaPorCaracter("\nInteressante escolha... vamos te atribuir como 'Feminino' e prosseguir");
        }

        heroi.adicionarHeroi((op == 1) ? new Guerreiro(nome, 2000, altura, genero, raca)
                : (op == 2) ? new Arcano(nome, 1000, altura, genero, raca)
                : new Cacador(nome, 1500, altura, genero, raca));
        primeiraParteDaHistoria();

    }

    public void primeiraParteDaHistoria() {

        impressaoLentaPorCaracter("\n\n" + heroi.mostrarnome());
        inicioJornada();

        int op02;

        try {
            primeiraEscolha();
            op02 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por violar as nossas escolhas você será redirecionado para a opção 1");
            op02 = 1;
        }

        if (op02 == 1) {

            System.out.println("Você foi explorar o buraco e acabou caindo em uma armadilha!!!!");
            terminarJogoPorMorte();

        } else {
            continuacao2();
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
                System.out.println("\nVocê matou os goblins saqueadores!!!");
                segundaPartedaHistoria();
            } else if (hpHeroi <= 0) {
                System.out.println("\nVocê foi morto pelos goblins saqueadores!!!");
                terminarJogoPorMorte();
            }
        }
    }

    public void segundaPartedaHistoria() {
        int op03;
        int hpOgro = 7000;
        int hpHeroi = heroi.hpHeroi;
        int vez = 0;

        continuacao3();

        // colocar armadura e ganhar equipamentos

        continuacao4();
        segundaEscolha();
        try {
            op03 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por violar as nossas escolhas você será redirecionado para a opção 2");
            op03 = 2;
        }

        switch (op03) {
            case 1:
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
                } else if (hpHeroi <= 0) {
                    System.out.println("\nVocê foi esmagado pelo ogro!!!");
                    terminarJogoPorMorte();
                }
                break;
            case 2:
                int i = rolarDados();
                if (i <= 5) {
                    System.out.println("\n\nSeus argumentos foram convincentes!! O ogro deixou vocês passarem");

                    terceiraPartedaHistoria();
                } else {
                    System.out.println("\n\nVocê não deu sorte e o ogro se irritou: 'Você entrou no meu pântano!!'");

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
                    } else if (hpHeroi <= 0) {
                        System.out.println("\nVocê foi esmagado pelo ogro!!!");
                        terminarJogoPorMorte();
                    }
                    break;
                }

        }
    }

    public void terceiraPartedaHistoria() {
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
            System.out.println("\nVocê dizimou a horda de zumbis!!!");
            quartaPartedaHistoria();
        } else if (hpHeroi <= 0) {
            System.out.println("\nVocê foi devorado pelos zumbis!!!");
            terminarJogoPorMorte();
        }

    }

    public void quartaPartedaHistoria() {
        continuacao6();

        impressaoLentaPorCaracter(" " + heroi.mostrarnome() + ".");
        continuacao6_2();

        int hpLich = 15000;
        int hpHeroi = heroi.hpHeroi;
        int vez = 0;
        System.out.println("\nVamos para a batalha final!!!! ");
        do {
            if (vez % 2 == 0) {
                System.out.println("\nAgora é hora de Atacar!");
                keyPress(vez);
                hpLich -= heroi.atacar(rolarDados());

            } else {
                System.out.println("\nAgora é hora de se defender!");
                keyPress(vez);
                hpHeroi -= heroi.defender(rolarDados());
            }
            vez++;
        } while (hpHeroi > 0 && hpLich > 0);

        if (hpLich <= 0) {
            System.out.println("\nVocê nocauteou o Lich!!!");
            continuacao7();
            int op04 = 0;

            while (op04 == 0) {
                terceiraEscolha();

                try {
                    op04 = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    impressaoLentaPorCaracter("\nOpção inválida... escolha novamente.");
                    sc.nextLine();
                    op04 = 0;
                }

                if (op04 == 2) {

                    continuacao7_1();
                    terminarJogoPorMorte();
                } else {
                    continuacao7_2();
                    terminarJogo();
                }
            }
        } else if (hpHeroi <= 0) {
            System.out.println("\nVocê foi transformado zumbi!!!");
            terminarJogoPorMorte();
        }
    }

    public static void terminarJogoPorMorte() {
        voceEstaMorto();
        creditos();
    }

    public static void terminarJogo() {
        creditos();
    }

}


