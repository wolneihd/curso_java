public class Carro {

    private String marca;
    private String modelName;

    // Construtor
    public Carro(String marca) {
        this.marca = marca;
    }

    // Getter para marca
    public String getMarca() {
        return this.marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para modelName
    public String getModelName() {
        return this.modelName;
    }

    // Setter para modelName
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Classe interna Features
    class Features extends Carro {
        // Construtor
        public Features(String marca, String modelName) {
            super(marca); // herda do Carro a Marca.
            setModelName(modelName); // Usando o setter para acessar o campo
        }
    }

    public static void main(String[] args) {
        // Exemplo 01 >>
        Carro carro01 = new Carro("Volkswagen");

        // Exemplo de uso da classe interna Features
        Features featureCar = carro01.new Features("Volkswagen", "Golf");
        System.out.println("Marca: " + featureCar.getMarca());
        System.out.println("Modelo: " + featureCar.getModelName());

        // Exemplo 02 >>
        Carro carro02 = new Carro("FIAT");
        Features featureCar_02 = carro02.new Features(carro02.getMarca(), "Palio");
        System.out.println("Marca: " + featureCar_02.getMarca());
        System.out.println("Modelo: " + featureCar_02.getModelName());
    }
}
