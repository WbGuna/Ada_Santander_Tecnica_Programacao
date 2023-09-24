package br.com.ava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		
		System.out.println("");
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		System.out.println("");
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		System.out.println("");
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		System.out.println("");
		
		List<Integer> list1 = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st11 = list1.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st11.toArray()));
		
		System.out.println("");
		
		int sum = list1.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		List<Integer> newList = list1.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
