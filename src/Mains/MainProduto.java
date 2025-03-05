package Mains;
import Exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto(12, 20, "Arroz", 32.5F);
        System.out.println(obj1.mostra());
        System.out.println("\nEstoque após compra: " + obj1.comprar(10));
        System.out.println("Estoque após venda: " + obj1.vender(20));
        System.out.println("Preço após aumento: R$" + obj1.subir(21.0F));
        System.out.println("Preço após desconto: R$" + obj1.descer(1.5F));
    }
}
