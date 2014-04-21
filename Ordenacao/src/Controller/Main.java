package controller;

import view.ViewHeap;
import view.ViewSelection;

public class Main {
	public static void main(String[] args){
		ViewHeap imprimeHeap = new ViewHeap();
		ViewSelection imprimeSelection = new ViewSelection();
		HeapSort heapSort = new HeapSort();
		SelectionSort selectionSort = new SelectionSort();

		//HeapSort
		System.out.println("--------- Heap Sort ---------");
		System.out.println("Antes da ordenacao:");
		heapSort.iniciaMatrizHeap();
		imprimeHeap.ImprimeInfo(HeapSort.matrizHeap.getMatriz());

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(HeapSort.matrizHeap.getMatriz());
		imprimeHeap.ImprimeInfo(HeapSort.matrizHeap.getMatriz());
		imprimeHeap.ImprimeComp(HeapSort.matrizHeap.getComparacao());
		
		//SelectionSort
		System.out.println("\n------ Selection Sort -------");
		System.out.println("Antes da ordenacao:");
		selectionSort.iniciaMatrizSelect();
		imprimeSelection.ImprimeInfo(SelectionSort.matrizSelect.getMatriz());

		System.out.println("\n\nDepois da ordenacao:");
		selectionSort.selectionSort(SelectionSort.matrizSelect.getMatriz());
		imprimeSelection.ImprimeInfo(SelectionSort.matrizSelect.getMatriz());
		imprimeSelection.ImprimeComp(SelectionSort.matrizSelect.getComparacao());

	}
}