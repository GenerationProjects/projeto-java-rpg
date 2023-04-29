package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import static views.MenuView.*;

public class ControleMenu {

    public static void controleInicial() {

        try {
            Scanner sc = new Scanner(System.in);
            int op = 0;

            introLore();
            inicialMenu();
            op = sc.nextInt();

            do {
                switch (op) {
                    case 1 -> iniciarJogo();
                    case 2 -> iniciarJogo();
                    case 3 -> iniciarJogo();
                    default -> System.out.println("valor inesperado: " + op);
                }

            } while (op < 1 || op > 4);

        } catch (InputMismatchException e) {
            System.out.println("Somente números !!");
        }

    }

    //Metodo para iniciar jogo.
    public static void iniciarJogo() {
        loreInicial();


        escolhaDeClasse();


    }

}
