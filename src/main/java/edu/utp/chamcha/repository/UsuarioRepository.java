package edu.utp.chamcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.utp.chamcha.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,String>{
    
}
