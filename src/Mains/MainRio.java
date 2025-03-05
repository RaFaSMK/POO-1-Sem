package Mains;
import Exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio("São jose", 20.00F, false);
        System.out.println(obj1.mostra());
        System.out.println("\nNivel do rio após o aumento: " + obj1.chover(10.5F));
        System.out.println("Nivel do rio após o declínio: " + obj1.ensolarar(12.0F));
        obj1.limpar();
        System.out.println("O rio está limpo? " + obj1.confere());
        obj1.sujar();
        System.out.println("O rio está limpo? " + obj1.confere());
        System.out.println("\n" + obj1.mostra());

        Rio obj2 = new Rio();
        System.out.println("\n"+ obj2.mostra());
        System.out.println("\nNivel do rio após o aumento: " + obj2.chover(13.5F));
        System.out.println("Nivel do rio após o declínio: " + obj2.ensolarar(10.0F));
        obj2.limpar();
        System.out.println("O rio está limpo? " + obj2.confere());
        obj2.sujar();
        System.out.println("O rio está limpo? " + obj2.confere());
        System.out.println("\n" + obj2.mostra());
    }
}