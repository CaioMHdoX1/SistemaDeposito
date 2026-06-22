package main.java.com.admin.Repositorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

import main.java.com.admin.modelo.Produto;
import main.java.com.admin.modelo.Excecoes.ArquivoNaoExisteException;
import main.java.com.admin.modelo.Itens.Monitor;
import main.java.com.admin.modelo.Itens.Notebook;
import main.java.com.admin.modelo.Itens.Variado;

public class RepositorioProdutosTXT implements IRepositorioProdutos{
    private String f;

    public RepositorioProdutosTXT(){
        this.f = "produtos.txt";
        try{
            File a = new File(f);
            if(!a.exists()){
                a.createNewFile();
            }
        } catch( Exception e){
                throw new ArquivoNaoExisteException("Erro!");
            }
    }
    public void cadastrar(Produto produto){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            escreverLinha(bw, produto);
            bw.close();
        }catch (Exception e){
            throw new RuntimeException("Erro");
        }
    }
    public Produto buscar(String nome){
        for (Produto b : listar()){
            if(b.getNome().equalsIgnoreCase(nome)){
                return b;
            }
        }
        return null;
    }

    public void atualizar(Produto prod){
        Vector<Produto> prod1 = listar();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            for(Produto a : prod1){
                if(a.getNome().equalsIgnoreCase(prod1.getNome()))escreverLinha(bw, prod1);
                else escreverLinha(bw, a);
            }
        }
    }


    public void escreverLinha(BufferedWriter bw, Produto prod) throws Exception{
        String l = "";
        if(prod instanceof Monitor){
            Monitor m = (Monitor) prod;
            l = "P;" + m.getNome() + m.getUser() + ";" +";" + m.getDisp() + ";" + m.getMoniMarca() + ";" + m.getMoniCgr();
        }else if (prod instanceof Notebook){
            Notebook n = (Notebook) prod;
            l = "N" + ";" + n.getNome() + ";" + ";" + n.getDisp()+ ";" + n.getNoteMarca() + ";" + n.getNoteCgr();
        }else if (prod instanceof Variado){
            Variado v = (Variado) prod;
            l = "V" + ";" + v.getNome() + ";" + v.getUser()+ ";" + v.getVarMarca() + ";" + v.getVarQuant();
        }
        bw.write(l + "\n");
    }


}

