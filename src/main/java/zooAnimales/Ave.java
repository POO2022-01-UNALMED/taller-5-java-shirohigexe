package zooAnimales;
import java.util.ArrayList;

// Clase.
public class Ave extends Animal {
	
	// Atributos.
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	// Constructor.
	public Ave() {
		super();
		Ave.listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	// Getters and Setters.
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	
	public static int getHalcones() {
		return halcones;
	}
	
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	
	public static int getAguilas() {
		return aguilas;
	}
	
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	// Metodos.
	public int cantidadAves() {
		return Ave.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) { 
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco");
	}
}