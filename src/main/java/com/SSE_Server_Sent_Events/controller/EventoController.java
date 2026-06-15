package com.SSE_Server_Sent_Events.controller;

import com.SSE_Server_Sent_Events.service.EventoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/sensores")
@CrossOrigin(origins = "*")
public class EventoController {
    private final EventoService eventoService;
    public EventoController(EventoService eventoService) { this.eventoService = eventoService; }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter stream() {
        SseEmitter emitter = new SseEmitter(-1L);
        eventoService.registrar(emitter);
        emitter.onCompletion(() -> eventoService.remover(emitter));
        emitter.onTimeout(() -> eventoService.remover(emitter));
        emitter.onError((e) -> eventoService.remover(emitter));
        return emitter;
    }
}
