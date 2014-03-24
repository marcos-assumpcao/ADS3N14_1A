package model;
/**
 * @author Marcos Assumpcao
 *
 */
public class Pessoa {
	private String letra;
	private String nome;
	private String telefone;
	/**
	 * Metodo que retorna a letra.
	 * @return letra
	 */
	public String getLetra() {
		return letra;
	}
	/**
	 * Metodo que insere a letra.
	 * @param letra
	 */
	public void setLetra(String letra) {
		this.letra = letra;
	}
	/**
	 * Metodo que retorna o nome.
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo que insere o nome.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo que retorna o telefone.
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * Metodo que insere o telefone.
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}