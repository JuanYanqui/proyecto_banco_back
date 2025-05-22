package ista.Inventario.api.controller;

import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.model.PreguntaSeguridad;
import ista.Inventario.api.payload.PreguntaFilter;
import ista.Inventario.api.payload.RespuestaFilter;
import ista.Inventario.api.service.FotoUsuarioService;
import ista.Inventario.api.service.PreguntaSeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntaSeguridad")
@CrossOrigin(origins = ("http://localhost:5000"))
public class PreguntasSeguridadController {
    @Autowired
    private PreguntaSeguridadService preguntaSeguridadService;

    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public PreguntaFilter obtenerPreguntas(@PathVariable Long idUsuario) {
        return preguntaSeguridadService.obtenerPreguntaSeguridad(idUsuario);
    }

    @GetMapping("/verificarResp")
    @ResponseBody
    @CrossOrigin
    public RespuestaFilter verificarResp(
            @RequestParam Long idFoto,
            @RequestParam Long idPregunta,
            @RequestParam String respuesta) {
        return preguntaSeguridadService.verificarRespuestas(idFoto, idPregunta, respuesta);
    }

}
