package entities;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double soma() {
		return nota1 + nota2 + nota3;
	}
	
	public String verifica_nota() {
		if (soma() >=60.0) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
	
	public String toString() {
		
		return "FINAL GRADE = "
				+String.format("%.2f%n", soma())
				+""+verifica_nota();
				}

	
	
	

}
