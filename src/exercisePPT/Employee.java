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

public abstract class Employee {

	private String name;
	private double salary;
	protected final double employeeBonusBase;

	abstract public double bonus(); // forcing everyone to make their own method
	// to implement the bonus

	public Employee(String aName, double aSalary) {
		this.employeeBonusBase = 3000;
		this.name = aName;
		this.salary = aSalary;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double oneSalary){
		this.salary=oneSalary;
	}
	
	public double getSalary(){
		return salary;
	}

}

