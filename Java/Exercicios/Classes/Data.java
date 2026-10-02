public class Data{
	// Atributos
	private byte dia;
	private byte mes;
	private short ano;

	public Data () {}
	// Construtor completo
	public Data(byte dia, byte mes, short ano)
	{
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public void setDia (byte dia) {this.dia = dia;}
	public void setMes (byte mes) {this.mes = mes;}
	public void setAno (short ano) {this.ano = ano;}

	public byte getDia () {return this.dia;}
	public byte getMes () {return this.mes;}
	public short getAno () {return this.ano;}
}
