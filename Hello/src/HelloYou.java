import java.util.Scanner;

public class Principal
{  
    public static void main(String args[])  
    {  
    	Scanner leitor = new Scanner(System.in);
    	System.out.println("What's your name: ");
    	String nome = leitor.nextLine();
    	
        System.out.println("\nHello, " + nome + " !!!");  
    }  
} 