package project;

public class Jet{
	private String model;
	private double speed;
	private double range;
	private double price;

	public Jet(){
		
	}
	
	public Jet(String m, double s, double r, double p) {

		this.model = m;
		this.speed = s;
		this.range = r;
		this.price = p;
	}
	

	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public double getRange() {
		return range;
	}



	public void setRange(double range) {
		this.range = range;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" \n  model: ");
		builder.append(model);
		builder.append("\n  speed: mach ");
		builder.append(speed);
		builder.append("\n  range: ");
		builder.append(range);
		builder.append(" miles\n  price: $");
		builder.append(price);
		builder.append(" million");
		return builder.toString();
	}

}
