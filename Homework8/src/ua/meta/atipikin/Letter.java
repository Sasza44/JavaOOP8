package ua.meta.atipikin;

public class Letter implements Comparable<Letter> {
	private char name;
	private int numberOfRepetitions = 0;
	public Letter() {
		super();
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getNumberOfRepetitions() {
		return numberOfRepetitions;
	}
	public void setNumberOfRepetitions(int numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}
	@Override
	public int compareTo(Letter o) {
		return o.numberOfRepetitions - this.numberOfRepetitions;
	}
}