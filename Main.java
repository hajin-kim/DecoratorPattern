// Main
public class Main {
	public static void main(String args[]) {
		Beverage espressoDoubleMocha = new Mocha(new Mocha(new Espresso()));
		System.out.println(espressoDoubleMocha.getDescription() + espressoDoubleMocha.cost());
	}
}