package ua.meta.atipikin;

public class RepeatStudentException extends Exception {
	
	public RepeatStudentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RepeatStudentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RepeatStudentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RepeatStudentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "This student already exists in this group!";
	}
}
