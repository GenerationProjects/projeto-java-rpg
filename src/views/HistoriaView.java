package views;

import static views.MenuView.impressaoLentaPorCaracter;

public class HistoriaView {

    public static void introLore() {
        String intro = """
                Terra média SÉC XIV.

                Bem-vindo ao reino de Helmont: um mundo mágico repleto de montanhas congeladas,
                planícies, pântanos obscuros e criaturas místicas. Calander Ultric, um rei 
                que governa com punhos fortes, é ambicioso e dominador. Casado com a 
                rainha Nefereti Belmond, tem três filhos: Nagiel, Aquio e Estrid.

                                
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
                 acorda com fortes dores pelo corpo e cabeça, e não se lembra de nada, só carregando as
                roupas do corpo, e olhando ao redor, tudo o que vê são destroços e poças de sangue.
                Andando por aquelas ruínas, se depara com uma abertura no chão:

                """);
    }

    public static void continuacao2() {
        impressaoLentaPorCaracter("""

                …ignorando a abertura, você continua a explorar a cidade para encontrar itens
                de sobrevivência como comida e água, e para entender o que aconteceu
                durante seu apagão.

                Você entra em uma taverna e lá consegue informações sobre o ocorrido,
                mas ainda sem recuperar suas lembranças continua a caminhar para o outro lado da vila e
                se depara com goblins saqueadores.

                Começa uma luta
                	""");
    }

    public static void continuacao3() {
        impressaoLentaPorCaracter("""

                Vasculhando o corpo do goblin acha uma espécie de mapa. Seguindo-o você se
                depara com uma caverna, e encontra um portão de metal e uma pilha de armamentos
                que de algum modo eram perfeitos para seu personagem.
                """);
    }

    public static void continuacao4() {
        impressaoLentaPorCaracter("""

                Seguindo sua jornada e ainda sem lembranças, você não vê opção a não ser seguir
                uma longa estrada, e ao longe avista o castelo do Rei Utric. Os habitantes te
                reconhecem, as memórias vão voltando aos poucos, e logo um velho sábio explica
                o ocorrido com a vila, onde a fúria de um Lich passou e ressuscitou os mortos
                que haviam pelo caminho.

                O rei te convoca e ordena que entre na expedição para a caçada ao Lich em direção
                ao pantano de Breakwood. Em meio à viagem, o grupo formado por Ultric precisa
                atravessar a grande Floresta da Penumbra, que tem como guardião um grande ogro
                e um burro, e só aqueles com permissão dos dois podem passar.
                """);
    }

    public static void continuacao5() {
        impressaoLentaPorCaracter("""

                Passando pela floresta, o grupo avista o Forte do Lich em meio ao pântano
                repleto de zumbis protegendo o local, e a única opção é lutar contra esse
                exército. Os heróis se aproximam dos zumbis brandindo suas espadas com terminação.
                Você ataca o primeiro zumbi, acertando-o em cheio e destruindo-o.
         
                Os zumbis avançam em direção aos heróis, com suas mãos e dentes em riste. Eles
                se dividem em dois grupos e os atacam derrubando e transformando 3 dos 10 do
                grupo.

                Início da batalha.

                """);
    }

    public static void continuacao6() {
        impressaoLentaPorCaracter("""
                                
                O Lich permanece no fundo da sala, observando a batalha com um sorriso malicioso.
                Ele conjura um raio de energia em direção aos heróis, derrubando a maioria deles,
                e sobrando apenas o rei Ultric e   """);
    }

    public static void continuacao6_2() {
        impressaoLentaPorCaracter("""
                                
                Ali começa uma batalha do herói e do rei, que decidirá o futuro do reino contra o
                Lich.
                  """);
    }

    public static void continuacao7() {
        impressaoLentaPorCaracter("""
                                
                Ao fim da batalha, o lich se ajoelha com ódio em seus olhos, culpando o rei de todo
                o mal que acontece nas terra de Helmont, ele então olha para o herói, e com uma magia
                o faz ter visões de tudo que o lich passou e presenciou durante anos servindo a Coroa
                como bobo da corte, e como foi morto brutalmente por uma simples piada, o lich conta ao
                herói sobre os planos do rei contra os povos mais pobres do reino.
                                
                Você fica pasmo com as visões e com o impacto que a magia teve em seu cérebro e recupera
                todas suas memórias. Ultric fica enfurecido e começa a gritar e dizer para o herói não cair
                nas manipulações do lich e o finalizar ele logo.
                                
                Você se lembra da chacina que os soldados do rei fizeram na vila de Breakwood e sem pensar
                duas vezes ataca o rei Ultric o matando na mesma hora. O lich solta uma gargalhada e diz
                que esperou a vida toda por isso.
                                
                """);
    }

    public static void continuacao7_1() {
        impressaoLentaPorCaracter("""
                                
                O herói mata o lich porque, mesmo sendo grande parte culpa do rei, o bobo da corte também
                matou pessoas inocentes em busca de sua vingança. Ao morrer, o lich entoa uma magia em uma
                língua desconhecida te amaldiçoando, que acaba caindo, agonizando em dor.
                                
                Estrid, o filho mais velho e sucessor à coroa, passa a governar o reino substituindo seu pai.
                                
                FIM!
                                
                """);
    }

    public static void continuacao7_2() {
        impressaoLentaPorCaracter("""
                                
                O herói poupa o lich e juntos levam o reino de Helmont ao caos, agora dominado por cadáveres.
                                
                FIM!
                """);
    }

}
