package edu.utp.chamcha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_user")
public class Usuario {
    @Id
    @Column(name = "user_id")
    private String email;
    private String nombre;
    private String password;
    
    
}

