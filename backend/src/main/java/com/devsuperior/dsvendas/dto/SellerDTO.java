package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.util.List;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public SellerDTO() {
		super();
	}

	public SellerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
