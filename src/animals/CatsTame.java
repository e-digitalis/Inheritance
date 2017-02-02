package animals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class CatsTame extends Cats {

	static String typeOfAnimal = "tame cat";

	public CatsTame() { //constructor for tame cat
		super();
		System.out.println(" It is a " + typeOfAnimal + ", because we chose to create an animal of that type.");

	}
	
	@Override //overriding methods in super classes
	public void makeSound(){
		System.out.println("Tame cats also say meow.");
	}

}
