public class CarroCombate extends Carro {

    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 100;
    private int qtddeArmamento;

    public CarroCombate(String nome, int blindagem) {
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtddeArmamento = 100;
    }

    public void setQtdeArmamento(int qtddeArmamento) {
        this.qtddeArmamento = qtddeArmamento;
        if (this.qtddeArmamento > MAX_ARMAMENTO) {
            this.qtddeArmamento = MAX_ARMAMENTO;
        }
        if (this.qtddeArmamento < MIN_ARMAMENTO) {
            this.qtddeArmamento = MIN_ARMAMENTO;
        }
    }

    public int getQtdeArmamento() {
        return this.qtddeArmamento;
    }

    public void atirar() {
        if (this.qtddeArmamento > MIN_ARMAMENTO) {
            setQtdeArmamento(-1);
        } else {
            System.out.println("Sem armamento!");
        }
    }

    public void info() {
        super.info();
        System.out.printf("\nQtde.Armamento .:%s",this.qtddeArmamento);
    }
}
