package org.example;

import org.example.domain.Etapa;
import org.example.domain.ObjetoJsonLog;
import org.example.enums.FilePathEnum;
import org.example.enums.NomeEtapaEnum;
import org.example.enums.NomeTesteEnum;
import org.example.enums.TempoExecucaoEnum;
import org.example.toJson.ToJsonConverter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Variável guardando data de início do teste
        LocalDateTime dataExecucaoInicio = LocalDateTime.now();

        //UUID do teste
        UUID idTeste = UUID.randomUUID();

        //UUID da etapa
        UUID idEtapa = UUID.randomUUID();

        //Instânciando objeto json (contendo informações do header) - No construtor são passados somente os parâmetros "idTeste" e o nome do teste em si
        ObjetoJsonLog objetoJsonLog = new ObjetoJsonLog(idTeste, NomeTesteEnum.TC001.getName());

        //Instânciando lista do objetoJsonLog (contendo informações sobre a etapa) - No construtor são passados somente os parâmetros "idTeste" e o nome do teste em si
        Etapa etapaTeste = new Etapa(idEtapa, NomeEtapaEnum.ETAPA_TESTE_1.getName());

        //Setando o início do teste
        objetoJsonLog.setDataExecucaoInicio(dataExecucaoInicio.toString());

        //Variável guardando início da etapa
        LocalDateTime etapaTempoInicio = LocalDateTime.now();

        //Setando a data de início da etapa
        etapaTeste.setDataExecucaoInicio(etapaTempoInicio.toString());

        //ATENÇÃO -> Função responsável por iniciar etapa AQUI!

        //Thread Sleep simulando tempo de execução (pode deletá-la)
        Thread.sleep(3000);

        //Variável guardando data final da etapa
        LocalDateTime etapaTempoFinal = LocalDateTime.now();

        //Setando a data final da etapa
        etapaTeste.setDataExecucaoFinal(etapaTempoFinal.toString());

        //Variável guardando tempo total da etapa
        long tempoTotalEtapa = etapaTempoInicio.until(etapaTempoFinal, ChronoUnit.MILLIS);

        //Setando o tempo total da etapa
        etapaTeste.setTempoTotalEtapa(tempoTotalEtapa);

        //Variável guardando data final do teste
        LocalDateTime dataExecucaoFinal = LocalDateTime.now();

        //Setando data final do teste
        objetoJsonLog.setDataExecucaoFinal(LocalDateTime.now().toString());

        //Variável guardando tempo total da execução do teste
        long tempoTotalTeste = dataExecucaoInicio.until(dataExecucaoFinal, ChronoUnit.MILLIS);

        //Setando tempo total da execução do teste
        objetoJsonLog.setTempoTotalTeste(tempoTotalTeste);

        //Adicionando a lista "etapaTeste" ao objetoJsonLog
        objetoJsonLog.etapas.add(etapaTeste);

        //Método já existente responsável por gravar o teste no arquivo json
        ToJsonConverter.convertAndSave(objetoJsonLog, FilePathEnum.NOME_ARQUIVO_01.getName());
    }
}