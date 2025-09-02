package banco;

public class ContaCorrente extends Conta implements Transacionavel {
    public ContaCorrente(String numero) { super(numero); }

    @Override
    public void depositar(double valor) {
        if (valor > 0) creditar(valor);
        else System.out.println("Valor inválido para depósito!");
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0) return debitar(valor);
        return false;
    }
}
