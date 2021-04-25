package cl.fcr.projectjsf.services;

import java.util.List;

import cl.fcr.projectjsf.entity.Empleado;

/*
 * @author Felipe
 * Clase para realizar la logica de negocio de emplados
 */
public interface EmpleadoServices {
    /* Metodo para consultar la lista de empleados de empresas de TI
     * @return {@link Empleado} lista de empleados
     */
    public List<Empleado> consultaEmpleado();
}
