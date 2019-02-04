package com.bolsadeideas.springboot.app.models.service;


import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.models.dao.IProveedorDao;

import com.bolsadeideas.springboot.app.models.entity.Proveedor;



@Service
public class ProveedorServiceImpl implements IProveedorService {
	
	
	
	@Autowired
	private IProveedorDao proveedorDao;
	
	

	@Override
	@Transactional(readOnly = true)
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>) proveedorDao.findAll();
	
		
		
	}

	
	@Transactional(readOnly = true)
	public Page<Proveedor> findAll(Pageable pageable) {
	
		
		return null;
	
	
	}

	@Override
	@Transactional
	public void save(Proveedor proveedor) {
		proveedorDao.save(proveedor);

	}

	@Override
	@Transactional(readOnly =true )
	public Proveedor findOne(Long id) {
		
		return proveedorDao.findOne(id);
	}

	@Override
	public void delete(Long id) {
		proveedorDao.delete(id);

	}

	@Override
	public Page<Proveedor> findAll(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
