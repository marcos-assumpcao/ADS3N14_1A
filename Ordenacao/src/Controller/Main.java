package controller;

import view.View;

public class Main {
	public static void main(String[] args){
		View imprime = new View();
		HeapSort heapSort = new HeapSort();
		SelectionSort selectionSort = new SelectionSort();

		//HeapSort
		System.out.println("--------- Heap Sort ---------");
		System.out.println("Antes da ordenacao:");
		heapSort.iniciaMatrizHeap();
		imprime.ImprimeInfo(HeapSort.matrizHeap.getMatriz());

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(HeapSort.matrizHeap.getMatriz());
		imprime.ImprimeInfo(HeapSort.matrizHeap.getMatriz());
		imprime.ImprimeComp(HeapSort.matrizHeap.getComparacao());
		
		//SelectionSort
		System.out.println("\n------ Selection Sort -------");
		System.out.println("Antes da ordenacao:");
		selectionSort.iniciaMatrizSelect();
		imprime.ImprimeInfo(SelectionSort.matrizSelect.getMatriz());

		System.out.println("\n\nDepois da ordenacao:");
		selectionSort.selectionSort(SelectionSort.matrizSelect.getMatriz());
		imprime.ImprimeInfo(SelectionSort.matrizSelect.getMatriz());
		imprime.ImprimeComp(SelectionSort.matrizSelect.getComparacao());

	}
}