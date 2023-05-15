package br.com.air_traffic_control.Domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planoDeVoo")
public class PlanoDeVooEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planoDeVoo_id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "rota_id")
    private RotaEntity rotaEntity;

    private int altitude;
    private int velocidade;

    private LocalDate data;
    private String status;
    private int numeroVoo;
}
