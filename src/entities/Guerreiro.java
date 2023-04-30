package entities;

public class Guerreiro extends Heroi {
    private int resistencia;

    public Guerreiro(String nome, int hp, int stamina, int mana, float altura, String gender, String raca, int resistencia) {
        super(nome, hp, stamina, mana, altura, gender, raca);
        this.resistencia = resistencia;
    }




}

