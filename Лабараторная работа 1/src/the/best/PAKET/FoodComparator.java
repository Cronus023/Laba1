package the.best.PAKET;
import java.util.Comparator;

public class FoodComparator implements Comparator<Food>{
	public int compare(Food arg0, Food arg1){
		 if (arg0==null) return 1;
		 if (arg1==null) return -1;
		 if(arg0.getCalories()>arg1.getCalories()) {
		     return -1;
		 };
		 if(arg0.getCalories()<arg1.getCalories()) {
		     return 1;
		 };
		 if(arg0.getCalories() == arg1.getCalories()) {
		     return 0;
		 };
		 return 0;
	}
}

