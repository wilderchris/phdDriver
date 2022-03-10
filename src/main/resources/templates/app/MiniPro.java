package com.revature.app;

import java.util.ArrayList;
import io.javalin.Javalin;

public class MiniPro {

	public static void main(String[] args) {
		String htmlFormFt = "<h2><center><div style=\"background: rgb(69, 182, 95); border: "+
							"8px solid #700007;\"><p style=\"margin: 15px; line-height: 1.5;\"><br><br>";
		String htmlFormBk = "<br><br></div> </p></center></h2>";
						
		ArrayList<String> planters = new ArrayList<String>();
		ArrayList<Double> grams = new ArrayList<Double>();
		//ArrayList<String> spoolTare = new ArrayList<String>();		// TODO add the spool roll names and tare weight
				
		planters.add(0,"Octopus");
		planters.add(1,"Large Bear");
		planters.add(2,"baby Bear");
		planters.add(3,"Fox");
		planters.add(4,"Batman");
		planters.add(5,"Yoda");
		planters.add(6,"C3P0");
		planters.add(7,"Darth Vader");
		planters.add(8,"Snail");
		planters.add(9,"Penguin");
		planters.add(10,"Error No Planter exists for input \"No Content\" ");
		
		grams.add(0,(double) 59);
		grams.add(1,(double) 64);
		grams.add(2,(double) 33);
		grams.add(3,(double) 56);
		grams.add(4,(double) 48);
		grams.add(5,(double) 41);
		grams.add(6,(double) 59);
		grams.add(7,(double) 61);
		grams.add(8,(double) 181);
		grams.add(9,(double) 29);
		grams.add(10,(double) 204);
		
		double plastic = Spool.overture;//TODO refigure Calc and ...this
			
			Javalin app = Javalin.create();
			app.start();
			
			
				
			
			
		app.post("/MiniPro", ctx ->{
				
			String[] input = new String[2];
				
			input[0] = ctx.formParam("planter");
			input[1] = ctx.formParam("plastic");
			
			double testIn1 = Double.parseDouble(input[1]);		
			double testIn2 = 0;
			
			
			
		Planter plant = new Planter();	// change Octopus to Planter and loose the interface??
		testIn2 = plant.planterTest(planters, input[0]);
				
		int plasticLeft = plant.gramsTest((int)plastic, (int)testIn1);
		
		
		for (int i = 0; i <= testIn2; i++) {
		
			
			if(i == testIn2 && plasticLeft < grams.get(i)) {
				ctx.html(htmlFormFt +plasticLeft +" grams of plastic is left on your roll <br> subtracting the spool weight of "+ plastic + "<br>"
						+"You are " +( grams.get(i)-plasticLeft) + " grams of plastic short to print "+ planters.get(i)+ htmlFormBk);
			}else if(i == testIn2 && grams.get(i) < plasticLeft){		
				ctx.html(htmlFormFt +plasticLeft +" grams of plastic is left on your roll<br> subtracting the spool weight of "+ plastic + "<br>"
						+"You can print "+ planters.get((int)testIn2) +" " + String.format("%.2f",(plasticLeft / grams.get((int) testIn2))) + " times"+ htmlFormBk);
			}else {
				ctx.html(htmlFormFt +grams.get(9)+planters.get(9)+ htmlFormBk);
			}
			
		}
			
		
			});
	
	
		//app.get("/PlanterInput.html", ctx::	planters);
			
			
	
	}//end main
				
}	
		
		
