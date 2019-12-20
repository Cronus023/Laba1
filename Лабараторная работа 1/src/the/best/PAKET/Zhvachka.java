package the.best.PAKET;

public class Zhvachka extends Food{
    private String flavour;
	public Zhvachka(String flavour) {
    	super("Жвачка");
    	this.flavour = flavour;
    }
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public int getCalories() {
		return calories1;
	}
	public void setCalories(int calories) {
		this.calories1 = calories;
	}
	public boolean equals(Object arg0) {
		if (super.equals(arg0)){
			if (!(arg0 instanceof Zhvachka)) return false;
		return flavour.equals(((Zhvachka)arg0).flavour);
		} else
			return false;
		}

	public void calories() {
		if(this.flavour == "арбуз") {
			System.out.println("Арбузная жвачка содержит 179 Ккал");
			super.calories+=179;
			super.calories1=179;
		}
		if(this.flavour == "мята") {
			System.out.println("Мятная жвачка содержит 150 Ккал");
			super.calories1=150;
			super.calories+=142;
		}
		if(this.flavour == "вишня") {
			System.out.println("Вишневая жвачка содержит 142 Ккал");
			super.calories+=142;
			super.calories1=142;
		}
	}	
	public void consume() {
		System.out.println(this + " съедена");
	}
	public String toString() {
		return super.toString() + " вкуса '" + this.flavour+ "'";
	}
}
