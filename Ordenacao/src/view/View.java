package view;
/**
 * @author Marcos Assumpcao
 * Faculdade Senac Porto Alegre
 * Algoritmos e Programacao 3
 *
 */
public class View {	
	public void ImprimeInfo(int[] numeros){ //Imprime numeros do array.
		for (int n : numeros){  
			System.out.print(" " + n);	//
		}
	}
	
	public void ImprimeComp(int comparacao){ //Imprime o numero de comparacoes.
		System.out.println("\nComparacoes: "+ comparacao);
	}
}