package entites;

public class People {
	
	private char genero;
	private double height;

	public People() {
		
	}

	 public People(double height, char genero) {
	        this.height = height;
	        this.genero = genero;
	    }


	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return height + "," + genero;
		
	}
	
	
}
