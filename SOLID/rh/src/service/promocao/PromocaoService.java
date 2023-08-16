package service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	public void promover(Funcionario funcionario, boolean metaBatida) {
		
		Cargo cargo = funcionario.getCargo();
		if (Cargo.GERENTE == cargo) {
			throw new ValidacaoException("Gerentes não podem ser promovidos");
		}
		if(metaBatida) {
			Cargo novoCargo = cargo.getNext();
			funcionario.promover(novoCargo);
		}else {
			throw new ValidacaoException("Funcionario não bateu a meta.");
		}
	}

}
