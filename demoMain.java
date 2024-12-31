package Generic;

public class demoMain {
	public static void main(String[] args) {

		// one = int two= String.
		demo<Integer, String> d = new demo<>(101, "bhushan");
		d.show();

		System.out.println();

		// one =String two =String.
		demo<String, String> de = new demo<>("Bhushan", "Galphade");
		de.show();

		System.out.println();

		// one double two int.
		demo<Double, Integer> dem = new demo<>(22.3d, 234);
		dem.show();
	}

}
