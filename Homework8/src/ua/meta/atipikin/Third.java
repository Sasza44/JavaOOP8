package ua.meta.atipikin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Third {

	public static void main(String[] args) {
		File b3 = new File("b3.txt");
		String text = fastLoadFromFile(b3); // зчитування тексту з файлу
		String text1 = text.toLowerCase(); // переведення усіх літер в нижній регістр
		List<Letter> letters = new ArrayList<Letter>();
		char[] lettersEn = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for(int i = 0; i < lettersEn.length; i++) {
			Letter letter = new Letter(); // створення об'єкту класу "Letter"
			letter.setName(lettersEn[i]);
			letter.setNumberOfRepetitions(numberOfRep(lettersEn[i], text1));
			letters.add(letter); // додавання виществореного об'єкту до колекції
		}
		Collections.sort(letters);
		for(Letter e: letters) {
			System.out.println(e.getName() + " " + e.getNumberOfRepetitions());
		}
	}
	
	public static String fastLoadFromFile(File file) { // зчитування тексту з файлу
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for(; (text = br.readLine()) != null; ) {
				sb.append(text);
				sb.append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
	
	public static int numberOfRep(char ch, String t) { // пошук кількості повторення символа в рядку
		int x = -2;
		int i = 0;
		for(; x != -1;) {
			if(x == -2) {
				x = t.indexOf(ch);
				if(x != -1) {i += 1;}
			}
			else {
				if(x + 1 < t.length()) {
					x = t.indexOf(ch, x + 1);
					if(x != -1) {i += 1;}
				}
				else {
					x = -1;
				}
			}
		}
		return i;
	}
}