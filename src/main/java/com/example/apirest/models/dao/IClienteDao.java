package com.example.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.apirest.models.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
