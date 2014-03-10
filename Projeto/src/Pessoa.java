/**
 * Faculdade Senac Porto Alegre
 * Algoritmos e Programa��o 3
 * @author Marcos Assump��o
 */
public abstract class Pessoa {
	//Atributos da Classe.
	private String nome;
	private String endereco;
	private int telefone;
	/**
	 * Metodo construtor
	 */
	public Pessoa() {
		
	}
	/**
	 * Metodo construtor
	 * @param nome
	 * @param endereco
	 * @param telefone
	 */
	public Pessoa(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	/**
	 * M�todo que retorna o nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * M�todo que insere o nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * M�todo que retorna o endere�o
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * M�todo que insere o endere�o
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * M�todo que retorna o telefone
	 * @return telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * M�todo que insere o telefone
	 * @param telefone
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}	
	
	public void imprimeInformacao(){
		System.out.println("-Informa��es do Cliente.\n\nNome: " + nome + "\nEndere�o: " + endereco + "\nTelefone: " + telefone);	
	}
}