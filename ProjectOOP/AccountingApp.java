class Accounting {
	public double valueOfSupply;
	public static double vatRate = 0.1;

	// 생성자
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

}

public class AccountingApp {

	public static void main(String[] args) {

		Accounting p1 = new Accounting(10000.0);

		Accounting p2 = new Accounting(20000.0);

		System.out.println("value Of Supply: " + p1.valueOfSupply);
		System.out.println("value Of Supply: " + p2.valueOfSupply);

		System.out.println("VAT: " + p1.getVAT());
		System.out.println("VAT: " + p2.getVAT());

		System.out.println("Total: " + p1.getTotal());
		System.out.println("Total: " + p2.getTotal());

	}

}
