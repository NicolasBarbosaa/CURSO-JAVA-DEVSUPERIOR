package entites;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuorPerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuorPerHour, Integer hours) {
		this.date = date;
		this.valuorPerHour = valuorPerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuorPerHour() {
		return valuorPerHour;
	}

	public void setValuorPerHour(Double valuorPerHour) {
		this.valuorPerHour = valuorPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
	return valuorPerHour * hours; 
	}
	
}
