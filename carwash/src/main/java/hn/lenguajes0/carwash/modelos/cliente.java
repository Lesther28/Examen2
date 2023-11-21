package hn.lenguajes0.carwash.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cliente")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class cliente {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int codigoCliente;

    private String nombre;
    private String apellido;
    private Date FechaIngreso;

    
    @JsonIgnore 
@ManyToOne
@JoinColumn(name="idTipoCliente", referencedColumnName = "idTipoCliente")
private tipocliente tipocliente;

    
}
