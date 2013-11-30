package org.acg.radixsort;

import java.util.ArrayList;

import org.acg.linkedqueue.QueueLinked;

public class RadixSort {
	// Numeros decimales de no mas de 3 digitos
	public RadixSort() {
		//Clase de servicio
	}

	// Coste del algoritmo: O(9+3n+9m) n: numero de elementos de una lista,
	// m: numeros de elementos en cada cola de digitos
	public ArrayList<Integer> ordenar(ArrayList<Integer> pNumberList) {
		int div = 1;
		@SuppressWarnings("unchecked")
		QueueLinked<Integer> queue[] = (QueueLinked<Integer>[]) new QueueLinked[10];
		// ArrayList<QueueLinked<Integer>> queueArray = new
		// ArrayList<QueueLinked<Integer>>();

		// Inicializar el array de colas de digitos
		for (int digit = 0; digit <= 9; digit++) {
			queue[digit] = new QueueLinked<>();
		}
		// Algoritmo radixSort
		for (int position = 0; position < 3; position++) {
			for (int elem : pNumberList) {
				int digit = (elem / div) % 10;
				queue[digit].insert(elem);
			}
			// Eliminamos de las queues para meterlas en una lista ordenados
			int totalPosList = 0;
			for (int digit = 0; digit <= 9; digit++) {
				while (!queue[digit].isEmpty()) {
					pNumberList.set(totalPosList++, queue[digit].remove());
				}
			}
			div *= 10; // 0->10, 1-> 100, 2->1000
		}
		return pNumberList;
	}
}
