package com.bolsadeideas.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bolsadeideas.springboot.app.models.service.IClienteService;

@Controller
@SessionAttributes("proveedor")
public class ProveedorController {
	
	private IClienteService clienteService;
	
	
	

}
