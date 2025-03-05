package Exe4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "Nome não definido";
    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public float chover(float x){
        return this.nivel = this.nivel + x;
    }

    public float ensolarar(float x){
        return this.nivel = this.nivel - x;
    }

    public boolean limpar(){
        return this.poluido = false;
    }

    public boolean sujar(){
        return this.poluido = true;
    }

    public String confere(){
        return (this.poluido) ? "Está sujo" : "Está limpo";
    }

    public String mostra(){
        return "Nome do rio: " + this.nome + "\nNivel do rio: " + this.nivel + "\nO rio está sujo? " + confere();
    }
}