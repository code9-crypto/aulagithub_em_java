package Entidades;

public class Student {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public double notaReprova(double nota) {
		return 60 - nota;
	}
}
