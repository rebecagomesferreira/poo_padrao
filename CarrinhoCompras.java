package carrinho.compras;
import java.util.ArrayList;
import java.util.List;
/*
Principio usado: Creator, High Cohesion
Justificativa: é responsável por recolher os itens do pedido da classe
ItensPedido, lista-los e calcular seu valor total, gerenciando os itens em uma
lista desses itens.
Impede que outras classes precisem conhecer os detalhes de calculos e dados de produtos,
por exemplo, reduzindo o acoplamento.
Além disso a classe é responsável apenas pelas operações de calculo, adição de itens
ao carrinho e exibição do total.
*/
public class CarrinhoCompras {
    private List<ItensPedido> itens = new ArrayList<>();
    
    public void adicionarProduto(Produto produto, int qtd){
        ItensPedido item = new ItensPedido(produto, qtd);
        itens.add(item);
    }
    
    public double calcularTotal(){
        return itens.stream()
                    .mapToDouble(ItensPedido::calcularTotal)
                    .sum();
    }
    
    public void exibirCompra(){
        System.out.println("--------Carrinho de Compra---------");
        for(ItensPedido item : itens){
            System.out.println(item);
        }
        System.out.println("Total: RS" + calcularTotal());
    }
}
