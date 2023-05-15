package br.com.air_traffic_control.Aplicacao.Service;

import br.com.air_traffic_control.Aplicacao.Dtos.AeronaveDTO;
import br.com.air_traffic_control.Domain.Entities.AeronaveEntity;

public interface IAeronaveService {
    AeronaveEntity CadastrarAeronave(AeronaveDTO aeronave);
}
