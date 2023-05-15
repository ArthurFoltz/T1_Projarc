package br.com.air_traffic_control.Domain.Repositories;

import br.com.air_traffic_control.Domain.Entities.RefGeoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IRefGeoRepository extends JpaRepository<RefGeoEntity, Long> {
    List<RefGeoEntity> findAll();
}
