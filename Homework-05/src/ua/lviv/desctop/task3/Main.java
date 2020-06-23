package ua.lviv.desctop.task3;

public class Main {

	public static void main(String[] args) {
		Frog f = new Frog();
		Amphibia a = f;

		f.eat();
		f.sleep();
		f.swim();
		f.walk();

	}

}
