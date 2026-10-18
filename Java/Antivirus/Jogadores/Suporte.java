public class Suporte extends Jogador {
	private void recuperar (Jogador p){
		if (p.set == this.set)
			p.DEF += 2;
		else 
			System.out.println ("Jogador nao esta no setor!");
	}

	public void imprime_suporte(){
		System.out.println ("P1");
		this.imprime_status();
	}
}
