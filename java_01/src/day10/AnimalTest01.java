package day10;

public class AnimalTest01 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.breath();
		
		Animal a2 = new Animal("Dog");
		a2.breath();

		Animal a3 = new Animal("고양이");
		a3.breath();
		
		Dog d1 = new Dog("케리","시베리안허스키");
		d1.breath();
		d1.dogprint();
		Dog d2 = new Dog("Dog1","진돗개","쫑이");
		d2.dogprint();
		
		String animalKind =d2.getKind();
		
		System.out.println(d2.getsuperKind());
	}

}
