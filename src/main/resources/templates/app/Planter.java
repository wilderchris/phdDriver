package com.revature.app;

import java.util.ArrayList;
import java.util.Objects;

public class Planter {//model
	
	int id = 0;
	int grams = 0;
	String name = "";
	final double conversionFactoroz = 28.35;	// 1 ounce to 28.35 grams
	public Planter(){}

	public Planter(int id, String name, int grams) {
		super();
		this.id = id;
		this.name = name;
		this.grams = grams;
		
		
	}
	public int getId() {
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
			// Done? more testing or better output for check Auto-generated method stub
			int gramsConv = (int)Math.round(grams * conversionFactoroz);
			//System.out.println(gramsConv);
			return (gramsConv-plastic);
		}

	
		public int planterTest(ArrayList<String> planters, String input) {
			
	int result = 0;
			
			for (int i = 0;i <= planters.size();i++) {
				
				if (planters.get(i).equals(input)) {//working
					result = i;
					//System.out.println(planters.size());
					break;
				}
			}
			
			
			return result;
		}
	
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Planter planter = (Planter) o;
	    return Objects.equals(id, planter.id);
	}

	
	public int hashCode() {
	    return Objects.hash(id);
	}

	public String toString() {
	    return "Planter{" +
	            "id='" + id + '\'' +
	            ", name='" + name + '\'' +
	            ", grams=" + grams +
	            '}';
	}
	

	
}
