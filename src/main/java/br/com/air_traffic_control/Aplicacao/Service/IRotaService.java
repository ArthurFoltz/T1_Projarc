package br.com.air_traffic_control.Aplicacao.Service;

import br.com.air_traffic_control.Aplicacao.Dtos.RotaDTO;
import br.com.air_traffic_control.Domain.Entities.RotaEntity;

import java.util.List;

public interface IRotaService {
    RotaEntity CadastrarNovaRota(RotaEntity rota);

    List<RotaEntity> ConsultarRotasEntreDoisAeroportos(String origem, String destino);
    List<RotaEntity> ListarRotas();
    RotaEntity findRotaById(long id);
}
