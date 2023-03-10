package capitulo4;

public class TesteHerenca {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setAlimentar("Todo Animal se Alimenta"); // Geral para Animal
		animal.setLocomove("Todo animal se locomove");  // Geral para Animal
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimentar("Cachorro é animal então come"); // Herdou de animal
		cachorro.setLocomove("Cachorro é animal então se lomove"); // Herdou de animal
		cachorro.setLatido("Só cachorros latem"); // Especifico de Cachorro
		
		Animal poodle = new Cachorro();
		poodle.setAlimentar("Poddle Come");
		poodle.setLocomove("Poodle locomove");
		// Por ser do tipo Animal, ele não consegue latir
		
	}
	
}
