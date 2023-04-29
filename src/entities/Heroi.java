package entities;

import repository.GameRepository;

public abstract class Heroi implements GameRepository {
    private String nome;
    private int hp;
    private int stamina;
    private int mana;
    private float altura;
    private String gender;
    private String raca;

    public Heroi(String nome, int hp, int stamina, int mana, float altura, String gender, String raca) {
        this.nome = nome;
        this.hp = hp;
        this.stamina = stamina;
        this.mana = mana;
        this.altura = altura;
        this.gender = gender;
        this.raca = raca;
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

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int atacar() {
        return 0;
    }

    public int defender() {
        return 0;
    }
}
