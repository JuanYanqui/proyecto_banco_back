package ista.Inventario.api.service;

import ista.Inventario.api.model.Cuenta;
import ista.Inventario.api.model.Rol;

import java.util.List;
import java.util.Optional;

public interface CuentaService extends GenericService <Cuenta, Long>{

    List<Cuenta> getCuentasByUsu(Long usuario);
}
