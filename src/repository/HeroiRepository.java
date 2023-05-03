package repository;

import entities.Heroi;

public interface HeroiRepository {

    public void adicionarHeroi(Heroi herois);
    public String mostrarnome();

    public int atacar(int dano);
    
    public int defender(int defesa);

}
