
//Las clases abstractas pueden tener hijos, puede herredar pero no crear 
//objetos de ella, como que solo dicta lo que llevaran sus hijos pero no les dice
//como hacerlo
public abstract class Animal {
	protected String nombre = "";
	protected int patas;
	protected int edad;
	
	public Animal(String nombre,int patas, int edad) {
		this.nombre = nombre;
		this.patas = patas;
		this.edad = edad;
	}
	
//	Para que una clase sea abstracta debe de tener al menos un metodo abstracto
	public abstract String comer();
	
	public String dormir() {
		return "zzzzzz";
	}
}
