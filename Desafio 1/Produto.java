public class Produto {

    private String nomeProduto;
    private float precoProduto;
    private int estoqueProduto;

    public Produto() {}

    public Produto(String nomeProduto, float precoProduto, int estoqueProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.estoqueProduto = estoqueProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

}
