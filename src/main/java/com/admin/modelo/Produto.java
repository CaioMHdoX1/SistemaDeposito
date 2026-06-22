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

    public String getNome(){
        return produto;
    }
    public String getUser(){
        return user;
    }
    public boolean getDisp(){
        return disp; 
    }
    public boolean setDisp(){
        this.disp = disp;
        return disp;
    }

}
