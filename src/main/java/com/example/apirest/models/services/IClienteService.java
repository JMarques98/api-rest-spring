package com.example.apirest.models.services;

import java.util.List;

import com.example.apirest.models.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findbyId(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	

}
