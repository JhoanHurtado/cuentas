package jhoan.cuentas.Controlador;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jhoan.cuentas.modelo.Cuenta;
import jhoan.cuentas.servicios.CuentaServicio;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexControlador {

    @Autowired
    CuentaServicio _cuentaServicio;

    private List<Cuenta> cuentas;

    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct
    public void init(){
        cargarDatos();
    }

    public void cargarDatos(){
        this.cuentas = _cuentaServicio.listarcuenta();
        cuentas.forEach((cuenta)-> logger.info(cuentas.toString()));
    }

}
