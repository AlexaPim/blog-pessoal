package org.generation.demoblogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.demoblogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);

	public Usuario findByNome(String string);

	public List<Usuario> findAllByNomeContainingIgnoreCase(String string);
	
}
