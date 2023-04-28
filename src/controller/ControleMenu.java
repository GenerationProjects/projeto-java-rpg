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


            switch (op) {
                case 1 -> iniciarJogo();
                case 2 -> iniciarJogo();
                case 3 -> iniciarJogo();
                default -> throw new IllegalArgumentException("Unexpected value: " + op);
            }
        } catch (InputMismatchException e) {
            System.out.println("Errou !! (Fausto silva)");
            inicialMenu();
            controleInicial();
        } catch (IllegalArgumentException ex) {

        }
    }


    public static void iniciarJogo() {
        loreInicial();

        escolhaDeClasse();


    }

}
