package Mains;
import Exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(2504, 4302, "Rafael Chaves Souza", 3440.7F);
        System.out.println(obj1.DadosCliente());
        System.out.println("Saldo após o depósito: R$" + obj1.realizarDeposito(316.0F));
        System.out.println("Saldo após o saque: R$" + obj1.realizarSaque(200.0F));

        Cliente obj2 = new Cliente(431, 321, "Andrey Fernando", 931431.0F);
        System.out.println(obj2.DadosCliente());
        System.out.println("Saldo após o depósito: R$" + obj2.realizarDeposito(316.0F));
        System.out.println("Saldo após o saque: R$" + obj2.realizarSaque(200000.0F));
    }
}