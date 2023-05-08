package aula4.get_set;

// Subclasse -> o "extends" indica que veiculos eh a superclasse de Carros
public class Carro extends Veiculos {
    private int cilindradas;
    private boolean airbag;

    // Método
    public String toString() {
        return "Carro fabricado em " + getAnoDeFabricacao() + " com " + cilindradas + " cilindradas";
    }
    
    Carro (int ano, String modelo, String marca, int cilindradas) {
        super(ano, modelo, marca); // chama a superclasse
        this.cilindradas = cilindradas;
    }
    // metódo principal de entrada (do teclado), quando executar linha de comando vai executar isso
    public static void main (String args[]) {

        Carro fordBigode = new Carro(1910, "bigode", "Ford", 2900);
        System.out.println ("O veiculo criado foi " + fordBigode);
    }



}
