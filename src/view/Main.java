package view;

import model.Cliente;
import model.Servico;
import model.Usuario;

public class Main {
    
    public static void main(String[] args) {
        
        String nome = "Mendes";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Tiago", 'M', "93524178", "Rua Tesla 9456");
        System.out.println(cliente);
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario);
    }
    
    
}
