package com.bolsadeideas.springboot.app.models.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.bolsadeideas.springboot.app.models.entity.Proveedor;

public interface IProveedorDao extends PagingAndSortingRepository<Proveedor, Long> {

	
	public Page<Proveedor> findAll(Pageable pageable);
}
