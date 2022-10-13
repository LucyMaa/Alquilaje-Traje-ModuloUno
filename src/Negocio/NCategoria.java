package Negocio;

import Datos.DCategoria;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NCategoria {

    /**
     * Esta es una clase de capa de negocio para Categoria en java..
     *
     * @param
     */
    private DCategoria dcategoria;

    public NCategoria() {
        this.dcategoria = new DCategoria();
    }

    public boolean crear(String nombre, String descripcion) {
        /**
         * Este es el método booleano crear una categoria que es muy importante
         * para agregar una nueva categoria a la aplicacion.
         */
        this.dcategoria.setNombre(nombre);
        this.dcategoria.setDescripcion(descripcion);
        return this.dcategoria.crear();
    }

    public ArrayList<Object[]> listar() {
        /**
         * Este es el arreglo para poder listar las categoria que es muy
         * importante para mostrar las categorisa existentes en la aplicacion.
         */
        return this.dcategoria.listar();
    }

    public boolean editar(int id, String nombre, String descripcion) {
        /**
         * Este es el método booleano editar una categoria que es muy importante
         * para modificar una categoria existente en la aplicacion.
         */
        this.dcategoria.setId(id);
        this.dcategoria.setNombre(nombre);
        this.dcategoria.setDescripcion(descripcion);
        return this.dcategoria.editar();
    }

    public boolean eliminar(int id) {
        /**
         * Este es el método booleano eliminar una categoria que es muy
         * importante para eliminar una categoria existente en la aplicacion.
         */
        this.dcategoria.setId(id);
        return this.dcategoria.eliminar();
    }
}
