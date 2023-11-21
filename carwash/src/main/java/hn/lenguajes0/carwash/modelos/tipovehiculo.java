package hn.lenguajes0.carwash.modelos;

import hn.lenguajes0.carwash.servicios.Impl.tipovehivulo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class tipovehiculo {
   
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idTipoVehiculo;

    private String descripcion;
    private double precioXHora;
    public static tipovehivulo save(tipovehiculo nvotipovehiculo) {
        return null;
    }

}
