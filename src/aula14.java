public class aula14 {
    public static void main(String[] args) {

        Carro carro_01 = new Carro("Golf");
        Carro carro_02 = new Carro("HRV");
        CarroCombate carro_03 = new CarroCombate("Leopardo",100);
        CarroCombate carro_04 = new CarroCombate("Pantera",100);

        carro_03.atirar();

        carro_01.info();
        carro_02.info();
        carro_03.info();
        carro_04.info();
    }
}
