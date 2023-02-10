package org.example.enums;

public enum NomeEtapaEnum {

    //Aqui é definido o nome da etapa
    ETAPA_TESTE_1("ETAPA_TESTE_1"),
    ETAPA_TESTE_2("ETAPA_TESTE_2");

    private String name;

    NomeEtapaEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
