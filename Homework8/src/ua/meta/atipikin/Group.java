package ua.meta.atipikin;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Group implements Serializable {
	private String groupName;
	private List<Student> students = new ArrayList<Student>();
	public Group() {}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Student> getStudents() {
		return students;
	}
	
//	@Override
//	public String toString() {
//		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
//	}
	public String toString() {
		List<String> lastNames = new ArrayList<String>(); // створення колекції прізвищ студентів для зручності сортування
 		for(Student e: students) {
			lastNames.add(e.getLastName());
		}
 		Collections.sort(lastNames);
 		String s = "";
 		for(String e: lastNames) {
 			s += e + " ";
 		}
 		return s;
	}
	
	
	public void addStudent(Student student) { // додавання студента в групу
		if(!students.contains(student)) { // перевірка на наявність об'єкту, який хочемо додати
			students.add(student);
		}
	}
	
	
	public Student searchStudentByLastName(String lastName) { // пошук студента в групі
		for(Student e: students) {
			if(e.getLastName() == lastName) {
				return e;
			}
		}
		return null;
	}
	
	
	public void removeStudentByID(int id) { // видалення студента за номером заліковки
		int i = 0;
		for(Student e: students) {
			if(e.getId() == id) {
				students.remove(i);
				return;
			}
			i += 1;
		}
	}
}