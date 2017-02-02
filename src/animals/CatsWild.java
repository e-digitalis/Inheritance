/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author User
 */
public class CatsWild extends Cats {

	static String typeOfAnimal = "wild cat";

	public CatsWild() { //constructor for wild cats
		super();
		System.out.println(" It is a " + typeOfAnimal + ", because we chose to create an animal of that type.");
	}

	@Override //overriding methods in super classes
	public void makeSound(){
		System.out.println("Wild cats say arrrrrgh.");
	}
	
}

