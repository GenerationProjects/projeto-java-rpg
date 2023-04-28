package entities;

public class Monstro {
    private String nome;
    private int hp;

    public Monstro(String nome, int hp) {
        this.nome = nome;
        this.hp = hp;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
