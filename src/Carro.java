public class Carro extends VeiculoMotorizado implements Terrestre, VeiculoComPorta{
    private int qtdePortas;
    private int qtdePneus;

    public Carro(int qtdePortas, int qtdePneus) {
        this.qtdePortas = qtdePortas;
        this.qtdePneus = qtdePneus;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando.");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando.");
    }

    @Override
    public void abrirPorta() {
        System.out.println("Abrindo porta.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo.");
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    @Override
    public int getQtdePneus() {
        return qtdePneus;
    }

    @Override
    public void setQtdePneus(int qtdePneus) {
        this.qtdePneus = qtdePneus;
    }
}
