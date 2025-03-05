package Exe3;

public class Produto {

    public int id, qtde;
    public String desc;
    public float preco;

    public Produto(){
        this.desc = "Não tem descrição";
    }

    public Produto(int id, int qtde, String desc, float preco){
        this.id = id;
        this.qtde = qtde;
        this.desc = desc;
        this.preco = preco;
    }

    public int comprar(int x){
        return this.qtde = this.qtde + x;
    }

    public int vender(int x){
        return this.qtde = this.qtde + x;
    }

    public float subir(float x){
        return this.preco = this.preco + x;
    }

    public float descer(float x){
        return this.preco = this.preco - x;
    }

    public String mostra(){
        return ("Id do produto: " + this.id + "\nQuantidade: " + this.qtde + "\nDescrição do produto: " + this.desc + "\nPreço do produto: " + this.preco);
    }

}
