package fvs.edu.br.topicos.enums;

public enum TipoCliente {

	PESSOAFISICA(1), PESSOAJURIDICA(2);
	
	int tipoPessoa;
	
	private TipoCliente(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

}
