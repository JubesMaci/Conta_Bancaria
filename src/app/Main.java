package app;

import banco.ContaCorrente; // importa do outro package

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001");

        cc.depositar(50);
        System.out.println("Saldo após depósito: " + cc.getSaldo());

        cc.sacar(50);
        System.out.println("Saldo após saque: " + cc.getSaldo());
    }
}
