package edu.utp.chamcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.utp.chamcha.model.Contact;

@Repository
public interface PruebaRepository extends JpaRepository<Contact, Integer>{
    
}