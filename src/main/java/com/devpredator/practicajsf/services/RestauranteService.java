/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Restaurante;

/**
 * 
 * @author angel
 * Clase que permite realizar la logica de negocio para restaurantes
 */
public class RestauranteService {
	
	//Metodo que genera lista de restaurantes
	
	public List<Restaurante> consultarRestaurantes(){
		
		//Genera lista de empleados a consultar.
		List<Restaurante> restaurante = new ArrayList<Restaurante>();
		
		Restaurante restauranteElGranRabano = new Restaurante();
		Restaurante restauranteElCardenal = new Restaurante();
		Restaurante restauranteLaHabana = new Restaurante();
		Restaurante restauranteMafras = new Restaurante();
		Restaurante restauranteLosAgachados = new Restaurante();
		
		restauranteElGranRabano.setNombre("El Gran Rabano");
		restauranteElGranRabano.setDireccion("Calzada de Tlalpan #844");
		restauranteElGranRabano.setPais("México");
		restauranteElGranRabano.setGerente("Fernando Lopéz Robles");
		
		restauranteElCardenal.setNombre("El Cardenal");
		restauranteElCardenal.setDireccion("Bellas Artes, CDMX");
		restauranteElCardenal.setPais("Brasil");
		restauranteElCardenal.setGerente("Luisa Jimenez Guzman");
		
		restauranteLaHabana.setNombre("La Habana");
		restauranteLaHabana.setDireccion("Coacalco, Vicente Guerrero");
		restauranteLaHabana.setPais("Estado de México");
		restauranteLaHabana.setGerente("Martin Godinez Díaz");
		
		restauranteMafras.setNombre("Mafras");
		restauranteMafras.setDireccion("Av. Presidentes, Coacalco");
		restauranteMafras.setPais("Argentina");
		restauranteMafras.setGerente("Eduardo Vivia Morales");
		
		restauranteLosAgachados.setNombre("Los Agachados");
		restauranteLosAgachados.setDireccion("Tacuba, Miguel Hidalgo");
		restauranteLosAgachados.setPais("Mexico");
		restauranteLosAgachados.setGerente("Fernando Lopéz Robles");
		
		restaurante.add(restauranteElGranRabano);
		restaurante.add(restauranteElCardenal);
		restaurante.add(restauranteLaHabana);
		restaurante.add(restauranteMafras);
		restaurante.add(restauranteLosAgachados);
		
		
		return restaurante;
		
	}

}
