package ua.lviv.desctop.task2;

public class Second {
	private String name;
	private String type;
	private int age;

	public Second(String y, int z) {
		this.type = y;
		this.age = z;

	}

	public Second(String x, String m, int k) {
		this(m, k);
		this.name = x;
	}

}
