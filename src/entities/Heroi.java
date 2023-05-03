package entities;

public class Heroi {

	private String nome;
	private int hp;
	private float altura;
	private String gender;
	private String raca;

	public Heroi(String nome, int hp, float altura, String gender, String raca) {
		this.nome = nome;
		this.hp = hp;
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
}
