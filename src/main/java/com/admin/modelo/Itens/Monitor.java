package main.java.com.admin.modelo.Itens;
import main.java.com.admin.modelo.Produto;

public class Monitor extends Produto {
    protected int cgr;

    public Monitor(String produto,String user,int cgr){
        super(produto, user);
        this.cgr = cgr;

    }

    public int getMoniCgr(){
        return cgr;
    }

}
