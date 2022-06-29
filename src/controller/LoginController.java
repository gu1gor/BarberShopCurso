package controller;

import View.Login;
import controller.helper.LoginHelper;
import model.Usuario;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    
    public void entrarNoSistema(){
        
        //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo();
        
        
        
        //Pegar um Usuario da View
        //Pesquisar Usuário no Banco
        //Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco, direcionar para menu principal
        //Senão mostrar uma mensagem ao usuario "Usuario ou senha invalidos" 
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados.");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
