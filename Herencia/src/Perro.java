
public class Perro extends Animal implements Mascota, Cuidados {
	String raza = "";
	String color = "";
	float peso = 0;
	
	public Perro (String nombre, int patas, int edad, String raza, String color, 
			float peso) {
		super(nombre, patas, edad);
		this.raza = raza;
		this.color = color;
	}
	public String ladrar() {
		return "¡Guaf!";
	}
	/*
	 * El polimorfismo permite redifinir metodos que son heredados
	 */
	@Override
	public String comer(){
		return "El perro de raza " + this.raza + " esta " +
				"comiendo croquetas";
	}
	
	//Se declaran los metodos en los hijos porque la clase de la que ereda es abstracta
	
		public String dormir() {
			return "zzzz";
		}
		
//	Implementacion de la interfaz Mascota
		public String trucos() {
			return "Dar la patita";
		}
		
		public String jugar () {
			return "jugar con la pelota";
		}
		
		public String premios() {
			return "Come galletas";
		}
	// Implementacion Cuidados
		
		 public String pasear() {
			 return "Ir al veterinario";
		 }
}
