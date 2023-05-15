package br.com.air_traffic_control;

public enum TipoAeronave {
    PARTICULAR_PEQUENO_PORTE("Aeronave particular de pequeno porte"),
    COMERCIAL_PASSAGEIROS("Aeronave comercial de passageiros"),
    COMERCIAL_CARGA("Aeronave comercial de carga");

    private String descricao;

    TipoAeronave(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
