package com.revature.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;






public class PlanterDAOImpl {
	private static final String URL = "planters_dbtest.txt";
	private static final String tempURL = "planters_dbtest_temp.txt";
	
	File tempDB = new File(tempURL);
	File db = new File(URL);
	
	
	//TODO testing
	public void delPlanter(int id) throws IOException {//
		
		String record;
		String ID = String.valueOf(id);

		BufferedReader br = new BufferedReader(new FileReader(db));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

		while ((record = br.readLine()) != null) {

			if (record.contains(ID))
				continue;

			bw.write(record);
			bw.flush();
			bw.newLine();

		}

		br.close();
		bw.close();
		
		db.delete();

		tempDB.renameTo(db);
		
	}
	
		
	
	List<Planter> getAllPlanters() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(URL));
//TODO needs testing   done??, diff test
		String record;
		List<Planter> planter = new ArrayList<>();

		while ((record = br.readLine()) != null) {//

			StringTokenizer st = new StringTokenizer(record, ",");

			Planter p = new Planter();
			p.setID(Integer.parseInt(st.nextToken()));
			p.setName(st.nextToken());
			p.setGrams(Integer.parseInt(st.nextToken()));
			
			
			planter.add(p);
		}

		br.close();

		return planter ;
	}
	List<Planter> getPlanter(String name) throws IOException{
		//TODO Needs Testing		, working.. test with different fields

		List<Planter> planter = new ArrayList<>();
		String record;
		BufferedReader br = new BufferedReader(new FileReader(URL));
		
		while ((record = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(record, ",");
			
						
			if (record.contains(name)) {
				Planter p = new Planter();
				p.setID(Integer.parseInt(st.nextToken()));
				p.setName(st.nextToken());
				p.setGrams(Integer.parseInt(st.nextToken()));
				planter.add(p);
			}

		}

		br.close();
				
		return planter;
		
	}

	public void savePlanter(Planter planterToSave) throws Exception {
		//TODO Needs Testing.. works, but needs check for existing line		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(URL, true));
		

		bw.write(planterToSave.getID() + "," + planterToSave.getName() 
						+ "," + planterToSave.getGrams());
		bw.flush();
		bw.newLine();
		bw.close();
System.out.println("Success");
	}
	

	public int sizePlanters() {
		return 0;
		
	}
	
}
