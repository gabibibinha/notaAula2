public class ContaPoupança extends SistemaBancar{
    private double selic;
    private double rendimento;

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void calcularRendimento () {
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        }
        else {
            rendimento = 0.007 * selic * saldo;
        }
    }
}
