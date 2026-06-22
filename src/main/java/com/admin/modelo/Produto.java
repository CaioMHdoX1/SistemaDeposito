package main.java.com.admin.modelo;

public abstract class Produto{
    
    protected String produto;
    protected String user;
    protected boolean disp;
    
    public Produto(String produto, String user, boolean disp){
        this.produto = produto;
        this.user = user;
        this.disp = true;
    }

    public String getProduto(){
        return produto;
    }
    public String getUser(){
        return user;
    }

}
