package collections_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyRandom {
	// Collections Framework 1 zadaca
	public static String next(int n) {
		String result = "";
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

 		Collections.shuffle(numbers);
		
		return numbers.subList(0, n).toString();
	}

}
