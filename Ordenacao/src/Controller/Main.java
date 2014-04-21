package controller;

import view.ViewHeap;
import view.ViewSelection;

public class Main {
	public static void main(String[] args){
		ViewHeap imprimeHeap = new ViewHeap();
		ViewSelection imprimeSelection = new ViewSelection();
		HeapSort heapSort = new HeapSort();
		SelectionSort selectionSort = new SelectionSort();
		
		int [] numerosHeap = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10};
		int [] numerosSelection = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10};
		//HeapSort
		System.out.println("Heap Sort");
		System.out.println("Antes da ordenacao:");
		imprimeHeap.ImprimeInfo(numerosHeap);

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(numerosHeap);
		imprimeHeap.ImprimeInfo(numerosHeap);
		imprimeHeap.ImprimeComp(HeapSort.matriz.getComparacao());
		
		//SelectionSort
		System.out.println("\nSelection Sort");
		System.out.println("Antes da ordenacao:");
		imprimeSelection.ImprimeInfo(numerosSelection);

		System.out.println("\n\nDepois da ordenacao:");
		selectionSort.selectionSort(numerosSelection);
		imprimeSelection.ImprimeInfo(numerosSelection);
		imprimeSelection.ImprimeComp(SelectionSort.matriz.getComparacao());
	}
}