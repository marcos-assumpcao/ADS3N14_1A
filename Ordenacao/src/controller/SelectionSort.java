package controller;

import model.Matriz;

public class SelectionSort {
	static Matriz matriz = new Matriz();
	int menor;
	int indiceMenor;
	int comparacao = 0;
	
	public void selectionSort(int tabela[]){
		for (int i = 0; i < tabela.length - 1; i++) {
            menor = tabela[i];
            indiceMenor = i;

            for (int j = i + 1; j < tabela.length; j++){
				comparacao++;
				matriz.setComparacao(comparacao);
                if (tabela[j] < menor){
                    menor = tabela[j];
                    indiceMenor = j;
                }
            }
            tabela[indiceMenor] = tabela[i];
            tabela[i] = menor;
        }
	}
}