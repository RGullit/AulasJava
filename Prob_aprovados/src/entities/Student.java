package entities;

public class Student {
	
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	private boolean isAproved;
	
	public Student(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.setMedia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota1;
	}

	public void setNota2(double nota1) {
		this.nota1 = nota1;
	}

	public double getMedia() {
		return media;
	}
	
	public void setMedia() {
		media = (nota1 + nota2) / 2;
		if (media >= 6.0) {
			isAproved = true;
		} else {
			isAproved = false;

		}
	}

	public boolean isAproved() {
		return isAproved;
	}
	
}
