package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.sql.SQLOutput;

public class CadastrarAbrigoComand implements Command{
    @Override
    public void execute() {
    try {
        ClientHttpConfiguration client = new ClientHttpConfiguration();
        AbrigoService abrigoService = new AbrigoService(client);

        abrigoService.listarAbrigo();
    }catch (IOException | InterruptedException e) {
        System.out.println(e.getMessage());
    }
    }
}
