package controller;

import model.Vetor;

/**
 * @author Marcos Assumpcao
 *
 */
public class SelectionSort {
	static Vetor vetorSelect = new Vetor();
	int menor;
	int indiceMenor;
	int comparacao = 0;
	
	public void selectionSort(int tabela[]){
		for (int i = 0; i < tabela.length - 1; i++) {
            menor = tabela[i];
            indiceMenor = i;

            for (int j = i + 1; j < tabela.length; j++){
				comparacao++;
				vetorSelect.setComparacao(comparacao);
                if (tabela[j] < menor){
                    menor = tabela[j];
                    indiceMenor = j;
                }
            }
            tabela[indiceMenor] = tabela[i];
            tabela[i] = menor;
        }
	}
	
	public void iniciaMatrizSelect(){
		int [] numeros = new int[]{1, 7, 5, 12, 4, 2, 9, 11, 3, 8, 6, 0, 10};
		vetorSelect.setMatriz(numeros);
	}
}