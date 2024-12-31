package Generic;

public class demo<T, U> {

	private T one;
	private U two;

	public void setOne(T one) {
		this.one = one;
	}

	public void setTwo(U two) {
		this.two = two;
	}

	public demo(T one, U two) {
		super();
		this.one = one;
		this.two = two;
	}

	public void show() {
		System.out.println("one: " + one);
		System.out.println("two: " + two);

	}

}
