package edu.utp.chamcha;

import com.DeliveryRestaurante.appweb.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.utp.chamcha.model.Usuario;
@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, String>{

    
}