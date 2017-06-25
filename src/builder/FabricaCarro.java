package builder;

/// The 'Director' class
public class FabricaCarro {
    public Carro Constroi(CarroBuilder builder) {
        builder.setPotencia();
        builder.setVelocidadeMaxima();
        builder.setDestaqueCarro();
        return builder.GetCar();
    }
}