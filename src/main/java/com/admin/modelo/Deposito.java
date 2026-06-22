package main.java.com.admin.modelo;
import java.util.Vector;

public class Deposito {
    private String nome;
    private Vector<Produto> produtos;

    public Deposito(String nome){
        this.nome = nome;
        this.produtos = new Vector<Produto>();
    }

    public String setNome(){
        this.nome = nome;
        return nome;
    }
    public void adicionaProduto(Produto produto){
        if(produto != null){
            this.produtos.add(produto);
        }
    }
    public Vector<Produto> listarProdutos(){
        return produtos;
    }


}
