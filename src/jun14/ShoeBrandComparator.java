package jun14;

import java.util.Comparator;

public class ShoeBrandComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Shoe l1=(Shoe)o1;
		Shoe l2=(Shoe)o2;
		return l1.brand.compareTo(l2.brand);
	}

}
