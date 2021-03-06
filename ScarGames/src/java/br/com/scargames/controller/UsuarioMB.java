package br.com.scargames.controller;

import br.com.scargames.domain.Usuario;
import br.com.scargames.services.UsuarioService;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "usuarioMB")
@RequestScoped
public class UsuarioMB implements Serializable{

    private Usuario usuario;
    private String email;
    private String senha;
    
    public UsuarioMB() {
    }
    
    public String autenticar(){
        UsuarioService service = new UsuarioService();
        usuario = new Usuario(email, senha);
        if (service.autenticar(usuario)){
            return "/private/index.xhtml?faces-redirect=true";
        }else{
            return null;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
