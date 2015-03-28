
public class PratikSubscriber implements Observer{

	private String Name;
	
	@Override
	public void Update(Object topic) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" Update feed:: "+((Bank)topic).getBankName()+" Bank interest rate = "+((Bank)topic).getInterestRate());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
