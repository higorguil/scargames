package br.com.scargames.services;

import br.com.scargames.dao.BibliotecaDao;
import br.com.scargames.domain.Biblioteca;
import java.util.List;

public class BibliotecaService {
    
    private final BibliotecaDao bibliotecaDao = new BibliotecaDao();
    
    public List<Biblioteca> listar(){
        return bibliotecaDao.listar();
    }
    
    public Biblioteca consultar(Integer id){
        return bibliotecaDao.consultar(id);
    }
    
    public Boolean inserir(Biblioteca biblioteca){
        return bibliotecaDao.inserir(biblioteca);
    }
    
    public Boolean alterar(Biblioteca biblioteca){
        return bibliotecaDao.alterar(biblioteca);
    }
    
    public Boolean excluir(Biblioteca biblioteca){
        return bibliotecaDao.excluir(biblioteca);
    }       
}
