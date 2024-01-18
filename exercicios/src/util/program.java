package util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class program {
	
	private String holder;
	private int number;
	private double balance;
	
	public program(String holder, int number) {
		super();
		this.holder = holder;
		this.number = number;
	}

	public program(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}
	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}


	public Double getBalance() {
		return balance;
	}
	
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	public static String data() {
	LocalDate dataAtual = LocalDate.now();

    // Definir o formato da data
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Converter a data em uma string formatada
    String dataFormatada = dataAtual.format(formatoData);
    
    return dataFormatada;
	}
	
	public static boolean validarDigitos(String numberAccount) {
		
        if (numberAccount.length() != 4) {
            System.out.println("A entrada deve ter exatamente 4 dígitos!");
            return false;
        }else {
        	return true;
        }
}
}
	
