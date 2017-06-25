package builder;

/// Classe "Product"
public class Carro {
    
    private int VelocidadeMaxima;
    private int Potencia;
    private String DestaqueCarro;
    
    public Carro(){ }

    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(int VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public String getDestaqueCarro() {
        return DestaqueCarro;
    }

    public void setDestaqueCarro(String DestaqueCarro) {
        this.DestaqueCarro = DestaqueCarro;
    }
    
}
