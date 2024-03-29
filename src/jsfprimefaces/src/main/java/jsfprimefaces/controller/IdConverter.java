package jsfprimefaces.controller;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import jsfprimefaces.entities.Aluno;
import jsfprimefaces.entities.Pessoa;

@FacesConverter("entityConverter")
public class IdConverter implements Converter{
	
	private List<Aluno> listaAlunos;
	
	public IdConverter (List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value == null) {
			return null;
		}
		
		Long id = Long.valueOf(value);
		
		for(Aluno aluno: listaAlunos) {
			if(id.equals(aluno.getId())){
				return aluno;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return null;
		}
		
		Aluno aluno = (Aluno) value;
		
		return aluno.getId().toString();
	}
	
}
