package Exe2;

public class Cliente {

    public int nConta, nAgencia;
    public String nmCliente;
    public float saldo;

    public Cliente() {
        this.nmCliente = "Nome não definido";
    }

    public Cliente(int nConta, int nAgencia, String nmCliente, float saldo) {
        this.nConta = nConta;
        this.nAgencia = nAgencia;
        this.nmCliente = nmCliente;
        this.saldo = saldo;
    }

    public float realizarDeposito(float x){
        return this.saldo = this.saldo + x;
    }

    public float realizarSaque(float x){
        return this.saldo = this.saldo - x;
    }

    public String DadosCliente(){
        return ("Número da conta: " + nConta + "\nNumero da agencia: " + nAgencia + "\nNome do cliente :" + nmCliente + "\nSaldo: " + saldo);
    }
}