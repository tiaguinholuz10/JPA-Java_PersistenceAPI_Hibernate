package br.com.tt.dao;

public interface IDAO<T> {
	void salvar(T entity);

	T buscar(Long id);
}
