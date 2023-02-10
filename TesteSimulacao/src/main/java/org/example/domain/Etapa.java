package org.example.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class Etapa {
    private UUID idEtapa;
    private String etapa;
    private String dataExecucaoInicio;
    private String dataExecucaoFinal;
    private long tempoTotalEtapa;


    //Construtor
    public Etapa(UUID idEtapa, String etapa) {
        this.idEtapa = idEtapa;
        this.etapa = etapa;
    }

}
