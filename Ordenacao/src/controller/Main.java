package controller;

import view.View;

/**
 * @author Marcos Assumpcao
 * Faculdade Senac Porto Alegre
 * Algoritmos e Programacao 3
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
		heapSort.iniciaVetorHeap();
		imprime.ImprimeInfo(HeapSort.vetorHeap.getVetor());

		System.out.println("\n\nDepois da ordenacao:");
		heapSort.heapSort(HeapSort.vetorHeap.getVetor());
		imprime.ImprimeInfo(HeapSort.vetorHeap.getVetor());
		imprime.ImprimeComp(HeapSort.vetorHeap.getComparacao());
		
		//SelectionSort
		System.out.println("\n------ Selection Sort -------");
		System.out.println("Antes da ordenacao:");
		selectionSort.iniciaVetorSelect();
		imprime.ImprimeInfo(SelectionSort.vetorSelect.getVetor());

		System.out.println("\n\nDepois da ordenacao:");
		selectionSort.selectionSort(SelectionSort.vetorSelect.getVetor());
		imprime.ImprimeInfo(SelectionSort.vetorSelect.getVetor());
		imprime.ImprimeComp(SelectionSort.vetorSelect.getComparacao());

	}
}