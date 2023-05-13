public class LP extends Musicas {

    private int velocidade;

    LP(String t, String alb, String comp, String inter, int ano, int vel) {
        super(t, alb, comp, inter, ano);
        this.velocidade = vel;
    }

    public String toString() {
        return super.toString() + " A sua velocidade eh " + velocidade + " rotacoes por minuto.";
    }
    
}
