package br.com.java;

public class IteracaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		
		while (i < 10) {
			
			if (i == 5) {
				System.out.println("Vai continuar...");
				i++;
				continue;
			}
			
			System.out.println(i + ": Um texto qualquer...");
			i++;
		}

	}

}
