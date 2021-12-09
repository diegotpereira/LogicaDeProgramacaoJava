package br.com.java;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calcular o índice de massa corporal");
		
		System.out.println("Digite seu peso (em Kg): ");
		float peso = teclado.nextFloat();
		
		System.out.println("Digite sua altura (em metros): ");
		float altura = teclado.nextFloat();
		
		float alturaTotal = altura * altura;
		
		float indiceMassaCorporal = peso / alturaTotal;
		
		System.out.println("Seu IMC é: " + indiceMassaCorporal);
		
		  if (indiceMassaCorporal < 18.5)
	             System.out.println ("Abaixo do peso ideal, vamos melhorar!");
		  
	        else if ((indiceMassaCorporal > 18.5) &&(indiceMassaCorporal <24.9))
	             System.out.println ("Voce esta no peso ideal, parabens!");
		  
	        else if ((indiceMassaCorporal > 25.0)&& (indiceMassaCorporal <29.9))
	             System.out.println("Voce está com excesso de peso, vamos melhorar!");
		  
	        else if ((indiceMassaCorporal > 30.0) && (indiceMassaCorporal <39.9))
	             System.out.println("Obesidade Classe I, cuidado!");
		  
	        else if ((indiceMassaCorporal > 35.0) && (indiceMassaCorporal <39.9))
	             System.out.println ("Obesidade Classe II, ainda temos como mudar isso!");
		  
	        else if (indiceMassaCorporal >= 40)
	             System.out.println ("Obesidade Classe III, procure ajuda, nada está perdido!");
		  
		teclado.close();

	}

}
