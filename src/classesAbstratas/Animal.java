package classesAbstratas;

public abstract class Animal {

	String nome;
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract String emitirSom();
	
}
