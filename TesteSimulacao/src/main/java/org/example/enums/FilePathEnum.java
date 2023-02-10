package org.example.enums;

public enum FilePathEnum {

    //Definir o path do arquivo, no momento, será salvo na raiz do projeto
    NOME_ARQUIVO_01("nome_arquivo_01.json"),
    NOME_ARQUIVO_02("nome_arquivo_02.json");

    private String name;
    FilePathEnum(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
