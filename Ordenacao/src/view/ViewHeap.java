package view;

import model.Matriz;

public class ViewHeap {
	Matriz matriz = new Matriz();
	public void ImprimeInfo(int[] numeros){ 
		for (int n : numeros){  
			System.out.print(" " + n);	//
		}
	}
	
	public void ImprimeComp(int comparacao){
		System.out.println("\nComparacoes: "+ comparacao);
	}
}