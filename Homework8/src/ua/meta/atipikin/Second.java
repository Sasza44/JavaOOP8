package ua.meta.atipikin;

public class Second {

	public static void main(String[] args) {
		Student tipikin = new Student(); // створення студента
		tipikin.setName("Oleksandr");
		tipikin.setLastName("Tipikin");
		tipikin.setId(7217);
		
		Student nikolaev = new Student();
		nikolaev.setName("Ivan");
		nikolaev.setLastName("Nikolaev");
		nikolaev.setId(7227);
		
		Student melnikov = new Student();
		melnikov.setName("Evgen");
		melnikov.setLastName("Melnikov");
		melnikov.setId(7226);
		
		Student shakura = new Student();
		shakura.setName("Oleg");
		shakura.setLastName("Shakura");
		shakura.setId(7224);
		
		Group em72 = new Group("EM-72"); // створення групи
		em72.addStudent(tipikin); // додавання студента в групу
		em72.addStudent(nikolaev);
		em72.addStudent(melnikov);
		em72.addStudent(shakura);
		
		System.out.println(em72);
		em72.removeStudentByID(7224); // відрахування студента (не здав сесію)
		System.out.println(em72);
	}
}