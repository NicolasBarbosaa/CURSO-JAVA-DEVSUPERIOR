package entites;

public class Account {
	
	private Integer number;
	private String holder;
	protected  Double balance;
	
	public Account(){}

	
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		balance -= amount +5;
	}
	
	/*
	 * Suponha que a operação de
saque possui uma taxa no valor
de 5.0. Entretanto, se a conta
for do tipo poupança, esta taxa
não deve ser cobrada.
Como resolver isso?
Resposta: sobrescrevendo o
método withdraw na subclasse
SavingsAccount
	 */
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
