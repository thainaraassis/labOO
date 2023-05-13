public class Musicas {

    public String titulo;
    public String album;
    public String compositor;
    public String interprete;
    public int ano;

    Musicas (String t, String alb, String comp, String inter, int ano) {
        this.titulo = t;
        this.album = alb;
        this.compositor = comp;
        this.interprete = inter;
        this.ano = ano;
    }

    public String toString() {
        return "A musica eh " + titulo + ", sendo encontrada no album " + album + ", composto por " + compositor + " e interpretada por " + interprete + ". O seu lancamento ocorreu no ano " + ano;
    }
}
