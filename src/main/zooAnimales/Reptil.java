package zooAnimales;
import java.util.ArrayList;

// Clase.
public class Reptil extends Animal {
	
	// Atributos.
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	// Constructor.
	public Reptil() {
		super();
		Reptil.listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	// Getters and Setters.
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public static int getIguanas() {
		return iguanas;
	}
	
	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}
	
	public static int getSerpientes() {
		return serpientes;
	}
	
	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
	// Metodos.
	public int cantidadReptiles() {
		return Reptil.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
}