package ista.Inventario.api.service;

import ista.Inventario.api.model.Cuenta;
import ista.Inventario.api.model.FotoUsuario;
import ista.Inventario.api.repository.CuentaRepository;
import ista.Inventario.api.repository.FotoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuentaServiceImpl extends GenericServiceImpl<Cuenta, Long> implements CuentaService{
    @Autowired
    CuentaRepository cuentaRepository;

    @Override
    public CrudRepository<Cuenta, Long> getDao() {
        return null;
    }

    @Override
    public List<Cuenta> getCuentasByUsu(Long usuario) {
        return cuentaRepository.getByUsuId(usuario);
    }
}
