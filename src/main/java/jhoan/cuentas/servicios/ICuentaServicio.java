package jhoan.cuentas.servicios;

import jhoan.cuentas.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listarcuenta();
    public Cuenta buscarCuentaPorID(Integer idCuenta);
    public void guardarCuenta(Cuenta cuenta);
    public void eliminarCuenta(Cuenta cuenta);
}
