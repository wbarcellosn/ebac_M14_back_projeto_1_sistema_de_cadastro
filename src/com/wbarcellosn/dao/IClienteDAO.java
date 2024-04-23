/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wbarcellosn.dao;

import com.wbarcellosn.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author winic
 */
public interface IClienteDAO {
    Boolean cadastrar (Cliente cliente);
     void excluir (Long cpf);
     void alterar (Cliente cliente);
     Cliente consultar (Long cpf);
     Collection<Cliente> buscartodos();
}
