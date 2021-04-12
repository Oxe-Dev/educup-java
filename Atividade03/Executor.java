package Atividade03;

public class Executor {
    public static void main(String [] args) {
        ArvoreDeNatal an = new ArvoreDeNatal();
        an.ligar();
        System.out.println("Status: "+an.getStatus());
        an.desligar();
        System.out.println("Status: "+an.getStatus());
    }
}
