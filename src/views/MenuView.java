package views;

import java.util.concurrent.TimeUnit;

public class MenuView {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void loreInicial() {
        String inicio = """	
                Terra média SÉC XIV.
                                
                Bem vindo ao reino de Helmont um mundo mágico repleto de montanhas congeladas 
                , planícies, pântanos obscuros e criaturas místicas, que é governado pelo 
                Rei Calander Ultric.
                """;
        impressaoLentaPorCaracter(inicio);
    }


    public static void inicialMenu() {
        String menuInicial = """
                 
                 _________________________________________________
                |                                                |
                |            Bem Vindos Helmont Adventure        |
                |              Escolhas as opções                |
                |                                                |
                |                1 - Jogar                       |
                |                2 - Claro                       |
                |                3 - Com certeza                 |
                |                                                |             
                |                                                |
                |________________________________________________|
                Digite a opção acima: """;
        System.out.print(ANSI_RED + menuInicial);
    }

    public static void escolhaDeClasse() {
        String menuClasses = """
                 
                 _________________________________________________
                |                                                |
                |              Escolha a sua classe              |
                |                                                |
                |                                                |
                |                1 - Guerreiro                   |
                |                2 - Arcano                      |
                |                3 - Arqueiro                    |
                |                                                |            
                |                                                |
                |________________________________________________|
                Escolha uma classe: """;
        System.out.print(ANSI_RED + menuClasses);
    }

    public static void impressaoLentaPorCaracter(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            System.out.print(ANSI_BLUE + c);
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (Exception e) {

            }
        }

    }

}
