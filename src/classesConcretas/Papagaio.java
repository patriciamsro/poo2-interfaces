package classesConcretas;

import classesAbstratas.Ave;

public class Papagaio extends Ave {

	public Papagaio(String nome) {
		super(nome);
	}

	@Override
	public String voar() {
		return "Papagaio voa."; 
	}
	
	@Override
	public String emitirSom() {
		return "Papagaio emite som (Curupaco paco!).";
	}
}
