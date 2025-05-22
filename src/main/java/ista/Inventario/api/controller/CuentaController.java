package ista.Inventario.api.controller;

import ista.Inventario.api.model.Cuenta;
import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.service.CuentaService;
import ista.Inventario.api.service.FotoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
@CrossOrigin(origins = ("http://localhost:5000"))
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;

    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Cuenta> getCuentas(@PathVariable Long idUsuario) {
        return cuentaService.getCuentasByUsu(idUsuario);
    }
}
