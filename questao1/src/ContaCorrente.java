public class ContaCorrente extends SistemaBancar{
    private double saldoChequeEspecial = 1000;
    private double saqueChequeEspecial;

    public double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaqueChequeEspecial(double sacarChequeEspecial) {
        this.saqueChequeEspecial = sacarChequeEspecial;
    }

    public void usarChequeEspecial() {
        if (saqueChequeEspecial > saldoChequeEspecial) {
            System.out.println("Valor do saque maior que o saldo do CHEQUE ESPECIAL");
        } else {
            saldoChequeEspecial -= saqueChequeEspecial;
        }
    }
}
