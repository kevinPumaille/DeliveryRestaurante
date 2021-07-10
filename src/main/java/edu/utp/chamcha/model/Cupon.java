package edu.utp.chamcha.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_cupon")
public class Cupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo_cupon;
    /*
    @Temporal(TemporalType.DATE)
    private Date dueDate;*/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigo_cupon() {
        return codigo_cupon;
    }
    public void setCodigo_cupon(String codigo_cupon) {
        this.codigo_cupon = codigo_cupon;
    }
    
}


