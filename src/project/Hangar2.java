package project;

import java.util.Arrays;
import java.util.Scanner;



public class Hangar2 {
	Jet j = new Jet();
	public static int index = 0;
	
	Jet[] jets = new Jet[50];{
		
		jets[0] = new Jet("F4 PHANTOM", 2.23, 1615, 2.4);
		jets[1] = new Jet("F-14 TOMCAT", 2.34, 1840, 38);
		jets[2] = new Jet("AV-8B HARRIER II", 0.9, 2100, 30);
		jets[3] = new Jet("F/A-18 HORNET", 1.8, 2070, 29);
		jets[4] = new Jet("F-22 RAPTOR", 2.25, 2000, 150);
		index = 4;
		
	}
	
	
	
	
	
	public void newJet() {
		
		Scanner kb = new Scanner(System.in);

//		Employee emp = new Employee();

		System.out.println("Enter model name: ");
		String modelName = kb.nextLine();

		System.out.println("Enter max speed in MPH: ");
		double maxSpeed = kb.nextDouble();

		System.out.println("Enter maxRange in miles: ");
		double maxRange = kb.nextDouble();

		System.out.println("Enter price in millions: ");
		double priceMill = kb.nextDouble();


		
		maxSpeed = maxSpeed * 0.00130332;
		j.setModel(modelName);
		j.setSpeed(maxSpeed);
		j.setRange(maxRange);
		j.setPrice(priceMill);
		index++;
		jets[index] = j;

	}
	
@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Welcome to the Fantastic World of Jets!");
		builder.append("\n\nHere is our Fleet of Jets: ");
		builder.append(Arrays.toString(jets));
	
		return builder.toString();
	}

public Jet[] getJets() {
	return jets;
}

public void setJets(Jet[] jets) {
	this.jets = jets;
}





}
