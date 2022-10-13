package Negocio;

import Datos.DDetallePrenda;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NDetallePrenda {

    /**
     * Esta es una clase intermedia de capa de negocio para Detalle de Prendas
     * en java..
     *
     * @param
     */

    private int id_vestimentas;
    private int id_prenda;
    private int stock;
    private String color;

    private DDetallePrenda ddetalleprenda;

    public NDetallePrenda(int id_vestimentas, int id_prenda, int stock, String color) {
        this.id_vestimentas = id_vestimentas;
        this.id_prenda = id_prenda;
        this.stock = stock;
        this.color = color;
        ddetalleprenda = new DDetallePrenda();
    }

    public NDetallePrenda() {
        ddetalleprenda = new DDetallePrenda();
    }

    public boolean crear(ArrayList<NDetallePrenda> ndetallePrenda) {
        /**
         * Este es el método booleano crear un detalle de prenda que es muy importante
         * para agregar un detalle de prenda a la aplicacion.
         */
        boolean valor = true;
        for (NDetallePrenda detallePrenda : ndetallePrenda) {
            int id_prenda = detallePrenda.id_prenda;
            this.ddetalleprenda.setId_prenda(id_prenda);
            this.ddetalleprenda.setId_vestimentas(detallePrenda.id_vestimentas);
            this.ddetalleprenda.setStock(detallePrenda.stock);
            this.ddetalleprenda.setColor(detallePrenda.color);
            valor = valor && this.ddetalleprenda.crear();
        }
        return valor;
    }

    public boolean eliminar(ArrayList<NDetallePrenda> ndetallePrenda) {
        /**
         * Este es el método booleano eliminar un detalle de prenda que es muy importante
         * para eliminar un detalle de prenda existente a la aplicacion.
         */
        boolean valor = true;
        for (NDetallePrenda detallePrenda : ndetallePrenda) {
            int id_prenda = detallePrenda.id_prenda;
            this.ddetalleprenda.setId_prenda(id_prenda);
            this.ddetalleprenda.setId_vestimentas(detallePrenda.id_vestimentas);
            this.ddetalleprenda.setStock(detallePrenda.stock);
            this.ddetalleprenda.setColor(detallePrenda.color);
            valor = valor && this.ddetalleprenda.eliminar();
        }
        return valor;
    }

    public ArrayList<Object[]> listar() {
        /**
         * Este es el arreglo para poder listar los detalles de prenda que es muy
         * importante para mostrar los detalles de prendas existentes en la aplicacion.
         */
        this.ddetalleprenda.setId_vestimentas(this.id_vestimentas);
        return this.ddetalleprenda.listar();
    }

    public int getId_vestimentas() {
        return id_vestimentas;
    }

    public void setId_vestimentas(int id_vestimentas) {
        this.id_vestimentas = id_vestimentas;
    }

    public int getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        this.id_prenda = id_prenda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
