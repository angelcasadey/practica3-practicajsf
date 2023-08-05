/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author 
 * angel Clase controller que se encarga de procesar informacion de la pantalla restaurantes.xhtml
 */

@ManagedBean // Esta notacion indica que esta clase o bean es un controlador de jsf
@ViewScoped // Nos permite mantener la informacion mientras estemos en la pantalla
			// solicitada
public class RestauranteController {

	/*
	 * Lista de restaurantes para la tabla
	 */
	private List<Restaurante> restaurante;
	
	/*
	 * Lista de restaurantes filtrados
	 */
	private List<Restaurante> restaurantesfiltrados;

	/*
	 * Servicio con los metodos que realizan la logica de negocio de restaurante.
	 */
	private RestauranteService restauranteService = new RestauranteService();

	/*
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct // Invetigar sobre esta notacion
	public void init() {
		this.consultarRestaurantes();
	}

	/*
	 * Metodo que consulta la lista de restaurantes.
	 */
	public void consultarRestaurantes() {
		this.restaurante = this.restauranteService.consultarRestaurantes();

	}

	/**
	 * @return the restaurante
	 */
	public List<Restaurante> getRestaurante() {
		return restaurante;
	}

	/**
	 * @param restaurante the restaurante to set
	 */
	public void setRestaurante(List<Restaurante> restaurante) {
		this.restaurante = restaurante;
	}

	/**
	 * @return the restaurantesfiltrados
	 */
	public List<Restaurante> getRestaurantesfiltrados() {
		return restaurantesfiltrados;
	}

	/**
	 * @param restaurantesfiltrados the restaurantesfiltrados to set
	 */
	public void setRestaurantesfiltrados(List<Restaurante> restaurantesfiltrados) {
		this.restaurantesfiltrados = restaurantesfiltrados;
	}

}
