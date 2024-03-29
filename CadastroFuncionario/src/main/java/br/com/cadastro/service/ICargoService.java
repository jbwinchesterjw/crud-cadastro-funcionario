package br.com.cadastro.service;

import java.util.List;

import br.com.cadastro.domain.Cargo;

public interface ICargoService {

void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
}
