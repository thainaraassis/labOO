package aula4.get_set;

// Superclasse
public class Veiculos {
    // Variáveis privadas só podem ser acessadas pela propria classe
    private int anoDeFabricacao;
    private String modelo;
    private String marca;

    // Construtor - método que contem o nome da classe e inicializa ele -> instancia ele e cria
    Veiculos(int adf, String mod, String mar) {
        anoDeFabricacao = adf;
        modelo = mod;
        marca = mar;
    }
    // Método de acesso para ler o objeto de fora da classe (get)/(set)
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
}