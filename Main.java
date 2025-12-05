package kuro3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Sample> list = Arrays.asList(
				            new Sample(10),
				            new Sample(20),
				            new Sample(30));
		Predicate<Sample> x = s -> list.contains(s);
		if (x.test(new Sample(20))) {
			System.out.println("ok");			
		}
	}

}
