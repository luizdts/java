package jsfprimefaces.controller;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import jsfprimefaces.entities.Pessoa;

@FacesConverter("entityConverter")
public class IdConverter implements Converter{
	
	private List<Pessoa> listaPessoas;
	
	public void listaPessoas(List<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value == null) {
			return null;
		}
		
		Long id = Long.valueOf(value);
		
		for(Pessoa pessoa: listaPessoas) {
			if(id.equals(pessoa.getId())){
				return pessoa;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return null;
		}
		
		Pessoa pessoa = (Pessoa) value;
		
		return pessoa.getId().toString();
	}
	
}
