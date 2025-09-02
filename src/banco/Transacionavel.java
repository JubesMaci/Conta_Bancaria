package banco;

public interface Transacionavel {
    void depositar(double valor);
    boolean sacar(double valor);
}
