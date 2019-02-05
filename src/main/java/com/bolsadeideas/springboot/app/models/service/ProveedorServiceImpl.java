package com.bolsadeideas.springboot.app.models.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IProveedorDao;
import com.bolsadeideas.springboot.app.models.entity.Proveedor;

public class ProveedorServiceImpl implements IProveedorService {
	
	@Autowired
	private IProveedorDao proveedorDao;

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@Transactional
	public void save(Proveedor proveedor) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public Proveedor findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorDao.delete(id);
	}


	@Override
	public Page<Proveedor> findAll(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return proveedorDao.findAll(pageable);
	}


	
	}




