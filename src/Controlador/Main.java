package Controlador;

import Vista.*;
import Modelo.*;
import Controlador.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Principal principal = new Principal();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		controlador.setPrincipal(principal);
		
		principal.setControlador(controlador);
		
		principal.setVisible(true);
		
		
	}

}
