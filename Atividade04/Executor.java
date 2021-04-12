package Atividade04;

public class Executor {
   public static void main(String [] args) {
       Som som = new Som();
       som.setFaixa(92.5);
       som.setVolume(1);
       som.aumentarVolume();
       som.aumentarVolume();
       som.proximaFaixa();
       som.proximaFaixa();
       som.diminuirVolume();
       som.faixaAnterior();
       som.faixaAnterior();
       System.out.println("Faixa "+som.getFaixa());
       System.out.println("Volume "+som.getVolume());
   } 
}
