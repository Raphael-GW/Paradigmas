public class Pessoa{
	private String nome;
	private String ocup;
	private Endereco end;
	private Data nasc;

	public Pessoa () {}
	public Pessoa (String nome, String ocup, String rua, int num, byte dia, byte mes, short ano){
		this.setNome (nome);
		this.setOcup (ocup);
		this.end = new Endereco (rua, num);
		this.nasc = new Data (dia, mes, ano);

	}

	public void setNome (String nome){this.nome = nome;}

	public void setOcup (String ocup){this.ocup = ocup;}

	public String getNome (){return this.nome;}

	public String getOcup (){return this.ocup;}

	public void imprimir (){
		System.out.println ("Nome: " + this.getNome());
		System.out.println ("Ocupacao: " + this.getOcup());

		System.out.printf ("Rua: %s, %d \n", this.end.getRua(), this.end.getNum());

		System.out.printf ("Nascimento: %d/%d/%d\n", this.nasc.getDia(), this.nasc.getMes(),
				this.nasc.getAno());
	}

}
