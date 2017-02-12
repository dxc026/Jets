package project;

public abstract class AirCraft {
	protected String model;
	protected double speed;
	protected double range;
	protected double price;

	public AirCraft() {

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

	public AirCraft(String model, double speed, double range, double price) {

		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

}
