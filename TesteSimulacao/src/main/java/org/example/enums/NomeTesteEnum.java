package org.example.enums;

public enum NomeTesteEnum {
    //Aqui é definido o nome do teste
    TC001("TC001"),
    TC002("TC002");

    private String name;

    NomeTesteEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
