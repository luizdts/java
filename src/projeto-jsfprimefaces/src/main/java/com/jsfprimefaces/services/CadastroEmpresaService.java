package com.jsfprimefaces.services;

import java.io.Serializable;

import javax.inject.Inject;

import com.jsfprimefaces.model.Empresa;
import com.jsfprimefaces.repositories.EmpresaRepository;
import com.jsfprimefaces.util.Transacional;

public class CadastroEmpresaService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmpresaRepository empresas;
	
	@Transacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}
}
