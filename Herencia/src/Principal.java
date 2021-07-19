
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal("Gato", 4, 2);
		//System.out.println(animal.comer());
		
		System.out.println("\n*********************************************");
		Perro canelo = new Perro("Perro", 4, 5, "Labrador", "Cafe", 5.9f);
		System.out.println(canelo.comer());
		System.out.println(canelo.ladrar());
		
		System.out.println("\n*********************************************");
		Gato pulgas = new Gato("Gato",4,2,"anaranjado",7);
		System.out.println(pulgas.comer());
		System.out.println(pulgas.dormir());
		

	}

}
