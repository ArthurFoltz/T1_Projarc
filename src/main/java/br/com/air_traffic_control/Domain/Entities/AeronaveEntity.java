package br.com.air_traffic_control.Domain.Entities;

import lombok.*;

import javax.persistence.*;

import br.com.air_traffic_control.TipoAeronave;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "aeronaves")
public class AeronaveEntity {
    @Id
    @Column(name = "prefixo", nullable = false)
    private String Prefixo;
    private TipoAeronave tipo;
    private int VelocidadeCruzeiro;
    private int autonomia;
}
