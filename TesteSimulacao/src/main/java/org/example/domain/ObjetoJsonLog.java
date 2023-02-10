package org.example.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ObjetoJsonLog {
    private UUID idTeste;
    private String nomeDoTeste;
    private String dataExecucaoInicio;
    private String dataExecucaoFinal;
    private long tempoTotalTeste;
    private String status;

    //Lista do tipo Etapa
    public List<Etapa> etapas = new ArrayList<>();


    //Construtor
    public ObjetoJsonLog(UUID idTeste, String nomeDoTeste) {
        this.idTeste = idTeste;
        this.nomeDoTeste = nomeDoTeste;
    }

}
