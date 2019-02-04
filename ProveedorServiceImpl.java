package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.bolsadeideas.springboot.app.models.dao.IProductoDao;
import com.bolsadeideas.springboot.app.models.dao.IProveedorDao;

import com.bolsadeideas.springboot.app.models.entity.Producto;
import com.bolsadeideas.springboot.app.models.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	private IProveedorDao proveedorDao;
	@Autowired
	private IProductoDao productoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>) proveedorDao.findAll();
	}

	@Override
	@Transactional
	public void save(Proveedor proveedor) {
		proveedorDao.save(proveedor);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Proveedor findOne(Long id) {
	
		return proveedorDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		proveedorDao.delete(id);
		
	}

	@Override
	public Page<Proveedor> findAll(Pageable pageable) {
		
		return proveedorDao.findAll(pageable);
	}

	@Override
	public List<Producto> findByNombre(String term) {
		
		return productoDao.findByNombre(term);
	}

	@Override
	public Producto findProductoById(Long id) {
		
		return productoDao.findOne(id);
	}

	@Override
	public Page<Proveedor> findAll(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		
	}

	
}


