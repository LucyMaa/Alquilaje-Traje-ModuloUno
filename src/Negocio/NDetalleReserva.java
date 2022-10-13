package Negocio;

import Datos.DDetalleReserva;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NDetalleReserva {

    private int id_reserva;
    private int id_vestimentas;
    private int cantidad;

    private DDetalleReserva ddetalleprenda;

    public NDetalleReserva(int id_reserva, int id_vestimenta, int cantidad) {
        this.id_reserva = id_reserva;
        this.id_vestimentas = id_vestimenta;
        this.cantidad = cantidad;

        ddetalleprenda = new DDetalleReserva();
    }

    public NDetalleReserva() {
        ddetalleprenda = new DDetalleReserva();
    }

    public boolean crear(ArrayList<NDetalleReserva> ndetalleReserva) {
        /**
         * Esta es una clase intermedia de capa de negocio para Detalle de
         * Reserva en java..
         *
         * @param
         */
        boolean valor = true;
        for (NDetalleReserva detallereserva : ndetalleReserva) {
            this.ddetalleprenda.setId_reserva(detallereserva.id_reserva);
            this.ddetalleprenda.setId_vestimentas(detallereserva.id_vestimentas);
            this.ddetalleprenda.setCantidad(detallereserva.cantidad);
            valor = valor && this.ddetalleprenda.crear();
        }
        return valor;
    }

    public boolean eliminar(ArrayList<NDetalleReserva> ndetalleReserva) {
        /**
         * Este es el método booleano eliminar un detalle de reserva que es muy importante
         * para eliminar un detalle de reserva existente a la aplicacion.
         */
        boolean valor = true;
        for (NDetalleReserva detalleReserva : ndetalleReserva) {
            this.ddetalleprenda.setId_reserva(detalleReserva.id_reserva);
            this.ddetalleprenda.setId_vestimentas(detalleReserva.id_vestimentas);
            this.ddetalleprenda.setCantidad(detalleReserva.cantidad);
            valor = valor && this.ddetalleprenda.eliminar();
        }
        return valor;
    }

    public ArrayList<Object[]> listar() {
        /**
         * Este es el arreglo para poder listar los detalles de reserva que es muy
         * importante para mostrar los detalles de reserva existentes en la aplicacion.
         */
        this.ddetalleprenda.setId_reserva(this.id_reserva);
        return this.ddetalleprenda.listar();
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_vestimentas() {
        return id_vestimentas;
    }

    public void setId_vestimentas(int id_vestimentas) {
        this.id_vestimentas = id_vestimentas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
