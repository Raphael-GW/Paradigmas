public class Livro {
	String titulo;
	int ano;
	Autor autor;

	public void Livro () {}
	public void Livro (String titulo, int ano, Autor autor){
		if (titulo != NULL && ano > 0 && autor != NULL){
			this.setTitulo (titulo);
			this.setAno (ano);
			this.autor = autor;
		}
	}

	void setTitulo (String titulo) {this.titulo = titulo;}
	void setAno (int ano) {this.ano = ano;}

	void getTitulo () {return this.titulo;}
	void getAno () {return this.ano;}

	void imprimir() {
		System.out.printf ("Livro: %s, %d\n", this.titulo, this.ano);
		this.autor.imprimir ();
	}
}
