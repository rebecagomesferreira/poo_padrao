package carrinho.compras;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto ("Oleo", 5.0);
        Produto p2 = new Produto ("Farinha", 3.0);
        Produto p3 = new Produto ("Ovo 12 unidades", 15.0);
        Produto p4 = new Produto ("Acucar", 15.0);
        Produto p5 = new Produto ("Leite", 5.0);
        Produto p6 = new Produto ("Fermento", 5.0);
        
        CarrinhoCompras c1 = new CarrinhoCompras();
        
        c1.adicionarProduto(p1, 2);
        c1.adicionarProduto(p2, 3);
        c1.adicionarProduto(p3, 1);
        c1.adicionarProduto(p4, 1);
        c1.adicionarProduto(p5, 3);
        c1.adicionarProduto(p6, 1);
        
        c1.exibirCompra();
    }
}
