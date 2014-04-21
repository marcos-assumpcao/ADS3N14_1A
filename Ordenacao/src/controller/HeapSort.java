package controller;

import model.Matriz;

/**
 * @author Marcos Assumpcao
 *
 */
public class HeapSort {
	static Matriz matrizHeap = new Matriz();
	static int comparacao = 0;
	
	public void heapSort(int tabela[]) {  
		buildMaxHeap(tabela);  
		int n = tabela.length;  

		for (int i = tabela.length - 1; i > 0; i--) {  
			swap(tabela, i, 0);  
			maxHeapify(tabela, 0, --n);  
		}  
	}  

	public static void buildMaxHeap(int tabela[]) {  
		for (int i = tabela.length / 2 - 1; i >= 0; i--)  
			maxHeapify(tabela, i, tabela.length); 
			comparacao++;
			matrizHeap.setComparacao(comparacao);
	}  

	public static void maxHeapify(int tabela[], int posicao, int n) {  
		int max = 2 * posicao + 1, right = max + 1; 

		if (max < n) {  
			if (right < n && tabela[max] < tabela[right]) max = right;  
			if (tabela[max] > tabela[posicao]) {  
				swap(tabela, max, posicao);  
				maxHeapify(tabela, max, n); 
				comparacao++;
				matrizHeap.setComparacao(comparacao);
				
			}  
		}  
	}  

	private static void swap(int[] tabela, int antes, int apos) {  
		int aux = 0;  
		aux = tabela[antes];  
		tabela[antes] = tabela[apos];  
		tabela[apos] = aux; 
		comparacao++;
		matrizHeap.setComparacao(comparacao);
	}  
	
	public void iniciaMatrizHeap(){
		int [] numeros = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10};
		matrizHeap.setMatriz(numeros);
	}
}
