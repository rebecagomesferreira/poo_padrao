package carrinho.compras;
import java.util.ArrayList;
import java.util.List;

/*
Principio usado: High Cohesion
Justificativa: assim como classe produto, a classe ItensPedido é responsável 
por coletar o nome de um unico produto e preço, multiplicar pela quantidade
desejada, calculando o subtotal.
Nao é responsavel por organizar todos os produtos e calcular seu total
*/
public class ItensPedido {
    private Produto produto;
    private int qtd;
    
    public ItensPedido(Produto produto,int qtd){
        this.produto= produto;
        this.qtd= qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public double calcularTotal(){
        return produto.getPreco() * qtd;
    }
    
    @Override 
    public String toString(){
        return produto.getNome() + " x" + qtd + " = RS" + calcularTotal();
    }
}
