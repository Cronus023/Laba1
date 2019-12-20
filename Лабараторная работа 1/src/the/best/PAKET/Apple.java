package the.best.PAKET;

public class Apple extends Food{
	private String size;
	public Apple(String name) {
    	super("Яблоко");
    	this.size = name;
    }
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCalories() {
		return calories1;
	}
	public void setCalories(int calories) {
		this.calories1 = calories;
	}
	public void calories() {
		if(this.size == "маленькое") {
			System.out.println("Колорийность маленького яблока равняется 10 Ккал");
			super.calories+= 10;
			super.calories1= 10;
		}
		if(this.size == "большое") {
			System.out.println("Колорийность большого яблока равняется 30 Ккал");
			super.calories1= 30;
			super.calories+= 30;
		}
	}	
	public void consume(){
		System.out.println(this + " съедено");
	}
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
		} else
		return false;
	}
}
