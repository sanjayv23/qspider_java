package jun14;

import java.util.Comparator;

public class BrandComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		return l1.brand.compareTo(l2.brand);
	}

}
