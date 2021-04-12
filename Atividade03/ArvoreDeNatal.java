package Atividade03;

public class ArvoreDeNatal {
    
    private int status; //0 - Desligado, 1 - Ligado

    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
    }

    public void ligar(){
        status = 1;
        System.out.println("Ligado!");
    }
    public void desligar(){
        status = 0;
        System.out.println("Desligado!");
    }
}
