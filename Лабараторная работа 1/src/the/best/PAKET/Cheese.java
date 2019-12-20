package the.best.PAKET;

public class Cheese extends Food{
	public Cheese(String name) {
    	super(name);
    }
	public int getCalories() {
		return calories1;
	}
	public void setCalories(int calories) {
		this.calories1 = calories;
	}
	public void calories() {
		System.out.println("Колорийность сыра равняется 125");
		super.calories += 125;
		super.calories1 = 125;
	}	
	public void consume() {
		System.out.println(this + " съеден");
	}

}