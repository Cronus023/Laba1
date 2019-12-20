package the.best.PAKET;

public class Food implements Nutritious,Consumable  {

	private String name = null;
	protected int calories1 = 0;
	static int calories;
	public Food (String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories1;
	}
	public void setCalories(int cal) {
		this.calories1 = cal;
	}
	public void calories(){
		
	}	
	public void consume(){
		
	}
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof Food)) return false;
		if (name==null || ((Food)arg0).name==null) return false;
		return name.equals(((Food)arg0).name);
	}
	public String toString() {
		return name;
	}
	
}
