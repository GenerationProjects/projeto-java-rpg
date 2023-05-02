package views;

import java.util.concurrent.TimeUnit;

public class MenuView {

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public static void introLore() {
		String intro = """
				Terra média SÉC XIV.

				Bem-vindo ao reino de Helmont: um mundo mágico repleto de montanhas congeladas, 
				planícies, pântanos obscuros e criaturas místicas, governado pelo rei Calander Ultric, 
				que tem punhos fortes, é ambicioso e dominador. Casado com a rainha Nefereti Belmond, 
				tem três filhos: Nagiel, Aquio e Estrid.
				""";
		impressaoLentaPorCaracter(intro);
	}

	public static void loreInicial() {
		String inicio = """
				Em uma noite de comemoração de suas vitórias em campo de batalha, o rei Ultric convoca 
				seu bobo da corte para alegrar a festa com seus contos, e durante uma de suas histórias, 
				a rainha se sente insultada pelas palavras proferidas vindas do bobo. O rei observando a 
				cena, para preservar a honra de sua rainha, ordena que matem o responsável pelas histórias, 
				e jogue seus restos no pântano de Breakwood.

				A jornada se inicia em um pequeno vilarejo ao norte de Helmont, onde seu povoado estava se 
				destacando e caminhando para a independência, fugindo das mãos do rei Ultric. Com isso, houve 
				uma retaliação por parte do rei ao povo da Kocorico Village.
				""";
		impressaoLentaPorCaracter(inicio);
	}

	public static void inicialMenu() {
		String menuInicial = """

				 _________________________________________________
				|                                                |
				|          Bem Vindos ao Helmont Adventure       |
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

	public static void loreArcanista() {
		System.out.println("""
				Os Arcanistas são uma ordem de magos que usam poderes místicos. Surgiram das sociedades 
				antigas, que se dedicaram às pesquisas e ao estudo de magia. Com o tempo, esses estudiosos 
				se tornaram capazes de controlar a energia mágica a seu favor, usando para realizar grandes 
				feitos e mudar o curso das coisas.
				
				Lista de ataques:
				Orbe explosivo
				Chuva de espadas arcana
				Saraivada mágica
				""");
	}

	public static void inicioJornada() {

		impressaoLentaPorCaracter("""
				Você acorda com fortes dores pelo corpo e cabeça, e não se lembra de nada, só carregando as 
				roupas do corpo, e olhando ao redor, tudo o que vê são destroços e poças de sangue.
				Andando por aquelas ruínas, se depara com uma abertura no chão:
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
				|                                                |
				|               1 - Poupar o lich                |
				|               2 - Matar o lich                 |
				|               3 - Matar o rei e o lich         |
				|                                                |
				|                                                |
				|________________________________________________|
				Escolha uma das opções: """;
		System.out.print(ANSI_RED + menuEscolha3);
	}

	public static void impressaoLentaPorCaracter(String texto) {
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			System.out.print(ANSI_BLUE + c);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (Exception e) {

			}
		}
	}
}