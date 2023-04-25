package finalexam;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSelectionSort {
	SelectionSort sort;
	
	@Before
	public void setup() {
		sort = new SelectionSort();
	}
	
	@Test
	public void testPositive() {
		int input[] = {3, 2, 5, 4, 1, 6};
		int expected[] = {1, 2, 3, 4, 5, 6};
		sort.selectionSort(input);
		assertArrayEquals("Sorted positive list", expected, input);
	}
	
	@Test
	public void testNegatives() {
		int input[] = {-4, -2, -6, -1, -5, -3};
		int expected[] = {-6, -5, -4, -3, -2, -1};
		sort.selectionSort(input);
		assertArrayEquals("Sorted negative list", expected, input);
	}
	
	@Test
	public void testMixed() {
		int input[] = {3, -2, 0, -3, 1, -1, 2};
		int expected[] = {-3, -2, -1, 0, 1, 2, 3};
		sort.selectionSort(input);
		assertArrayEquals("Sorted mixed list", expected, input);
	}

}
