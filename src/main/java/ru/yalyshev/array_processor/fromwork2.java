package ru.yalyshev.array_processor;

/*public class fromwork2 {
	static void hello(){
		System.out.println("Hello world!");
	}
	
	public static void main(String[] args) {
		hello();
	}
	public static void main(String[] args) {
		A.hello();
		B.hello();
	}
	static void name(String name){
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		name("Andrey");
		A.hello();
		B.hello();
	}*/
	
	
	/*static int [] createRandomArray ( int count, int max){
	int [] array = new int[count];
		Random rand = new Random();
		for (int i = 0; i < count; i++) {
 		array[i] = rand.nextInt(max);
		}
		return array;
	}
	static int arraySum (int []array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
	static void printArray (int [] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [] array = createRandomArray(10, 100);
		printArray(array);
		System.out.println("Сумма элементов массива: " + arraySum(array));
	}
	
	static int fact(int n){
		if (n==1)return 1;
		if (n==2)return 2;
		else return fact(n-1)*n;
	}
}
	public static void main(String[] args){
		Person person1 = new Person();
		person1.setNameAndAge("Andrey", 27);
		person1.sayHello();
		person1.speek();
		int person1OldAge = person1.calculetePersonOldAge();
		System.out.println("До пенсии Андрею осталось " + person1OldAge + " " +
				"лет");
	}
	
	static class Person{
		String name;
		int age;
		
		void setNameAndAge(String username, int userage){
			name = username;
			age = userage;
		}
		
		int calculetePersonOldAge(){
			final int yearOld = 65;
			int year = yearOld-age;
			return year;
		}
		void speek(){
			for (int i = 0; i < 3; i++) {
				System.out.println(" My name is " + name + ", I'm " + age);
			}
		}
		void sayHello(){
			System.out.println("Hello " + name);
		}
	}
	public static void main(String[] args) {  // DATEWORK 04.10.22
		File file = new File();
		file.setName("My files");
		file.setDate(String.valueOf(new Random().nextInt()));
		File fileCopy = file.copy();
		System.out.println("New file name " + fileCopy.getName());
		System.out.println("New file date " + fileCopy.getDate());
	}
	static class File { // DATEWORK 04.10.22
		private String name;
		private String date;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getDate() {
			return date;
		}
		
		public void setDate(String date) {
			this.date = date;
		}
		
		public File copy (){
			File file = new File();
			file.date= this.date;
			file.name =this.name + " (copy)";
			return file;
		}
	}
	
}
  class Math { // DATEWORD 04.10.22
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
}*/

/*class Math { // DATEWORK 04.10.22
	int x, y;
	
	public Math() {
		this.x = 0;
		this.y = 0;
	}
	
	public Math(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int sum() {
		return x + y;
	}
	
	public int min() {
		return x <= y ? x : y;
	}
	public int max() {
		return x >= y ? x : y;
	}
}*/

/* // DATEWORK 04.10.22
class C {
	int x = 2;
	int y = 5;
	public void sum(){
		System.out.println(x+y);
	}
}
class D extends C{

}

 */
/*
class Square { //DATEWORK 04.10.22
	int width;
	
	public Square(int width) {
		this.width = width;
	}
	
	public int getPerimeter() {
		return 4 * width;
	}
	public int getArea (){
		return width * width;
	}
}
class Rectangle extends Square {
	int height;
	
	
	public Rectangle(int width, int heigth) {
		super(width);
		this.height = heigth;
	}
	
	public int getPerimeter() {
		return 2 * (width + height);
	}
	
	public int getArea() {
		return width * height;
	}
}*/
class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int setAge(int value) {
		if (value<0){
			this.age = 0;
		} else {
			this.age = value;
		}
		return value;
	}
}

class Employer extends Person {
	
	private int inn;
	private int number;
	private int snils;
	Employer(String firstName, String lastName, int age, int inn, int number,
			 int snils) {
		super(firstName, lastName, age);
		this.inn = inn;
		this.number = number;
		this.snils = snils;
	}
}

class Developer extends Employer {
	
	private String level;
	private String language;
	
	public Developer(String firstName, String lastName, int age, int inn,
					 int number, int snils, String level, String language) {
		super(firstName, lastName, age, inn, number, snils);
		this.level = level;
		this.language = language;
	}
}
	class File {
		
		private String name;
		
		private String date;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getDate() {
			return date;
		}
		
		public void setDate(String date) {
			this.date = date;
		}
		
		public File copy(){
			File file = new File();
			file.date = this.date;
			file.name = this.name + " (copy)";
			return file;
		}
	}

