public class Setor {
    int x;
    int y;
    Jogador[] jogadores;
    Inimigo[] inimigos;

    public void Setor (){}
    public void Setor (int x, int y){
        this.setX (x);
        this.setY (y);
    }

    public void setX (int x){this.x = x;}
    public void setY (int y){this.y = y;}

    
}