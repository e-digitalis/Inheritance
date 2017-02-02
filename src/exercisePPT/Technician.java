/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisePPT;

/**
 *
 * @author User
 */

public class Technician extends Employee {

	int numberOfServerCrashes = 0;
	
	public Technician(String aName, double aSalary) {
		super(aName, aSalary);
	}

	@Override
	public double bonus() {
		double bonus = employeeBonusBase - numberOfServerCrashes;
		return bonus;
	}

	public void anotherServerCrash(){
		numberOfServerCrashes=+1;
	}
	
}

