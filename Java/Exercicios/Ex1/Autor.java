public class Autor {
	String nome;
	String pais;

	public void Autor () {}
	public void Autor (String nome, String pais){
		this.setNome (nome);
		this.setPais (pais);
	}

	void setNome (String nome) {this.nome = nome;}
	void setPais (String pais) {this.pais = pais;}

	void getNome () {return this.nome;}
 	void getPais () {return this.pais;}

	void imprimir (){
		System.out.println ("Autor: " + getNome());
		System.out.println ("Pais de Origem: " + getPais());
	}

}
