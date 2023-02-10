package org.example.enums;

public enum TempoExecucaoEnum {

    //Utilizado somente para identificar no json o tempo de execução, se por acaso se trata de segundos ou minutos
    SEGUNDOS(" Segundos"),
    MINUTOS(" Minutos");

    private String name;

    TempoExecucaoEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
