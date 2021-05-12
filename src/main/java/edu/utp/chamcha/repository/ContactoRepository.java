package edu.utp.chamcha.repository;

import com.DeliveryRestaurante.appweb.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.utp.chamcha.model.Contacto;
@Repository
public interface  ContactoRepository extends JpaRepository<Contacto, Integer>{

    
}