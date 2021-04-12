package Atividade02;

public class Operadores {
    
    private Integer op1;
    private Integer op2;
    private Integer op3;
    private boolean comparar;

    public Integer getOp1(){
        return op1;
    }
    
    public Integer getOp2(){
        return op2;
    }
    
    public Integer getOp3(){
        return op3;
    }
    
    public boolean isComparar(){
        return comparar;
    }

    public void setOp1(Integer op1){
        this.op1 = op1;
    }
    public void setOp2(Integer op2){
        this.op2 = op2;
    }
    public void setOp3(Integer op3){
        this.op3 = op3;
    }
    public void setComparar(boolean comparar){
        this.comparar = comparar;
    }
}
