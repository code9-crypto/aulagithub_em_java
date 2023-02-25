package entities;

public class PessoaFisica extends Pessoa {

	private Double saude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public final Double imposto() {
		Double total = 0.0;
		if ( super.getRendaAnual() < 20000.00 ) {
			total = (super.getRendaAnual() * 0.15) - (saude * 0.5);
		} else if ( super.getRendaAnual() >= 20000.00 ) {
			total = (super.getRendaAnual() * 0.25) - (saude * 0.5);
		}
		return total;
	}
	
	@Override
	public String toString() {
		return super.getNome() + 
				": $ " + 
				String.format("%.2f", imposto());
	}
  
}
