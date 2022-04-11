package classesConcretas;

import java.util.ArrayList;
import java.util.List;

import classesAbstratas.Animal;
import classesAbstratas.Ave;
import classesAbstratas.Mamifero;
import interfaces.AnimalDomesticado;
import interfaces.AnimalEstimacao;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animais = criaAnimais();
		
		animaisQueEmitemSom(animais);
		animaisQueVoam(animais);
		animaisQueAmamentam(animais);
		alimentarAnimaisDomesticados(animais);
		levarAnimaisDomesticadosAoVeterinario(animais);
		chamarVeterinarioParaAnimaisDomesticados(animais);
		brincarComAnimaisEstimacao(animais);
		passearComAnimaisEstimacao(animais);	
	}
	
	public static List<Animal> criaAnimais() {
		
		List<Animal> criaAnimais = new ArrayList<Animal>();
				
		criaAnimais.add(new Cachorro("dog", "grande", "pitbul"));
		criaAnimais.add(new Cavalo("horse"));
		criaAnimais.add(new Gato("cat", "persa"));
		criaAnimais.add(new Papagaio("bird"));

		return criaAnimais;
	}
	
	public static void animaisQueEmitemSom(List<Animal> animais) {
		System.out.println("- ANIMAIS QUE EMITEM SOM:");
		for(int i = 0; i < animais.size(); i++) {		
			System.out.println(animais.get(i).emitirSom());
		}
	}
	
	public static void animaisQueVoam(List<Animal> animais) {
		System.out.println("\n- ANIMAIS QUE VOAM:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof Ave)
				System.out.println(((Ave)animais.get(i)).voar());
		}
	}
	
	public static void animaisQueAmamentam(List<Animal> animais) {
		System.out.println("\n- AMAMENTAR ANIMAIS:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof Mamifero)
				System.out.println(((Mamifero)animais.get(i)).amamentar());
		}
	}
	
	public static void alimentarAnimaisDomesticados(List<Animal> animais) {
		System.out.println("\n- ALIMENTAR ANIMAIS DOMESTICADOS:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof AnimalDomesticado)
				((AnimalDomesticado)animais.get(i)).alimentar();
		}
	}
	
	public static void levarAnimaisDomesticadosAoVeterinario(List<Animal> animais) {
		System.out.println("\n- LEVAR ANIMAIS DOMESTICADOS AO VETERINÁRIO:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof AnimalDomesticado)
				((AnimalDomesticado)animais.get(i)).levarVeterinario();
		}
	}
	
	public static void chamarVeterinarioParaAnimaisDomesticados(List<Animal> animais) {
		System.out.println("\n- CHAMAR VETERINARIO PARA ANIMAIS DOMESTICADOS:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof AnimalDomesticado)
				((AnimalDomesticado)animais.get(i)).chamarVeterinario();
		}
	}
	
	public static void brincarComAnimaisEstimacao(List<Animal> animais) {
		System.out.println("\n- BRINCAR COM ANIMAIS DE ESTIMAÇÃO:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof AnimalEstimacao)
				((AnimalEstimacao)animais.get(i)).brincar();
		}
	}
	
	public static void passearComAnimaisEstimacao(List<Animal> animais) {
		System.out.println("\n- LEVAR ANIMAIS DE ESTIMAÇÃO PARA PASSEAR:");
		for(int i = 0; i < animais.size(); i++) {
			if (animais.get(i) instanceof AnimalEstimacao)
				((AnimalEstimacao)animais.get(i)).levarPassear();
		}
	}
}
