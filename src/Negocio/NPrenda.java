package Negocio;

import Datos.DPrenda;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NPrenda {
    /**
     * Esta es una clase de capa de negocio para Prenda en java..
     *
     * @param
     */

    private DPrenda dprenda;

    public NPrenda() {
        this.dprenda = new DPrenda();
    }
    
    public boolean crear(String nombre,String tipo, String descripcion){
        /**
         * Este es el método booleano crear una prenda que es muy importante
         * para agregar una nueva prenda a la aplicacion.
         */
        this.dprenda.setNombre(nombre);
        this.dprenda.setTipo(tipo);
        this.dprenda.setDescripcion(descripcion);
        return this.dprenda.crear();
    } 
    
    public ArrayList<Object[]> listar(){
        /**
         * Este es el arreglo para poder listar las prendas que es muy
         * importante para mostrar las prendas existentes en la aplicacion.
         */
        return this.dprenda.listar();
    }
    
    public boolean editar(int id, String nombre,String tipo,String descripcion){
        /**
         * Este es el método booleano editar una prenda que es muy
         * importante para modificar una prenda existente en la aplicacion.
         */
        this.dprenda.setId(id);
        this.dprenda.setNombre(nombre);
        this.dprenda.setTipo(tipo);
        this.dprenda.setDescripcion(descripcion);
        return this.dprenda.editar();
    }
    
    public boolean eliminar(int id){
        /**
         * Este es el método booleano eliminar una prenda que es muy
         * importante para eliminar una prenda existente en la aplicacion.
         */
        this.dprenda.setId(id);
        return this.dprenda.eliminar();
    }

}
