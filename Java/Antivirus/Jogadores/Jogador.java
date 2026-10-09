public class Jogador {
	int ATK;
	int DEF;
	Pos pos;

	public void Jogador () {}
	public void Jogador (int atk, int def, int x, int y){
		if (atk > 0 && def > 0){
			this.setATK (atk);
			this.setDEF (def);
			this.pos = new Pos (x, y);
		}
	}

	public setATK (int atk) {this.ATK = atk;}
	public setDEF (int def) {this.DEF = def;}

	public int getATK () {return this.ATK;}
	public int getDEF () {return this.ATK;}
	
	public void 
	
	public void imprime_status (){
		System.out.printf ("%d/%d\n", this.getATK(), this.getDEF());
	}

}
