package Exe1;

public class Aluno {

    public int nAluno, idade;
    public String nmAluno;
    public float p1,p2;

    public Aluno() {
        nmAluno = "Nome vazio";
    }

    public Aluno(int nAluno, int idade, String nmAluno, float p1, float p2) {
        this.nAluno = nAluno;
        this.idade = idade;
        this.nmAluno = nmAluno;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (p1+p2) / 2.0F;
    }

    public String passou(){
        return (notaFinal() >= 6.0F) ? "O aluno passou" : "O aluno não passou";
    }

    public String dadosAluno(){
        return "Numero do aluno: " + nAluno + "\nNome do aluno: " + nmAluno + "\nIdade: " + idade + "\nNota Final: " + notaFinal();
    }

}
