package org.acg.radixsort;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RadixSort ordenarPorRadixSort = new RadixSort();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(170);
		lista.add(45);
		lista.add(75);
		lista.add(90);
		lista.add(2);
		lista.add(24);
		lista.add(802);
		lista.add(66);
		lista = ordenarPorRadixSort.ordenar(lista);
		System.out.println(lista.toString());

	}

}
