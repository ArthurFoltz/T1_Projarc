package br.com.air_traffic_control.Aplicacao.Service;

import br.com.air_traffic_control.Aplicacao.Dtos.AeroportoDTO;
import br.com.air_traffic_control.Domain.Entities.AeroportoEntity;

public interface IAeroportoService {
    public AeroportoEntity CadastrarNovoAeroporto(AeroportoEntity aeroporto);
}
