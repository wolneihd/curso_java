public class exercicio_01 {

     private int modelYear;
     private String modelName;

     // Construtor
     public exercicio_01(int year, String name) {
        this.modelYear = year;
        this.modelName = name;
     }

     // Getter
     public int getModelYear() {
        return this.modelYear;
     }

     public String getModelName() {
        return this.modelName;
     }

     // Setter
     public void setModelYear(int year) {
        this.modelYear = year;
     }

     public void setModelName(String model) {
        this.modelName = model;
     }

     // Métodos GETTER and SETTER devem ficar fora do método MAIN.
     public static void main(String[] args) {
        //exercicio_01 carro01 = new exercicio_01(2016, "FOX");
        //exercicio_01 carro02 = new exercicio_01(2014, "Palio");

        exercicio_01 carro03 = new exercicio_01(2019, "Corolla");
        carro03.setModelName("Polo");

        System.out.println(carro03.getModelName());
     }
}
