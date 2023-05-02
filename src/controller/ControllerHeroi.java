package controller;

import java.util.ArrayList;

import entities.Heroi;
import repository.HeroiRepository;

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

}
