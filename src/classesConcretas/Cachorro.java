package classesConcretas;

import classesAbstratas.Mamifero;
import interfaces.AnimalDomesticado;
import interfaces.AnimalEstimacao;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

	String tamanho;
	String raca;

	public Cachorro(String nome, String tamanho, String raca) {
		super(nome);
		this.tamanho = tamanho;
		this.raca = raca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String amamentar() {
		return "Cachorro amamentado.";
	}
	
	@Override
	public String emitirSom() {
		return "Cachorro emite som (Au au!).";
	}
	
	@Override
	public void alimentar() {
		System.out.println("Cachorro alimentado.");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Cachorro foi ao veterinário.");
	}
	
	@Override
	public void chamarVeterinario() {
		System.out.println("Veterinário especialista em cachorro foi chamadoo.");
	}
	
	@Override
	public void brincar() {
		System.out.println("Cachorro brincou.");
	}
	
	@Override
	public void levarPassear() {
		System.out.println("Cachorro passeou.");
	}
}
