import java.util.Comparator;
public class ComparatorDemo implements Comparator{
	public int compare(Object o1, Object o2){
		Laptops l1 = (Laptops)o1;
		Laptops l2 = (Laptops)o2;
		int result = l1.model.compareTo(l2.model);
		if(result >0){
			return -1;
		}else if(result <0){
			return 1;
		} else{
			return 0;
		}
	}
}