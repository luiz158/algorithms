package org.persapiens.algorithms.sort;

import org.persapiens.algorithms.sort.Sort;
import org.persapiens.algorithms.sort.InsertionSort;

/**
 *
 * @author marcelo
 */
public class InsertionSortAscendingTest extends AbstractSortTest  <Integer, Integer>{

    @Override
    protected Sort createSort() {
        return InsertionSort.builder().ascending(true).build();
    }

	@Override
	ArrayBuilder<Integer, Integer> createArrayBuilder() {
		return new ArrayBuilder<>(new IdentidadeTransformar<Integer>()
			, new IdentidadeArrayTransformar<Integer>());
	}
}
