package Negocio;

import Datos.DEmpleado;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NEmpleado {
    /**
     * Esta es una clase de capa de negocio para Empleados en java..
     *
     * @param
     */

    private DEmpleado dempleado;

    public NEmpleado() {
        this.dempleado = new DEmpleado();
    }

    public boolean crear(String nombre, String ci, String telefono, String fecha_nacimiento, String sexo) {
        /**
         * Este es el método booleano crear un empleado que es muy importante
         * para agregar un nuevo empleado a la aplicacion.
         */
        this.dempleado.setNombre(nombre);
        this.dempleado.setCi(ci);
        this.dempleado.setTelefono(telefono);
        this.dempleado.setFecha_nacimiento(fecha_nacimiento);
        this.dempleado.setSexo(sexo);
        return this.dempleado.crear();
    }

    public ArrayList<Object[]> listar() {
        /**
         * Este es el arreglo para poder listar los empleados que es muy
         * importante para mostrar los empleados existentes en la aplicacion.
         */
        return this.dempleado.listar();
    }

    public boolean editar(int id, String nombre, String ci, String telefono, String fecha_nacimiento, String sexo) {
        /**
         * Este es el método booleano editar un empleado que es muy
         * importante para modificar un empleado existente en la aplicacion.
         */
        this.dempleado.setId(id);
        this.dempleado.setNombre(nombre);
        this.dempleado.setCi(ci);
        this.dempleado.setTelefono(telefono);
        this.dempleado.setFecha_nacimiento(fecha_nacimiento);
        this.dempleado.setSexo(sexo);
        return this.dempleado.editar();
    }

    public boolean eliminar(int id) {
        /**
         * Este es el método booleano eliminar un empleado que es muy
         * importante para eliminar un empleado existente en la aplicacion.
         */
        this.dempleado.setId(id);
        return this.dempleado.eliminar();
    }

}
