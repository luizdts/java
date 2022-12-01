package com.jsfprimefaces.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import com.jsfprimefaces.model.Empresa;
import com.jsfprimefaces.model.RamoAtividade;
import com.jsfprimefaces.model.enums.TipoEmpresa;
import com.jsfprimefaces.repositories.EmpresaRepository;
import com.jsfprimefaces.repositories.RamoAtividadeRepository;
import com.jsfprimefaces.services.CadastroEmpresaService;
import com.jsfprimefaces.util.FacesMessages;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private EmpresaRepository empresas;
    
    @Inject
    private RamoAtividadeRepository ramoAtividades;
    
    @Inject
    private CadastroEmpresaService cadastroEmpresaService;
    
    private List<Empresa> listaEmpresas;
    
    private String termoPesquisa;
    
    private Converter ramoAtividadeConverter;
    
    private Empresa empresa;
    
    public void prepararNovaEmpresa() {
    	empresa = new Empresa();
    }
    
    public void prepararEdicao() {
    	ramoAtividadeConverter = new RamoAtividadeConverter(Arrays.asList(empresa.getRamoAtividade()));
    }
    
    public void salvar() {
    	cadastroEmpresaService.salvar(empresa);
    	
    	atualizarRegistros();
    	
    	messages.info("Empresa salva com sucesso.");
    	
    	RequestContext.getCurrentInstance().update(Arrays.asList("frm:empresasDataTable", "frm:messages"));
    }
    
    public void excluir() {
    	cadastroEmpresaService.excluir(empresa);
    	
    	empresa = null;
    	
    	atualizarRegistros();
    	
    	messages.info("Empresa excluída com sucesso.");
    }
    @Inject
    private FacesMessages messages;
    
    public void pesquisar() {
    	listaEmpresas = empresas.pesquisar(termoPesquisa);
    	
    	if(listaEmpresas.isEmpty()) {
    		messages.info("Sua consulta não retornou registros.");
    	}
    }
    
    public void todasEmpresas() {
        listaEmpresas = empresas.todas();
    }
    
    public List<RamoAtividade> completarRamoAtividade(String termo){
    	List<RamoAtividade> listaRamoAtividades = ramoAtividades.find(termo);
    	
    	ramoAtividadeConverter = new RamoAtividadeConverter(listaRamoAtividades);
    	
    	return listaRamoAtividades;
    }
    private void atualizarRegistros() {
    	if(houvePesquisa()) {
    		pesquisar();
    	} else {
    		todasEmpresas();
    	}
    }
    private boolean houvePesquisa() {
    	return termoPesquisa != null && !"".equals(termoPesquisa);
    }
    
    public List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }
    
    public String getTermoPesquisa() {
		return termoPesquisa;
	}
    
    public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}
    
    public TipoEmpresa[] getTiposEmpresa() {
    	return TipoEmpresa.values();
    }
    
    public Converter getRamoAtividadeConverter() {
		return ramoAtividadeConverter;
	}
    
    public Empresa getEmpresa() {
		return empresa;
	}
    
    public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
    
    public boolean isEmpresaSelecionada() {
    	return empresa != null && empresa.getId() != null;
    }
}