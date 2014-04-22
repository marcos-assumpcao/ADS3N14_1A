package controller;

import view.View;

/**
 * @author Marcos Assumpcao
 *
 */
public class Main {
	public static void main(String[] args){
		View imprime = new View();
		HeapSort heapSort = new HeapSort();
		SelectionSort selectionSort = new SelectionSort();

		//HeapSort
		System.out.println("--------- Heap Sort ---------");
		System.out.println("Antes da ordenacao:");
		heapSort.iniciaMatrizHeap();
		imprime.ImprimeInfo(HeapSort.vetorHeap.getMatriz());

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(HeapSort.vetorHeap.getMatriz());
		imprime.ImprimeInfo(HeapSort.vetorHeap.getMatriz());
		imprime.ImprimeComp(HeapSort.vetorHeap.getComparacao());
		
		//SelectionSort
		System.out.println("\n------ Selection Sort -------");
		System.out.println("Antes da ordenacao:");
		selectionSort.iniciaMatrizSelect();
		imprime.ImprimeInfo(SelectionSort.vetorSelect.getMatriz());

		System.out.println("\n\nDepois da ordenacao:");
		selectionSort.selectionSort(SelectionSort.vetorSelect.getMatriz());
		imprime.ImprimeInfo(SelectionSort.vetorSelect.getMatriz());
		imprime.ImprimeComp(SelectionSort.vetorSelect.getComparacao());

	}
}
