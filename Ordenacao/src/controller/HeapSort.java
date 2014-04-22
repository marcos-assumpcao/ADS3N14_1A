package controller;

import model.Vetor;

/**
 * @author Marcos Assumpcao
 * Faculdade Senac Porto Alegre
 * Algoritmos e Programacao 3
 *
 */
public class HeapSort {
	static Vetor vetorHeap = new Vetor();
	static int comparacao = 0;
	
	public void heapSort(int vetor[]) {  
		buildMaxHeap(vetor);  
		int n = vetor.length;  

		for (int i = vetor.length - 1; i > 0; i--) {  
			swap(vetor, i, 0);  
			maxHeapify(vetor, 0, --n);  
		}  
	}  

	public static void buildMaxHeap(int vetor[]) {  
		for (int i = vetor.length / 2 - 1; i >= 0; i--)  
			maxHeapify(vetor, i, vetor.length); 
			comparacao++;
			vetorHeap.setComparacao(comparacao);
	}  

	public static void maxHeapify(int vetor[], int posicao, int n) {  
		int max = 2 * posicao + 1, right = max + 1; 

		if (max < n) {  
			if (right < n && vetor[max] < vetor[right]) max = right;  
			if (vetor[max] > vetor[posicao]) {  
				swap(vetor, max, posicao);  
				maxHeapify(vetor, max, n); 
				comparacao++;
				vetorHeap.setComparacao(comparacao);
				
			}  
		}  
	}  

	private static void swap(int[] tabela, int antes, int apos) {  
		int aux = 0;  
		aux = tabela[antes];  
		tabela[antes] = tabela[apos];  
		tabela[apos] = aux; 
		comparacao++;
		vetorHeap.setComparacao(comparacao);
	}  
	
	public void iniciaVetorHeap(){
		int [] numeros = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10};
		vetorHeap.setVetor(numeros);
	}
}