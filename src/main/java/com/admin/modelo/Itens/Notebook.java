package main.java.com.admin.modelo.Itens;
import main.java.com.admin.modelo.Produto;

public class Notebook extends Produto {
    
    protected String marca;
    protected int cgr;

    public Notebook(String produto, String user, int cgr, boolean disp, String marca){
        super(produto, user, disp);
        this.marca=marca;
        this.cgr = cgr;
    }
    public String getNoteMarca(){
        return marca;
    }
    public int getNoteCgr(){
        return cgr;
    }
}
