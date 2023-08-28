package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServiceMCU {
    static String webService = "https://www.whenisthenextmcufilm.com/api";
    static int codigoSucesso = 200;

    public NewsMCU newsMCU() throws Exception {
        String urlParaChamada = webService;

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);

            ObjectMapper objectMapper = new ObjectMapper();

            NewsMCU news = objectMapper.readValue(jsonEmString, NewsMCU.class);
            return news;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
