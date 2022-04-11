package classesConcretas;

import classesAbstratas.Mamifero;
import interfaces.AnimalDomesticado;

public class Cavalo extends Mamifero implements AnimalDomesticado{

	public Cavalo(String nome) {
		super(nome);
	}

	@Override
	public String amamentar() {
		return "Cavalo amamentado.";
	}
	
	@Override
	public String emitirSom() {
		return "Cavalo emite som (Hiin in in!).";
	}
	
	@Override
	public void alimentar() {
		System.out.println("Cavalo alimentado.");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Cavalo foi ao veterinário.");
	}
	
	@Override
	public void chamarVeterinario() {
		System.out.println("Veterinário especialista em cavalo foi chamadoo.");
	}
}
