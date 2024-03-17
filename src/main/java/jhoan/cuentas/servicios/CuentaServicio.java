package jhoan.cuentas.servicios;

import jhoan.cuentas.modelo.Cuenta;
import jhoan.cuentas.repositorio.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServicio  implements ICuentaServicio{

    @Autowired
    private CuentaRepositorio _cuentaRepositorio;

    @Override
    public List<Cuenta> listarcuenta() {
        return _cuentaRepositorio.findAll();
    }

    @Override
    public Cuenta buscarCuentaPorID(Integer idCuenta) {
        return _cuentaRepositorio.findById(idCuenta).orElse(null);
    }

    @Override
    public void guardarCuenta(Cuenta cuenta) {
        _cuentaRepositorio.save(cuenta);
    }

    @Override
    public void eliminarCuenta(Cuenta cuenta) {
        _cuentaRepositorio.delete(cuenta);
    }
}
