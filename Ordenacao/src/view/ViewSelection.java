package view;

public class ViewSelection {
	public void ImprimeInfo(int[] numeros){ 
		for (int n : numeros){  
			System.out.print(" " + n);	//
		}
	}
	
	public void ImprimeComp(int comparacao){
		System.out.println("\nComparacoes: "+ comparacao);
	}
}
