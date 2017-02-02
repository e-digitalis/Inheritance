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

public class Receptionist extends Employee {

	int age;
	double bonus;
	
	public Receptionist(String aName, double aSalary, int age) {
		super(aName, aSalary);
		this.age = age;
	}

	@Override
	public double bonus() {
		bonus = employeeBonusBase + age*30;
		return bonus;
	}

}

