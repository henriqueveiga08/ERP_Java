package poo.trabalho.controller;

import java.util.ArrayList;
import poo.trabalho.model.Cliente;

public class ControleCliente {
    
    ArrayList<Cliente> clientelist = new ArrayList<>();
   
    Cliente cliente = new Cliente();

    public void adicionarCliente(String nome) {
        cliente.setNome(nome);
        clientelist.add(cliente);
    }
    
    public void mostrarCliente(){
        for (Cliente c : clientelist){
            System.out.println("nome cadastrado: "+c);
        }
    }
    
    
}
