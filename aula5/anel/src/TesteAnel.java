package aula5.anel.src;

public class TesteAnel {
    public static void main(String[] args) throws Exception {
        AnelInteiro a = new AnelInteiro();
        int x = 2; int y = 3; int z = 4;
        int r = a.produto(a.soma(x,y), z);
        System.out.println("(x+y)*z = " + r);

        AnelRacional Q = new AnelRacional();
        Racional q = new Racional(2, 3);
        Racional s = new Racional(4, 3);
        Racional t = Q.soma(q,s);
        System.out.println("q + s = " + t);

    }
}
