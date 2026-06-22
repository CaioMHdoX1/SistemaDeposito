package main.java.com.admin.modelo;

public abstract class Produto{
    
    protected String produto;
    protected String user;
    
    public Produto(String produto, String user){
        this.produto = produto;
        this.user = user;
    }

    public String getProduto(){
        return produto;
    }
    public String getUser(){
        return user;
    }

}
