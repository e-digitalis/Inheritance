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

import java.util.ArrayList;

public class CalculateBonus {

	public static double sumBonus(ArrayList<Employee> empl) {
		double totBonus = 0;
		for(Employee currentEmployee : empl){
			totBonus+=currentEmployee.bonus();
		}
		
		return totBonus;
	}

}

