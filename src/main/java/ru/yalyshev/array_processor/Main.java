package ru.yalyshev.array_processor;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// DATEWORK 04.10.22
		//Math math = new Math();
		//System.out.println(math.sum(10, 12));
	/*Math math1 = new Math();
	math1.x = 5;
	math1.y = 10;
		System.out.println("Max from: " + math1.x + " or " + math1.y + " = " +
		 math1.max());
		Math math2 = new Math(2,3);
		System.out.println("Min from: " + math2.x + " or " + math2.y + " = " +
		 math2.min());
		System.out.println("Sum: " + math2.x + " and " + math2.y + " = " +
		math2.sum());
	*/
		
		/* // DATEWORK 04.10.22
		C c = new C();
		D d = new D();
		c.sum();
		d.sum();
		*/
		
		/* // DATEWORK 04.10.22
		Square square = new Square(4);
		Rectangle rectangle = new Rectangle(2,3);
		System.out.println("Square perimeter = " + square.getPerimeter());
		System.out.println("Square area = " + square.getArea());
		System.out.println("Rectangle perimeter = " + rectangle.getPerimeter
		());
		System.out.println("Rectangle area = " + rectangle.getArea());
		*/
		
		Person person = new Person("Nick", "Yalyshev", 24); //DATEWORK 04.10.22
		Employer employer = new Employer("Stepan", "Rogov", 19, 12, 15, 23);
		Developer developer =
				new Developer("Ilia", "Pyavkin", 28, 12, 20, 25, "senior",
						"Java");
		String text = "one two three two one";
		String[] twos = text.split("two");
		System.out.println(Arrays.toString(twos));
		System.out.println(developer.getFirstName() + developer.getLastName() +
				developer.getAge());
		
		// DATEWORK 13.10.22
		System.out.println(A.staticField);
		A a = new A();
		A b = new A();
		System.out.println(a.staticField);
		a.staticField = 5;
		System.out.println(b.staticField);
		
		File file = new File();
		file.setName("My file");
		file.setDate(String.valueOf(new Random().nextInt()));
		File fileCopy = file.copy();
		System.out.println("New file name: " + fileCopy.getName());
		System.out.println("New file data: " + fileCopy.getDate());
	}
}
