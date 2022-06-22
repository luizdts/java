package model.entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double notaAprovacao() {
		if(mediaFinal()/3 < 60.0) {
			return (60.0 - (mediaFinal()/3));
		} else {
			return 0;
		}
	}
	
}
