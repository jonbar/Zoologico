package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Modelo extends Conector{

	public Modelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void insert(Animal animal) {
		Statement st;
		try {
			st = super.getConexion().createStatement();
			st.execute("INSERT INTO animal (nombre) VALUES ('" + animal.getNombre()+ "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Animal> select() {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		try {
			Statement st = super.getConexion().createStatement();
			ResultSet rs = st.executeQuery("select * from animal");
			while (rs.next()) {
				animales.add(new Animal(
						rs.getInt("id"), 
						rs.getString("nombre")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animales;
	}
	
}
