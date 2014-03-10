/**
 * Faculdade Senac Porto Alegre
 * Algoritmos e Programação 3
 * @author Marcos Assumpção
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
	 * Método que retorna o nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Método que insere o nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Método que retorna o endereço
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * Método que insere o endereço
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * Método que retorna o telefone
	 * @return telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * Método que insere o telefone
	 * @param telefone
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}	
	
	public void imprimeInformacao(){
		System.out.println("-Informações do Cliente.\n\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);	
	}
}