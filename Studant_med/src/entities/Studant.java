package entities;

public class Studant {
	public String name;
	public double a1;
	public double a2;
	public double a3;
	public double media;
	
	public void calcMedia() {
	media = a1 + a2 + a3;
}
	public void showResults() {
		System.out.printf("FINAL GRADE: %.2f \n", media);
		if(media < 60.0) {
			System.out.println("FAILED!");
			double missing = (media - 60) * -1;
			System.out.printf("MISSING %.2f",missing);
		} else {
			System.out.println("PASS!");
		}
	 }		
}