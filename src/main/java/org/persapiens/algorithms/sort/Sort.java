package org.persapiens.algorithms.sort;

import java.util.List;

/**
 *
 * @author marcelo
 */
public interface Sort <T extends Comparable> {
	List<T> sort(List<T> items);
	
	boolean isAscending();
	
	boolean compare(T first, T second);
}
