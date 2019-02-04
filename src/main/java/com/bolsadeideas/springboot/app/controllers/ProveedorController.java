package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bolsadeideas.springboot.app.models.entity.Proveedor;
import com.bolsadeideas.springboot.app.models.service.IProveedorService;


@Controller
@SessionAttributes("proveedor")
public class ProveedorController {
	
	@Autowired
	private IProveedorService proveedorServices;
	
	@RequestMapping(value = "/formProveedor")
	public String crear(Map<String, Object> model) {

		Proveedor proveedor = new Proveedor();
		model.put("proveedor", proveedor);
		model.put("titulo", "Crear proveedor");
		return "form";
	}
	
	
	@GetMapping(value = "/ver/{id}")
	public String ver(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {

		Proveedor proveedor = proveedorServices.findOne(id);
		if (proveedor == null) {
			flash.addFlashAttribute("error", "El Proveedor no existe en la base de datos");
			return "redirect:/proveedor/listar";
		}

		model.put("proveedor", proveedor);
		model.put("titulo", "Detalle proveedor: " + proveedor.getNombre());
		return "ver";
	}
	
	
	

}
