package controller;

import model.Vetor;

/**
 * @author Marcos Assumpcao
 * Faculdade Senac Porto Alegre
 * Algoritmos e Programacao 3
 *
 */
public class SelectionSort {
	static Vetor vetorSelect = new Vetor();
	int menor;
	int indiceMenor;
	int comparacao = 0;
	
	public void selectionSort(int vetor[]){
		for (int i = 0; i < vetor.length - 1; i++) {//Verificar o menor valor do vetor
            menor = vetor[i];
            indiceMenor = i;

            for (int j = i + 1; j < vetor.length; j++){//comparar os valores do vetor
				comparacao++;
				vetorSelect.setComparacao(comparacao);
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }
            vetor[indiceMenor] = vetor[i];//trocar os valores menor e maior
            vetor[i] = menor;
        }
	}
	
	public void iniciaVetorSelect(){
		int [] numeros = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10};
		vetorSelect.setVetor(numeros);
	}
}