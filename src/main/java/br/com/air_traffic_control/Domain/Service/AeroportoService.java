package br.com.air_traffic_control.Domain.Service;

import br.com.air_traffic_control.Aplicacao.Dtos.AeroportoDTO;
import br.com.air_traffic_control.Aplicacao.Service.IAeroportoService;
import br.com.air_traffic_control.Domain.Entities.AeroportoEntity;
import br.com.air_traffic_control.Domain.Repositories.IAeroportoRepository;
import org.springframework.stereotype.Service;

@Service
public class AeroportoService implements IAeroportoService {
    private  final IAeroportoRepository repository;

    public AeroportoService(IAeroportoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AeroportoEntity CadastrarNovoAeroporto(AeroportoEntity aeroporto) {
        return repository.save(aeroporto);
    }
}
