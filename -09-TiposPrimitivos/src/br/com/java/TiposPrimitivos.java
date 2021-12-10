package br.com.java;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
        String variavelString = ""; // o tipo String n�o possui um tipo primitivo equivalente
		
		byte variavelByte = 1; // o tipo byte, assim como os outros primitivos, n�o pode manter um estado de aus�ncia de valor. Lembrando que aus�ncia de valor � representada pela palavra null que significa nulo.
		
		short variavelShort = 1;
		
		int variavelInteger = 1; // o tipo normal de int � Integer
		
		long variavelLong = 1L;
		
		float variavelFloat = 1.0f;
		
		double variavelDouble = 1.0;
		
		char variavelCharacter = 'A'; // o tipo normal de char � Character 
		
		boolean variavelBoolean = true;
		
		System.out.println("o valores do tipo primitivo s�o "
				           + "\nTipo String: " + variavelString
				           + "\nTipo byte: " + variavelByte
				           + "\nTipo Short: " + variavelShort
				           + "\nTipo Intger: " + variavelInteger
				           + "\nTipo Float: " + variavelFloat
				           + "\nTipo Double: " + variavelDouble
				           + "\nTipo Boolean: " + variavelBoolean);

	}

}
