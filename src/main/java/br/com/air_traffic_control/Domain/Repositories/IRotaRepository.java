package br.com.air_traffic_control.Domain.Repositories;

import br.com.air_traffic_control.Domain.Entities.RotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRotaRepository extends JpaRepository<RotaEntity, Long> {
    List<RotaEntity> findAllByOrigemAndDestino(String origem, String destino);
}
