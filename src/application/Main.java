package application;

import java.util.Locale;

import static controller.ControleMenu.controleInicial;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        controleInicial();
    }
}
