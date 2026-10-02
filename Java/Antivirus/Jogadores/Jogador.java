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

	public void setATK (int atk) {this.ATK = atk;}
	public void setDEF (int def) {this.DEF = def;}

}
