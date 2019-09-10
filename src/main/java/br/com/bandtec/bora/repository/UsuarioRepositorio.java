package br.com.bandtec.bora.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bandtec.bora.model.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
	
	@Query("from Usuario where usuario = ?1 and senha = ?2")
	Usuario ExistLogin(String usuario, String senha);
	
}
