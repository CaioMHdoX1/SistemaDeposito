package main.java.com.admin.modelo.Itens;
import main.java.com.admin.modelo.Produto;

public class Notebook extends Produto {
    protected int cgr;

    public Notebook(String produto, String user, int cgr){
        super(produto, user);
        this.cgr = cgr;
        
    }

    public int getNoteCgr(){
        return cgr;
    }
}
