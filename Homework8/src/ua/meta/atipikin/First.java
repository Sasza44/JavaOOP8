package ua.meta.atipikin;

import java.util.List;
import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
		outList();
	}
	public static void outList() {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Pear");
		fruits.add("Peach");
		fruits.add("Apricot");
		fruits.add("Nectarine");
		fruits.add("Plum");
		fruits.add("Orange");
		fruits.add("Tangerine");
		fruits.add("Kiwi");
		fruits.add("Mango");
		System.out.println(fruits);
		fruits.remove(0);
		fruits.remove(0);
		fruits.remove(fruits.size() - 1);
		System.out.println(fruits);
	}
}