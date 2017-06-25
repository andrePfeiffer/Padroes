package builder;

/// The 'ConcreteBuilder1' class
public class CarroPopular extends CarroBuilder {

    @Override
    public void setPotencia() {
        carro.setPotencia(100);
    }

    @Override
    public void setVelocidadeMaxima() {
        carro.setVelocidadeMaxima(120);
    }

    @Override
    public void setDestaqueCarro() {
        carro.setDestaqueCarro("Tem ar condicionado");
    }
    
}