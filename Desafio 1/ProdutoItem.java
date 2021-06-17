import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class ProdutoItem {

    private List<Produto> produtos;

    public ProdutoItem() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto() {
        boolean cadastrar = true;
        char opcaoCadastro;
        Console sc = System.console();

        while (cadastrar == true) {
            Produto produto = new Produto();
            System.out.println("Qual o nome do produto que deseja cadastrar?");
            produto.setNomeProduto(sc.readLine());
            System.out.println("Qual o preço do produto?");
            produto.setPrecoProduto(Float.parseFloat(sc.readLine()));
            System.out.println("Quantidade do estoque do produto?");
            produto.setEstoqueProduto(Integer.parseInt(sc.readLine()));
            adicionarProduto(produto);
            System.out.println("Deseja cadastrar outro produto? (S) - Sim, (N) - Não");
            opcaoCadastro = sc.readLine().toUpperCase().charAt(0);
            if (opcaoCadastro == 'N') {
                cadastrar = false;
            }
        }
    }

    public void listarProdutosNoCarrinhoDeCompras(List<Produto> carrinho) {
        Float saldoAtual = 0f;
        for (Produto produto : carrinho) {
            System.out.println(
                    "Produto: " + produto.getNomeProduto() + " valor unitário: R$" + produto.getPrecoProduto());
            saldoAtual = saldoAtual + produto.getPrecoProduto();
        }
        System.out.println("Total: R$ " + saldoAtual);
    }

    public boolean adicionarProduto(Produto produto) {
        return produtos.add(produto);
    }

    public boolean removerProduto(Produto produto) {
        return produtos.remove(produto);
    }
    public void listarProdutos() {
        if (produtos.size() > 0) {
            for (Produto produto : produtos) {
                System.out.println("============================================");
                System.out.println("Produto: " + produto.getNomeProduto());
                System.out.println("Preço: " + produto.getPrecoProduto());
                System.out.println("Estoque: " + produto.getEstoqueProduto());
                System.out.println("============================================");
            }
        } else {
            System.out.println("Não há produtos cadastrados!");
        }
    }

    public Produto comprarProduto() {
        if (produtos.size() > 0) {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println("Código: " + i + " - " + produtos.get(i).getNomeProduto().toUpperCase());
                System.out.println(" ");
            }
            Console sc = System.console();
            System.out.println(" Qual produto você quer comprar? ");
            Produto escolhido = produtos.get(Integer.parseInt(sc.readLine()));
            return escolhido;
        } else {
            return null;
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
