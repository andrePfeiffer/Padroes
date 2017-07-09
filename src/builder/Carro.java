package builder;

/// Classe "Product"
public class Carro {
    
    private int velocidadeMaxima;
    private int potencia;
    private String destaqueCarro;
    
    public Carro(){ }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getDestaqueCarro() {
        return destaqueCarro;
    }

    public void setDestaqueCarro(String destaqueCarro) {
        this.destaqueCarro = destaqueCarro;
    }
    
}
