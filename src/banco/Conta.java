package banco;

public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    protected void creditar(double valor) { this.saldo += valor; }

    protected boolean debitar(double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
