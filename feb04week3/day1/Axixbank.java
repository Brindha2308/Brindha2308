package feb04week3.day1;

public class Axixbank extends Bankinfo {
	public void deposit() {
		System.out.println("Axis deposit account");
	}
	public static void main(String[] args) {
		Axixbank bank = new Axixbank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}

}
