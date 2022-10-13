package Negocio;

import Datos.DCliente;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NCliente {

    /**
     * Esta es una clase de capa de negocio para Cliente en java..
     *
     * @param
     */

    private DCliente dcliente;

    public NCliente() {
        this.dcliente = new DCliente();
    }

    public boolean crear(String nombre, String ci, String telefono, String fecha_nacimiento, String sexo, String direccion) {
        /**
         * Este es el método booleano crear un cliente que es muy importante
         * para agregar una nuevo cliente a la aplicacion.
         */
        this.dcliente.setNombre(nombre);
        this.dcliente.setCi(ci);
        this.dcliente.setTelefono(telefono);
        this.dcliente.setFecha_nacimiento(fecha_nacimiento);
        this.dcliente.setSexo(sexo);
        this.dcliente.setDireccion(direccion);
        return this.dcliente.crear();
    }

    public ArrayList<Object[]> listar() {
        /**
         * Este es el arreglo para poder listar los clientes que es muy
         * importante para mostrar los clientes existentes en la aplicacion.
         */
        return this.dcliente.listar();
    }

    public boolean editar(int id, String nombre, String ci, String telefono, String fecha_nacimiento, String sexo, String direccion) {
        /**
         * Este es el método booleano editar un cliente que es muy importante
         * para modificar un cliente existente en la aplicacion.
         */
        this.dcliente.setId(id);
        this.dcliente.setNombre(nombre);
        this.dcliente.setCi(ci);
        this.dcliente.setTelefono(telefono);
        this.dcliente.setFecha_nacimiento(fecha_nacimiento);
        this.dcliente.setSexo(sexo);
        this.dcliente.setDireccion(direccion);
        return this.dcliente.editar();
    }

    public boolean eliminar(int id) {
        /**
         * Este es el método booleano eliminar un cliente que es muy importante
         * para eliminar un cliente existente a la aplicacion.
         */
        
        this.dcliente.setId(id);
        return this.dcliente.eliminar();
    }

}
