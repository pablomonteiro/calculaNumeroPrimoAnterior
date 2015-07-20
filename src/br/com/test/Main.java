package br.com.test;

public class Main {

	private static final int NUMBER = 11;
	
	private static int buscaNumeroPrimoAnterior(int num){
		
		int numeroAnterior = num - 1;
		return retornaPrimoAnterior(numeroAnterior);
	}
	
	private static int retornaPrimoAnterior(int num){

		if (ehNumeroPrimo(num, num - 1))
			return num;
		return retornaPrimoAnterior(num - 1);
		
	}
	
	private static boolean ehNumeroPrimo(int num, int ant){

		if(num == 1) {return true;}
		if(ant == 1) {return true;}
		return (num % ant == 0) ? false : ehNumeroPrimo(num, ant - 1);
	}
	
	public static void main(String[] args) {
		
		int numeroPrimoAnterior = buscaNumeroPrimoAnterior(NUMBER);
		System.out.println(numeroPrimoAnterior);
		
	}

}
