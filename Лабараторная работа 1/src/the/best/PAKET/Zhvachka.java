package the.best.PAKET;

public class Zhvachka extends Food{
    private String flavour;
	public Zhvachka(String flavour) {
    	super("������");
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
		if(this.flavour == "�����") {
			System.out.println("�������� ������ �������� 179 ����");
			super.calories+=179;
			super.calories1=179;
		}
		if(this.flavour == "����") {
			System.out.println("������ ������ �������� 150 ����");
			super.calories1=150;
			super.calories+=142;
		}
		if(this.flavour == "�����") {
			System.out.println("�������� ������ �������� 142 ����");
			super.calories+=142;
			super.calories1=142;
		}
	}	
	public void consume() {
		System.out.println(this + " �������");
	}
	public String toString() {
		return super.toString() + " ����� '" + this.flavour+ "'";
	}
}
