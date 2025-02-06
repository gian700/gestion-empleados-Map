package es.ies.puerto.model;

import java.util.Map;

/**
 * 
 * @author Giancarlo
 * @version 1.0.0
 */
public interface OperacionesInterfaces {
    
    /**
     * Metodo que permite crear un empleado dentro del fichero
     * @param empleado
     * @return
     */
    public boolean create(Empleado empleado);

    /**
     * Metodo que permite modificar una empleado dentro del fichero
     * @param empleado
     * @return
     */
    public boolean update(Empleado empleado);

    /**
     * Metodo que permite eliminar un empleado dentro del fichero
     * @param empleado
     * @return
     */
    public boolean delete(String identificador);

    /**
     * Metodo que permite buscar un empleado dentro del fichero
     * @param empleado
     * @return
     */
    public Empleado read(Empleado empleado);

    /**
     * Metodo que permite buscar un empleado dentro del fichero
     * @param empleado
     * @return
     */
    public Empleado read(String identificador);

    /**
     * Metodo que permite buscar a todos los empleados que tenga un puesto especifico dentro del fichero
     * @param empleado
     * @return
     */
    public Map<String, Empleado> empleadosPorPuesto(String puesto);

    /**
     * Metodo que permite buscar a todos los empleados que hallan nacido entre dos fechas den del fichero
     * @param empleado
     * @return
     */
    public Map<String, Empleado> empleadosPorEdad(String fechaInicio, String fechaFin);
}
