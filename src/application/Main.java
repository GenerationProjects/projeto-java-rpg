package application;

import java.util.Locale;

import controller.ControleMenu;

public class Main {
    public static void main(String[] args) throws Exception {
    	ControleMenu sl = new ControleMenu();
        Locale.setDefault(Locale.US);
        sl.continuacao();
    }
}
