
public class Gato extends Animal implements Mascota {
	int numero_bigotes;
	String color;
	int vidas_disponibles = 9;
	
	public Gato(String nombre, int patas, int edad, String color, 
			int vidas_disponibles) {
		super(nombre,patas,edad);
		this.color= color;
		this.vidas_disponibles = vidas_disponibles;
		
	}
	
	//Se declaran los metodos en los hijos porque la clase de la que ereda es abstracta
	public String comer() {
		return "Comiendo atun";
	}
	
//	public String dormir() {
//		return "zzzz";
//	}
	
	//Implementacion de interfaz
	public String trucos() {
		return "Dormir";
	}
	
	public String jugar () {
		return "jugar con estambre";
	}
	
	public String premios() {
		return "Come atun";
	}
	
	
}
