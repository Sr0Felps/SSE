package com.SSE_Server_Sent_Events.component;

import com.SSE_Server_Sent_Events.model.LeituraTemperatura;
import com.SSE_Server_Sent_Events.service.EventoService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class SensorSimulador {
    private final EventoService service;
    private final Random random = new Random();
    private final String[] sensores = {"sala", "server", "externo"};

    public SensorSimulador(EventoService service) { this.service = service; }

    @Scheduled(fixedRate = 2000)
    public void emitir() {
        for (String s : sensores) {
            LeituraTemperatura l = new LeituraTemperatura(s, 20.0 + random.nextDouble() * 10, System.currentTimeMillis());
            service.publicar("temperatura", l);
        }
    }
}