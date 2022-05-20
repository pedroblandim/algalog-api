package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setName("Pedro");
		c1.setTelefone("61 99884-4454");
		c1.setEmail("email@gmail.com");
		
		Cliente c2 = new Cliente();
		c2.setId(2L);
		c2.setName("Marcos");
		c2.setTelefone("61 89747-5554");
		c2.setEmail("aaaa@gmail.com");
		
		return Arrays.asList(c1, c2);
	}
	
}
