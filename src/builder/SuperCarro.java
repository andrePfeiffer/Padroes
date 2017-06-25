package builder;

/// The 'ConcreteBuilder2' class
public class SuperCarro extends CarroBuilder {

    @Override
    public void setPotencia() {
        carro.setPotencia(1640);
    }

    @Override
    public void setVelocidadeMaxima() {
        carro.setVelocidadeMaxima(1500);
    }

    @Override
    public void setDestaqueCarro() {
        carro.setDestaqueCarro("Voa!");
    }
    
}
