package the.best.PAKET;

public class Apple extends Food{
	private String size;
	public Apple(String name) {
    	super("������");
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
		if(this.size == "���������") {
			System.out.println("������������ ���������� ������ ��������� 10 ����");
			super.calories+= 10;
			super.calories1= 10;
		}
		if(this.size == "�������") {
			System.out.println("������������ �������� ������ ��������� 30 ����");
			super.calories1= 30;
			super.calories+= 30;
		}
	}	
	public void consume(){
		System.out.println(this + " �������");
	}
	public String toString() {
		return super.toString() + " ������� '" + size.toUpperCase() + "'";
	}
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
		} else
		return false;
	}
}
