package jun14;

import java.util.Comparator;

public class TypeComparator implements Comparator	{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Shoe s1=(Shoe) o1;
		Shoe s2=(Shoe)o2;
		
		return s1.type.compareTo(s2.type); 
	}

}
