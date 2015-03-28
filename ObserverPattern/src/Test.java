public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank BOA = new Bank();
		BOA.setBankName("Bank of America");
		BOA.setInterestRate(3.20);

		Bank citiBank = new Bank();
		citiBank.setBankName("Citi Bank");
		citiBank.setInterestRate(2.11);
	
	PratikSubscriber User1 = new PratikSubscriber();
	User1.setName("Pratik");
	PratikSubscriber User2 = new PratikSubscriber();
	User2.setName("Tom");
	PratikSubscriber User3 = new PratikSubscriber();
	User3.setName("Jose");
	
	BOA.register(User1);
	BOA.register(User2);

	citiBank.register(User3);
	
	BOA.setInterestRate(5);
	citiBank.setInterestRate(10);
	}

}
