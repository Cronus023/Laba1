package the.best.PAKET;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Food []breakfast = new Food[5];
		int sum =0;
		System.out.println("До сортировки");
		breakfast[0] = new Zhvachka("мята");
		breakfast[0].calories();
		breakfast[0].consume();
		
		breakfast[1] = new Cheese("сыр");
		breakfast[1].calories();
		breakfast[1].consume();
		
		breakfast[2] = new Zhvachka("вишня");
		breakfast[2].calories();
		breakfast[2].consume();
			
		breakfast[3] = new Apple("маленькое");
		breakfast[3].calories();
		breakfast[3].consume();
	
		breakfast[4] = new Apple("большое");
		breakfast[4].calories();
		breakfast[4].consume();
		
		sum+=breakfast[4].calories;
	   
		System.out.println("После сортировки");
	    Arrays.sort(breakfast, new FoodComparator());
	    for(int i=0;i<5;i++){
	    	breakfast[i].calories();
	    }
	    
		System.out.print("Общая колорийность 'завтрака' равна:");
		System.out.println(sum);
	}
}
