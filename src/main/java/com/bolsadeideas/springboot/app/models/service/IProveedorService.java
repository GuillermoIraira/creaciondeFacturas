package com.bolsadeideas.springboot.app.models.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.bolsadeideas.springboot.app.models.entity.Proveedor;

public interface IProveedorService {

	public List<Proveedor> findAll();
	
	public Page<Proveedor> findAll(Pageable pageable);

	public void save(Proveedor proveedor);
	
	public Proveedor findOne(Long id);
	
	public void delete(Long id);
	
	
	
	

}
