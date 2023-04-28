package entities;

public class Arcano extends Heroi {

    private int inteligencia;

    public Arcano(String nome, int hp, int stamina, int mana, float altura, String gender, String raca, int inteligencia) {
        super(nome, hp, stamina, mana, altura, gender, raca);
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
