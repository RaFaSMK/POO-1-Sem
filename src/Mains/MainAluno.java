package Mains;
import Exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {

        Aluno obj1 = new Aluno(25251,18,"Rafael Chaves Souza", 5.0F, 7.0F);
        System.out.println(obj1.dadosAluno());
        System.out.println("\n" + obj1.passou());
    }
}