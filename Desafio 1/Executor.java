import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Executor{
  public static void main(String[] args) throws Exception {
        ProdutoItem item = new ProdutoItem();
        boolean continuarComprando = true;
        List<Produto> comprados = new ArrayList<>();
       
        while (continuarComprando == true) {
            System.out.println(
                "O que você quer fazer? \n (1) - Cadastrar Produto \n (2) - Comprar Produto \n (3) - Listar Produtos Cadastrados \n (4) - Listar Produtos no carrinho \n (5) - Sair");
            Console console = System.console();
            String usuarioEscolheu = console.readLine();
            switch (usuarioEscolheu) {
                case "1":
                    item.cadastrarProduto();
                    break;
                case "2":
                    comprados.add(item.comprarProduto());
                    break;
                case "3":
                    item.listarProdutos();
                    break;
                case "4":
                   item.listarProdutosNoCarrinhoDeCompras(comprados);
                   break;
                case "5":
                    continuarComprando = false;
                    break;
                default:
                    System.out.println("Esta opção não existe!");
                    break;
            }
        }

    }
}
