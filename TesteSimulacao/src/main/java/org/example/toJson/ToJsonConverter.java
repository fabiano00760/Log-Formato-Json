package org.example.toJson;

import com.google.gson.Gson;
import org.example.domain.ObjetoJsonLog;

import java.io.FileWriter;
import java.io.IOException;

public class ToJsonConverter {


    //Classe já existente no projeto atual (Fiserc)
    public static void convertAndSave(ObjetoJsonLog objetoJsonLog, String filePath) {

        Gson gson = new Gson();

        String json = gson.toJson(objetoJsonLog);
        System.out.println(json);

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
