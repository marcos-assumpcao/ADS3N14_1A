package controller;

import view.View;

public class Main {
	public static void main(String[] args){
		View imprime = new View();
		HeapSort heapSort = new HeapSort();
		SelectionSort selectionSort = new SelectionSort();
		int [] numeros = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10}; 
		//HeapSort
		System.out.println("Heap Sort");
		System.out.println("Antes da ordenacao:");
		imprime.ImprimeInfo(numeros);

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(numeros);
		imprime.ImprimeInfo(numeros);
		imprime.ImprimeComp(HeapSort.matriz.getComparacao());
		//SelectionSort
		System.out.println("Selection Sort");
		System.out.println("Antes da ordenacao:");
		imprime.ImprimeInfo(numeros);

		System.out.println("\n\nDepois da ordenacao:");
		selectionSort.selectionSort(numeros);
		imprime.ImprimeInfo(numeros);
		imprime.ImprimeComp(SelectionSort.matriz.getComparacao());
	}
}