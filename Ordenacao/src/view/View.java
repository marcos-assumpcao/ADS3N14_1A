package view;
/**
 * @author Marcos Assumpcao
 *
 */
public class View {	
	public void ImprimeInfo(int[] numeros){ 
		for (int n : numeros){  
			System.out.print(" " + n);	//
		}
	}
	
	public void ImprimeComp(int comparacao){
		System.out.println("\nComparacoes: "+ comparacao);
	}
}