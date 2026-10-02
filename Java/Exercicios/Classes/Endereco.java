public class Endereco{
	private String rua;
	int num;
	
	public Endereco () {}
	public Endereco (String rua, int num){
		this.setRua (rua);
		this.setNum (num);
	}

	public void setRua (String rua){
		this.rua = rua;
	}
	public void setNum (int num){
		this.num = num;
	}

	public String getRua (){ return this.rua;}
	public int getNum (){ return this.num;} 
}
