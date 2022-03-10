package com.revature.app;

import java.util.ArrayList;
import java.util.Objects;

public class Spool {
	private int id;
	private String name;
	private int grams;
	
	
	 double eSun = 8.7;// ounces
	 double enomaker = 5.1;// ounces
	 double overture = 8.5; //238.136 grams 
	static double amazonBasics = 8.4;
	static double eryone = 6.6;
	static double TTYt = 6.1;
	static double solutech = 6.6;
	static double unlabeledClear = 4.7;
	
	
	final double conversionFactor = 28.35; // 1 ounce to 28.35 grams

	
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public int getGrams() {
		// TODO Auto-generated method stub
		return this.grams;
	}

	public void setGrams(int grams) {
		// TODO Auto-generated method stub
		this.grams = grams;
	}

	public int gramsTest(int plastic, int grams) {
		int gramsConv = (int) Math.round(grams * conversionFactor);
		return (gramsConv - plastic);
	}

	public int planterTest(ArrayList<String> planters, String input) {

		int result = 0;

		for (int i = 0; i <= planters.size(); i++) {

			if (planters.get(i).equals(input)) {// working
				result = i;
				// System.out.println(planters.size());
				break;
			}
		}

		return result;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Spool planter = (Spool) o;
		return Objects.equals(id, planter.id);
	}

	public int hashCode() {
		return Objects.hash(id);
	}

	public String toString() {
		return "Planter{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", grams=" + grams + '}';
	}

///////////////////////////////////////below is orig. interface
//	public String getName();
//	public void setName(String name);
//	
//	public int getGrams();
//	public void setGrams(int grams);
//	//public int process(int plastic, int grams);
//	public int gramsTest(int plastic, int grams);
//	public int planterTest(ArrayList<String> planter, String input);
//	

}
