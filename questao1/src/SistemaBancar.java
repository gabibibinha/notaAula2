public class SistemaBancar {
    protected String titular;
    protected double saldo = 0;
    protected double deposito;
    protected double saque;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void depositar() {
        saldo += deposito;
    }

    public void sacar() {
        if (saque < saldo || saque == saldo) {
            saldo -= saque;
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }
}
