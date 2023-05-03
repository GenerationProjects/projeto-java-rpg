package controller;

import entities.Heroi;
import repository.HeroiRepository;

import java.util.ArrayList;

public class ControllerHeroi implements HeroiRepository {

	private ArrayList<Heroi> herois = new ArrayList<>();
	int hpHeroi;

	@Override
	public void adicionarHeroi(Heroi heroi) {
		herois.add(heroi);
	}

	@Override
	public String mostrarnome() {
		String nome = "";
		for (Heroi heroi : herois) {
			nome = heroi.getNome();
			hpHeroi = heroi.getHp();
		}
		return nome;
	}

	@Override
	public int atacar(int dado) {
		if (dado == 1) {
			System.out.println("O monstro se defendeu!");
			return 0;
		} else if (dado > 1 && dado < 7) {
			System.out.println("O seu ataque quase não deu dano e o goblin riu da sua cara!");
			return 1000;
		} else if (dado > 7 && dado < 20) {
			System.out.println("O seu ataque deu bastante dano, mas não matou o goblin, o que o deixou enfurecido!");
			return 3000;
		} else if (dado == 20) {
			System.out.println("O seu ataque foi tão forte que matou o goblin na hora!");
			return 5000;
		}
		return dado;
	}
	
	@Override
	public int defender(int dado) {
		if (dado == 1) {
			System.out.println("Você tomou muito dano e morreu.");
			return 2000;
		} else if (dado > 1 && dado < 7) {
			System.out.println("Você tomou bastante dano, mas não morreu!");
			return 900;
		} else if (dado > 7 && dado < 20) {
			System.out.println("Você quase não tomou dano e riu da cara do goblin!");
			return 300;
		} else if (dado == 20) {
			System.out.println("A sua defesa foi tão boa que você não levou dano!");
			return 0;
		}
		return dado;
	}

}
