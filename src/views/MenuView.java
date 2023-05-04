package views;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MenuView {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void inicialMenu() {
        String menuInicial = """

                 _________________________________________________
                |                                                |
                |     ⚔️ Bem Vindos ao Helmont Adventure ⚔️      |
                |              Escolha as opções                 |
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
                |                3 - Caçador                     |
                |                                                |
                |                                                |
                |________________________________________________|
                Escolha uma classe: """;
        System.out.print(ANSI_RED + menuClasses);
    }

    public static void escolhaDeRaca() {
        String menuRacas = """

                 _________________________________________________
                |                                                |
                |              Escolha a sua raça                |
                |                                                |
                |                                                |
                |                1 - Humano                      |
                |                2 - Orc                         |
                |                3 - Elfo                        |
                |                                                |
                |                                                |
                |________________________________________________|
                Escolha uma raça: """;
        System.out.print(ANSI_RED + menuRacas);
    }

    public static void escolhaDeGenero() {
        String menuGeneros = """

                 _________________________________________________
                |                                                |
                |              Escolha seu gênero                |
                |                                                |
                |                                                |
                |                                                |
                |                1 - Masculino                   |
                |                2 - Feminino                    |
                |                                                |
                |                                                |
                |                                                |
                |________________________________________________|
                Escolha um gênero: """;
        System.out.print(ANSI_RED + menuGeneros);

    }

    public static void loreGuerreiro() {
        System.out.println("""


                Os Guerreiros são os mais fortes do reino. A origem dos guerreiros é obscura, mas muitos
                acreditam que ela surgiu em resposta às constantes guerras e conflitos que assolavam as
                terras. Em tempos de paz, serviam como protetores dos reinos, patrulhando fronteiras e
                defendendo cidades contra invasores.

                Lista de ataques:
                Golpe supurante
                Corte profundo
                Apunhalada
                """);
    }

    public static void loreCacador() {
        System.out.println("""

                Os Caçadores são combatentes treinados para o longo alcance. A origem é incerta, mas muitos
                acreditam que eles surgiram entre os povos das florestas, que dependiam da caça para sobreviver.
                Com o tempo se tornaram lutadores habilidosos, capazes de atirar flechas com precisão mortal.



                Lista de ataques:
                Chuva de flechas
                Tiro certeiro
                Flecha flamejante

                """);
    }


    public static void primeiraEscolha() {
        String menuEscolha1 = """

                 _________________________________________________
                |                                                |
                |                    Escolha                     |
                |                                                |
                |                                                |
                |                                                |
                |              1 - Entrar no buraco              |
                |              2 - Continuar seu caminho         |
                |                                                |
                |                                                |
                |                                                |
                |________________________________________________|
                Escolha uma das opções: """;
        System.out.print(ANSI_RED + menuEscolha1);

    }

    public static void segundaEscolha() {
        String menuEscolha2 = """

                 _________________________________________________
                |                                                |
                |                    Escolha                     |
                |                                                |
                |                                                |
                |                                                |
                |          1 - Enfrentar e matar                 |
                |          2 - Tentar convencer com argumentos   |
                |                                                |
                |                                                |
                |                                                |
                |________________________________________________|
                Escolha uma das opções: """;
        System.out.print(ANSI_RED + menuEscolha2);

    }

    public static void terceiraEscolha() {
        String menuEscolha3 = """

                 _________________________________________________
                |                                                |
                |                    Escolha                     |
                |                                                |
                |                                                |
                |              1 - Poupar o lich                 |
                |              2 - Matar o lich                  |
                |                                                |
                |                                                |
                |                                                |
                |                                                |
                |________________________________________________|
                Escolha uma das opções: """;
        System.out.print(ANSI_RED + menuEscolha3);
    }

    public static void voceEstaMorto() {
        String morreu = """
                 
                 _________________________________________________
                |                                                |
                |                                                |
                |                                                |
                |                                                |
                |          	💀 VOCE ESTA MORTO 💀               |
                |                 FIM DE JOGO                    |
                |                                                |
                |                                              	 |
                |                                                |
                |________________________________________________|
                """;
        System.out.println(ANSI_RED + morreu);

    }


    public static void keyPress(int vez) {

        try {
            System.out.println((vez % 2 == 0) ? ANSI_RED + "\nPressione Enter para rolar os dados..."
                    : ANSI_BLUE + "\nPressione Enter para rolar os dados...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
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

    public static void creditos() {
        String creditos = """
                                
                 ______________________________________________
                |                                              |
                |                     Staff                    |
                |                                              |
                |              Ana Rosa Fernandes              |
                |                Felipe Sousa                  |
                |                 Roger Ramos                  |
                |               Sofia Marchetti                |
                |                Pedro Campos                  |
                |               Ricardo Marinho                |
                |                                              |
                |                                              |
                |                  © 2023                      |
                |______________________________________________|
                """;

        impressaoLentaPorCaracter(creditos);
    }
}