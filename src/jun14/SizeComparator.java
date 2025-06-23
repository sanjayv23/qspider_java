package jun14;

import java.util.Comparator;

public class SizeComparator implements Comparator	{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Shoe s1=(Shoe) o1;
		Shoe s2=(Shoe)o2;
		
		return s1.size.compareTo(s2.size); 
	}

}
