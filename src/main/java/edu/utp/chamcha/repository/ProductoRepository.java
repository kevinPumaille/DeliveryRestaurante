package edu.utp.chamcha.repository;

import com.DeliveryRestaurante.appweb.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.utp.chamcha.model.Producto;

@Repository
public interface  ProductoRepository extends JpaRepository<Producto, Integer>{

    
}