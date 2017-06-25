package builder;

/// The 'Builder' abstract class
public abstract class CarroBuilder {
    
    Carro carro = new Carro();
    public abstract void setPotencia();
    public abstract void setVelocidadeMaxima();
    public abstract void setDestaqueCarro();

    public Carro GetCar()
    {
        return carro;
    }
    
}
