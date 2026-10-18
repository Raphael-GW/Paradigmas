public class Inimigo {
    int ATK;
    int DEF;

    public void Inimigo () {}
    public void Inimigo (int ATK, int DEF){
        if (ATK > 0 && DEF > 0){
            this.setATK (ATK);
            this.setDEF (DEF);
        }
    }

    setATK (int ATK){this.ATK = ATK;}
    setDEF (int DEF){this.DEF = DEF;}

    public void atacar (){
        
    }

}