package builder;

public class CarroTest {
    public static void main(final String[] arguments) {
        FabricaCarro fabrica = new FabricaCarro();
        
        Carro carro1 = fabrica.Constroi(new CarroPopular());
        System.out.println(carro1.getDestaqueCarro());
        Carro carro2 = fabrica.Constroi(new SuperCarro());
        System.out.println(carro2.getDestaqueCarro());
    }
}
