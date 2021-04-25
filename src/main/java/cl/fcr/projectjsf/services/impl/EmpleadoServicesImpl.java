package cl.fcr.projectjsf.services.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.fcr.projectjsf.entity.Empleado;
import cl.fcr.projectjsf.services.EmpleadoServices;

/*
 * @author Felipe
 * 
 */
@Service
public class EmpleadoServicesImpl implements EmpleadoServices {
    public List<Empleado> consultaEmpleado() {
        
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1= new Empleado();
        Empleado empleado2= new Empleado();
        Empleado empleado3= new Empleado();
        Empleado empleado4= new Empleado();
        Empleado empleado5= new Empleado();
        Empleado empleado6= new Empleado();
        Empleado empleado7= new Empleado();
        Empleado empleado8= new Empleado();
        Empleado empleado9= new Empleado();
        
        empleado1.setId(1);
        empleado1.setNombre("Felipe");
        empleado1.setPrimerApellido("Cruz");
        empleado1.setSegundoApellido("Razeto");
        empleado1.setPuesto("Senior Developer Java");
        empleado1.setStatus(true);
        
        empleado2.setId(2);
        empleado2.setNombre("Jorge");
        empleado2.setPrimerApellido("López");
        empleado2.setSegundoApellido("González");
        empleado2.setPuesto("Senior Developer Java");
        empleado2.setStatus(true);
 
        empleado3.setId(3);
        empleado3.setNombre("Andrés");
        empleado3.setPrimerApellido("Rodriguez");
        empleado3.setSegundoApellido("Romero");
        empleado3.setPuesto("Senior Developer Java");
        empleado3.setStatus(true);
        
        empleado4.setId(4);
        empleado4.setNombre("Felipe");
        empleado4.setPrimerApellido("Cruz");
        empleado4.setSegundoApellido("Razeto");
        empleado4.setPuesto("Senior Developer Java");
        empleado4.setStatus(true);
        
        empleado5.setId(5);
        empleado5.setNombre("Jorge");
        empleado5.setPrimerApellido("López");
        empleado5.setSegundoApellido("González");
        empleado5.setPuesto("Senior Developer Java");
        empleado5.setStatus(true);
 
        empleado6.setId(6);
        empleado6.setNombre("Andrés");
        empleado6.setPrimerApellido("Rodriguez");
        empleado6.setSegundoApellido("Romero");
        empleado6.setPuesto("Senior Developer Java");
        empleado6.setStatus(true);
        
        empleado7.setId(7);
        empleado7.setNombre("Felipe");
        empleado7.setPrimerApellido("Cruz");
        empleado7.setSegundoApellido("Razeto");
        empleado7.setPuesto("Senior Developer Java");
        empleado7.setStatus(true);
        
        empleado8.setId(8);
        empleado8.setNombre("Jorge");
        empleado8.setPrimerApellido("López");
        empleado8.setSegundoApellido("González");
        empleado8.setPuesto("Senior Developer Java");
        empleado8.setStatus(true);
 
        empleado9.setId(9);
        empleado9.setNombre("Andrés");
        empleado9.setPrimerApellido("Rodriguez");
        empleado9.setSegundoApellido("Romero");
        empleado9.setPuesto("Senior Developer Java");
        empleado9.setStatus(true);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        empleados.add(empleado6);
        empleados.add(empleado7);
        empleados.add(empleado8);
        empleados.add(empleado9);
        return empleados;
    }
}
