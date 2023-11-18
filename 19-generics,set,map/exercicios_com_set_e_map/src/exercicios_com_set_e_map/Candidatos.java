package exercicios_com_set_e_map;

import java.util.Objects;

public class Candidatos implements Comparable<Candidatos> {
	private String nome;
	
	public Candidatos() {
		
	}

	public Candidatos(String nome) {
		this.nome = nome;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatos other = (Candidatos) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Candidatos other) {
		return nome.compareTo(other.getNome());
	}
	
}
