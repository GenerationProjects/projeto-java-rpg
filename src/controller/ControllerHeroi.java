package controller;

import entities.Heroi;
import repository.HeroiRepository;

import java.util.ArrayList;

public class ControllerHeroi implements HeroiRepository {

	private ArrayList<Heroi> herois = new ArrayList<>();

	@Override
	public void adicionarHeroi(Heroi heroi) {
		herois.add(heroi);
	}

	@Override
	public String mostrarnome() {
		String nome = "";
		for (Heroi heroi : herois) {
			nome = heroi.getNome();
		}
		return nome;
	}


	@Override
	public int atacar(int dano) {
		if (dano == 1) {
			System.out.println("O montro se defendeu!");
			return 0;
		} else if (dano > 1 && dano < 7) {
			System.out.println("O seu ataque quase não deu dano e o goblin riu da sua cara!");
			return 1000;
		} else if (dano > 7 && dano < 20) {
			System.out.println("O seu ataque deu bastante dano, mas não matou o goblin, o que o deixou enfurecido!");
			return 3000;
		} else if (dano == 20) {
			System.out.println("O seu ataque foi tão forte que matou o goblin na hora!");
			return 5000;
		}
		return dano;
	}


}
