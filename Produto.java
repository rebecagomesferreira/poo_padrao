package carrinho.compras;
import java.util.ArrayList;
import java.util.List;

/*
Principio usado: High Cohesion
Justifiactiva: a classe produto é responsável apenas por representar 
os dados de um produto, nao realiza calculos, quantidade do produto, 
apenas faz a sua responsabilidade.
*/
public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;

    }

    
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return nome + " - RS" + preco;
    }
}
