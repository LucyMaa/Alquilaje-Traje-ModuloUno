package Negocio;

import Datos.DReserva;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NReserva {
    /**
     * Esta es una clase de capa de negocio para Reserva en java..
     *
     * @param
     */
    private DReserva dreserva;
    private ArrayList<NDetalleReserva> detalleReserva;
    
    public NReserva() {
        dreserva = new DReserva();
        detalleReserva =new ArrayList<>();
    }
    
    
    public boolean crear(int id_cliente, String titulo, String garantia, String fechaInicio,String fechaFin, boolean estado, ArrayList<Object[]> detallereserva){
        /**
         * Este es el método booleano crear una reserva que es muy importante
         * para agregar una nueva reserva a la aplicacion.
         */
        this.dreserva.setId_cliente(id_cliente);
        this.dreserva.setTitulo(titulo);
        this.dreserva.setGarantia(garantia);
        this.dreserva.setFechaInicio(fechaInicio);
        this.dreserva.setFechaFin(fechaFin);
        this.dreserva.setEstado(estado);
        
        int id_vestimenta =this.dreserva.crear(); 
        return guardarDetalle(detallereserva, id_vestimenta);
    } 
    
    public ArrayList<Object[]> listar(){
        /**
         * Este es el arreglo para poder listar las reservas que es muy
         * importante para mostrar las reservas existentes en la aplicacion.
         */
        return this.dreserva.listar();
    }
    
    public boolean editar(int id,int id_cliente, String titulo, String garantia, String fechaInicio,String fechaFin, boolean estado, ArrayList<Object[]> agregardetalleReserva, ArrayList<Object[]> eliminardetalleReserva){
        /**
         * Este es el método booleano editar una reserva que es muy importante
         * para modificar una reserva existente en la aplicacion.
         */
        this.dreserva.setId(id);
        this.dreserva.setId_cliente(id_cliente);
        this.dreserva.setTitulo(titulo);
        this.dreserva.setGarantia(garantia);
        this.dreserva.setFechaInicio(fechaInicio);
        this.dreserva.setFechaFin(fechaFin);
        this.dreserva.setEstado(estado);
        this.dreserva.editar();
        
        return editarDetallePrenda(id,agregardetalleReserva,eliminardetalleReserva);
    }
    
    public boolean eliminar(int id){
        /**
         * Este es el método booleano eliminar una reserva que es muy importante
         * para eliminar una reserva existente en la aplicacion.
         */
        this.dreserva.setId(id);
        return this.dreserva.eliminar();
    }

    private boolean guardarDetalle(ArrayList<Object[]> detalleReserva,int id_reserva) {
        /**
         * Este es el método booleano guardar detalle de una reserva que es muy importante
         * para guardar detalle una reserva existente en la aplicacion.
         */
        this.detalleReserva.clear();
        NDetalleReserva ndetallePrenda = new NDetalleReserva();
        for (Object[] detalle : detalleReserva) {          
            this.detalleReserva.add(new NDetalleReserva(id_reserva,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString())));
        }
        return ndetallePrenda.crear(this.detalleReserva);
    }
    
    public ArrayList<Object[]> listarDetalleReserva(int id_reserva){
        /**
         * Este es el método booleano listar detalle de una reserva que es muy importante
         * para listar detalle una reserva existente en la aplicacion.
         */
        NDetalleReserva ndetalleReserva = new NDetalleReserva();
        ndetalleReserva.setId_reserva(id_reserva);
        return ndetalleReserva.listar();
    }

    private boolean editarDetallePrenda(int id_vestimenta, ArrayList<Object[]> agregardetallePrenda, ArrayList<Object[]> eliminardetalleReserva) {
        /**
         * Este es el método booleano editar detalle de prenda que es muy importante
         * para listar detalle una prenda existente en la aplicacion.
         */
        this.detalleReserva.clear();
        NDetalleReserva ndetalleReserva = new NDetalleReserva();
        for (Object[] detalle : agregardetallePrenda) {          
            this.detalleReserva.add(new NDetalleReserva(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()))
            );
        }
        boolean crear = ndetalleReserva.crear(detalleReserva);
        this.detalleReserva.clear();
        for (Object[] detalle : eliminardetalleReserva) {          
            this.detalleReserva.add(new NDetalleReserva(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString())
            ));
        }
        return crear && ndetalleReserva.eliminar(detalleReserva);
        
    }
}
