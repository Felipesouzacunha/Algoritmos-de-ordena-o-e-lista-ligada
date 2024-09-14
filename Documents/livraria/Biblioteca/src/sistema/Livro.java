package sistema;

public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	
	
	public Livro(String titulo, String autor, int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public String toString() {
		return "Titulo: " + this.titulo + " Autor: " + this.autor + " Ano de publicação: " + anoDePublicacao;
	}
	
}
