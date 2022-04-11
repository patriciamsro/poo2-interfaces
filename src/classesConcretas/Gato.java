package classesConcretas;

import classesAbstratas.Mamifero;
import interfaces.AnimalDomesticado;
import interfaces.AnimalEstimacao;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	String raca;
	
	public Gato(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}

	@Override
	public String amamentar() {
		return "Gato amamentado.";
	}

	@Override
	public String emitirSom() {
		return "Gato emite som (Miau!).";
	}
	
	@Override
	public void alimentar() {
		System.out.println("Gato alimentado.");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Gato foi ao veterinário.");
	}

	@Override
	public void chamarVeterinario() {
		System.out.println("Veterinário especialista em gato foi chamadoo.");
	}
	
	@Override
	public void brincar() {
		System.out.println("Gato brincou.");
	}

	@Override
	public void levarPassear() {
		System.out.println("Gato passeou.");
	}

}
