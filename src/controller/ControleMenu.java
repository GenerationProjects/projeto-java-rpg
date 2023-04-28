package controller;

import java.util.Scanner;

import static views.MenuView.*;

public class ControleMenu {

    public static void controleInicial() {

        Scanner sc = new Scanner(System.in);
        int op;

        loreInicial();

        inicialMenu();
        op = sc.nextInt();
        switch (op) {
            case 1 -> System.out.println("");
            case 2 -> System.out.println("");
            case 3 -> System.out.println("");
            default -> throw new IllegalArgumentException("Unexpected value: " + op);
        }
    }


}
