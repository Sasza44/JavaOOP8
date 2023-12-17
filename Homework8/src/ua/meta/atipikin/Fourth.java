package ua.meta.atipikin;

import java.util.LinkedList;
import java.util.Queue;

public class Fourth {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("Sheldon");
		queue.offer("Leonard");
		queue.offer("Volovitc");
		queue.offer("Kutrapalli");
		queue.offer("Penny");
		System.out.println(queue);
		sellSomeTimes(queue, 2); // кількаразовий відпуск коли
		System.out.println(queue);
	}
	
	public static Queue<String> drinkCola(Queue<String> q) { // один відпуск коли
		String e1 = q.peek();
		String e2 = q.poll();
		q.offer(e1);
		q.offer(e2);
		return q;
	}

	public static Queue<String> sellSomeTimes(Queue<String> q, int n) { // кількаразовий відпуск коли
		for(int i = 1; i <= n; i++) {
			drinkCola(q);
		}
		return q;
	}
}