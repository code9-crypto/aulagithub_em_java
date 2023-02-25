package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public final Double imposto() {
		double total = 0.0;
		if( numeroFuncionarios <= 10 ) {
			total = (super.getRendaAnual() * 0.16);
		}else if( numeroFuncionarios > 10 ){
			total = (super.getRendaAnual() * 0.14);
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
