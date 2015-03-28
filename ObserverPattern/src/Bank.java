import java.util.ArrayList;
import java.util.List;

public class Bank implements Subject {

	private List<Observer> observer;
	private String BankName;
	private double interestRate;

	Bank(){
		observer = new ArrayList<Observer>();
				
	}
	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
		notifyObserver();
	}

	@Override
	public void register(Observer obs) {
		// TODO Auto-generated method stub
		if (obs == null)
			throw new NullPointerException("Null Observer");
		if (!observer.contains(obs))
			observer.add(obs);

	}

	@Override
	public void unregister(Observer obs) {
		// TODO Auto-generated method stub
		if (obs == null)
			throw new NullPointerException("Null Observer");
		observer.remove(obs);

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		if (this.observer.isEmpty()) {
			System.out.println("No Subscriber");
			return;
		}
		for (Observer obs : this.observer) {

			obs.Update(this);

		}
	}

}
