package Controller;

import View.View;

public class Main {
	public static void main(String[] args){
		View imprime = new View();
		HeapSort heapSort = new HeapSort();
		int [] numeros = new int[]{1, 7, 5, 4, 2, 9, 3, 8, 6, 0}; 
		
		System.out.println("Antes da ordenacao:");
		imprime.ImprimeInfo(numeros);

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(numeros);
		imprime.ImprimeInfo(numeros);
		imprime.ImprimeComp(HeapSort.matriz.getComparacao());
	}
}
