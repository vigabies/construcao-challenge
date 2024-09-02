package modelo;

public class Viga {

    // Atributos privados (encapsulados)
    private double base;
    private double altura;
    private double comprimento;

    // Construtor
    public Viga(double base, double altura, double comprimento) {
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Métodos getters e setters
    //Getter – Pra gerar informações; Setter – Pra dar informações; 
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    // Método para calcular o volume
    public double calcularVolume() {
        return base * altura * comprimento;
    }
}
