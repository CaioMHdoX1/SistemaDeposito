package main.java.com.admin.modelo.Itens;
import main.java.com.admin.modelo.Produto;

public class Variado extends Produto {
    
    protected String marca;
    protected int quant;

    public Variado(String produto, String user, String marca, boolean disp){
        super(produto, user, disp);
        this.marca=marca;
    }
    public String getVarMarca(){
        return marca;
    }
    public int getVarQuant(){
        return quant;
    }
}
