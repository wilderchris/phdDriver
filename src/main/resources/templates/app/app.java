package com.revature.app;

import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlanterDAOImpl dao = new PlanterDAOImpl();
		
		Planter octopus = new Planter();
		octopus.setName("Octopus");
		octopus.setID(0);
		octopus.setGrams(59);
		List<Planter> outPlanter = new ArrayList<Planter>();
		try {
			dao.savePlanter(octopus);
			outPlanter =dao.getPlanter("octopus");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(outPlanter);
	
	
	
	}

}
