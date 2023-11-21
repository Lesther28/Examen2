package hn.lenguajes0.carwash.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

@Entity
@Table(name="vehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class vehiculo {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idVehiculo;
    private String marca;
    private int anio;
    private boolean disponible;

    @JsonIgnore 
    @ManyToOne
    @JoinColumn(name="idTipoVehiculo", referencedColumnName = "idTipoVehiculo")
    private tipovehiculo tipovehiculo;



}
