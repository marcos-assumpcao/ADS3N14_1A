package View;

import Model.Matriz;

public class View {
	Matriz matriz = new Matriz();
	public void ImprimeInfo(int[] numeros){ 
		for (int n : numeros){  
			System.out.print(" " + n);	
		}
	}
	
	public void ImprimeComp(int comparacao){
		System.out.println("\nComparaçãoes: "+ comparacao);
	}
}