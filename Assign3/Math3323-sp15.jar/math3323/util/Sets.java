package math3323.util;

import java.util.Iterator;
import java.util.Set;

public class Sets {

	/**
	 * THis class only provides static utilities.
	 * You can't instantiate it.
	 */
	private Sets() {}
	
	
	/**
	 * 	Choose one element from aSet and return it.
	 * @param <T> The type of element in the set is not relevant
	 * @param aset A non-empty set.  
	 * 			An exception will be thrown if the set is empty.
	 * @return One element from aSet
	 */
	public static <T> T choose(Set<T> aSet) {
		if(aSet.isEmpty()) {
			throw new IllegalArgumentException("Sets.choose: parameter is empty");
		}
		Iterator<T> it = aSet.iterator();
		return it.next();
	}
	
	
}
