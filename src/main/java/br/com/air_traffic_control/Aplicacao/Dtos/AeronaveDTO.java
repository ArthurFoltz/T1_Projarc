package br.com.air_traffic_control.Aplicacao.Dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.air_traffic_control.TipoAeronave;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AeronaveDTO {
    private String Prefixo;
    private TipoAeronave tipo;
    private int VelocidadeCruzeiro;
    private int autonomia;
}
