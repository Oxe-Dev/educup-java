package Atividade02;

public class Executor {
    public static void main(String [] args) {
        Operadores op = new Operadores();
        op.setOp1(20%2);
        op.setOp2(4);
        op.setOp3(9);
        op.setComparar(op.getOp1() > op.getOp3());

        System.out.println("1 Valor: "+op.getOp1());
        System.out.println("========================");
        System.out.println("2 Valor: "+op.getOp2());
        System.out.println("========================");
        System.out.println("3 Valor: "+op.getOp3());
        System.out.println("========================");
        System.out.println("4 Valor: "+op.isComparar());
    }
}
