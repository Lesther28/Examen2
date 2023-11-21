package hn.lenguajes0.carwash.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class reserva {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idReserva;
    private cliente idCliente;
    private vehiculo idVehiculo;
    private Date fecha;
    private int dias;
    private double total;
    
}
