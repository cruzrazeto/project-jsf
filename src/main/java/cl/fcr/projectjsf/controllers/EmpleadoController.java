package cl.fcr.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.fcr.projectjsf.entity.Empleado;
import cl.fcr.projectjsf.services.EmpleadoServices;
import cl.fcr.projectjsf.services.impl.EmpleadoServicesImpl;

/*
 * @author Felipe
 * Clase para encargarse de la l{ogica de negocio de los empleados
 */
@ManagedBean
@ViewScoped
public class EmpleadoController {
    
    /*
     * Servicio para obtener la lista de empleados
     */
    // @Autowired
    private EmpleadoServices empleadoService = new EmpleadoServicesImpl();
    /*
     * lista de empleados para la tabla
     */
    private List<Empleado> empleados;
    
    private List<Empleado> empleadoFiltrado;
    
    @PostConstruct
    public void init() {
        consultarEmpleados();
    }
    
    public void consultarEmpleados() {
        setEmpleados(this.empleadoService.consultaEmpleado());
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleadoFiltrado() {
        return empleadoFiltrado;
    }

    public void setEmpleadoFiltrado(List<Empleado> empleadoFiltrado) {
        this.empleadoFiltrado = empleadoFiltrado;
    }

}
