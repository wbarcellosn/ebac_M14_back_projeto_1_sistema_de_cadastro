/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wbarcellosn.dao;

import com.wbarcellosn.domain.Cliente;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author winic
 */
public class ClienteSetDAO implements IClienteDAO{
    
    private Set<Cliente> set;
    
    public ClienteSetDAO(){
        set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        
        for(Cliente cliente : this.set){
            if(cliente.getCpf().equals(cpf)){
                clienteEncontrado = cliente;
                break;
            }
        }
        
        if(clienteEncontrado != null){
            this.set.remove(clienteEncontrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        
        if(this.set.contains(cliente)){
            for(Cliente clienteCadastrado : this.set){
                
                if(clienteCadastrado.equals(cliente)){
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setCpf(cliente.getCpf());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setEndereco(cliente.getEndereco());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());                    
                    break;
                }
            }
        }
        
    }

    @Override
    public Cliente consultar(Long cpf) {
        for(Cliente clienteCadastrado : this.set){
                
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        
        return null;
    }

    @Override
    public Collection<Cliente> buscartodos() {
        return this.set;
    }
    
}
