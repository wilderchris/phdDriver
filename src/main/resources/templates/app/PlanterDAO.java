package com.revature.app;

import java.util.List;



public interface PlanterDAO {
	public void delPlanter(int id);
	
	
	
	List<Planter> getAllPlanters();
	List<Planter> getPlanter(int id);

	void savePlanter(Planter planterToSave) throws Exception;

	public int sizePlanters();
}
