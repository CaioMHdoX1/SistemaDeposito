package main.java.com.admin.modelo.Excecoes;

import javax.management.RuntimeErrorException;

public class ArquivoNaoExisteException extends RuntimeErrorException {
    public ArquivoNaoExisteException(message){
        super(message);
    }
}
