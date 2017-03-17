package Controlador;
import java.util.ArrayList;
import java.util.Iterator;

import Modelo.Animal;
import Modelo.Modelo;
import Vista.Principal;

public class Controlador {
	
	private Principal principal;
	private Modelo modelo;
	
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public void mostrarAnimales() {
		ArrayList<Animal> animales = modelo.select();
		principal.mostrarAnimales(animales);
	}
	public void Guardar() {
		
		
	}
}
