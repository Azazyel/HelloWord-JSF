package br.unitins.exajax.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ExAjaxController implements Serializable {
	private static final long serialVersionUID = -1515814180397007920L;

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirConsole() {
		System.out.println("Imprimir no Console"); 
	}
	
}
