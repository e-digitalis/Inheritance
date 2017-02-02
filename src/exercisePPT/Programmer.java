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

public class Programmer extends Employee {

	int numberOfApplications;
	
	public Programmer(String aName, double aSalary) {
		super(aName, aSalary);
	}

	@Override
	public double bonus() {

		double bonus = employeeBonusBase * numberOfApplications;
		return bonus;
	}

	public void anotherApplication(){
		numberOfApplications+=1;
	}
	
}

