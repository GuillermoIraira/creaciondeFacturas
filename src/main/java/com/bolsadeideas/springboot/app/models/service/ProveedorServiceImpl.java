package com.bolsadeideas.springboot.app.models.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.bolsadeideas.springboot.app.models.entity.Proveedor;

public class ProveedorServiceImpl implements IProveedorService {

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Proveedor> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Proveedor proveedor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Proveedor findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
