package Negocio;

import Datos.DVestimenta;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class NVestimenta {

    /**
     * Esta es una clase de capa de negocio para Vestimenta en java..
     *
     * @param
     */
    private DVestimenta dvestimenta;
    private ArrayList<NDetallePrenda> detallePrenda;

    public NVestimenta() {
        dvestimenta = new DVestimenta();
        detallePrenda = new ArrayList<>();

    }

    public boolean crear(String nombre, int cantidad, int precio, int id_empleado, int id_categoria, ArrayList<Object[]> detallePrenda) {
        /**
         * Este es el método booleano crear una vestimenta que es muy importante
         * para agregar una nueva vestimenta a la aplicacion.
         */
        this.dvestimenta.setNombre(nombre);
        this.dvestimenta.setCantidad(cantidad);
        this.dvestimenta.setPrecio(precio);
        this.dvestimenta.setId_empleado(id_empleado);
        this.dvestimenta.setId_categoria(id_categoria);

        int id_vestimenta = this.dvestimenta.crear();
        return guardarDetalle(detallePrenda, id_vestimenta);
    }

    public ArrayList<Object[]> listar() {
        /**
         * Este es el arreglo para poder listar las vestimentas que es muy
         * importante para mostrar las vestimentas existentes en la aplicacion.
         */
        return this.dvestimenta.listar();
    }

    public boolean editar(int id, String nombre, int cantidad, int precio, int id_empleado, int id_categoria, ArrayList<Object[]> agregardetallePrenda, ArrayList<Object[]> eliminardetallePrenda) {
        /**
         * Este es el método booleano editar una vestimenta que es muy
         * importante para modificar una vestimenta existente en la aplicacion.
         */
        this.dvestimenta.setId(id);
        this.dvestimenta.setNombre(nombre);
        this.dvestimenta.setCantidad(cantidad);
        this.dvestimenta.setPrecio(precio);
        this.dvestimenta.setId_empleado(id_empleado);
        this.dvestimenta.setId_categoria(id_categoria);
        this.dvestimenta.editar();

        return editarDetallePrenda(id, agregardetallePrenda, eliminardetallePrenda);
    }

    public boolean eliminar(int id) {
        /**
         * Este es el método booleano eliminar una vestimenta que es muy
         * importante para eliminar una vestimenta existente en la aplicacion.
         */
        this.dvestimenta.setId(id);
        return this.dvestimenta.eliminar();
    }

    private boolean guardarDetalle(ArrayList<Object[]> detallePrenda, int id_vestimenta) {
        /**
         * Este es el método booleano guardar un detalle que es muy importante
         * para guardar detalle una prenda existente en la aplicacion.
         */
        this.detallePrenda.clear();
        NDetallePrenda ndetallePrenda = new NDetallePrenda();
        for (Object[] detalle : detallePrenda) {
            this.detallePrenda.add(new NDetallePrenda(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()),
                    detalle[2].toString()));
        }
        return ndetallePrenda.crear(this.detallePrenda);
    }

    public ArrayList<Object[]> listarDetallePrenda(int id_vestimenta) {
        /**
         * Este es el método booleano listar un detalle de prenda que es muy
         * importante para listar detalle una prenda existente en la
         * aplicacion.
         */
        NDetallePrenda ndetallePrenda = new NDetallePrenda();
        ndetallePrenda.setId_vestimentas(id_vestimenta);
        return ndetallePrenda.listar();
    }

    private boolean editarDetallePrenda(int id_vestimenta, ArrayList<Object[]> agregardetallePrenda, ArrayList<Object[]> eliminardetallePrenda) {
        /**
         * Este es el método booleano editar un detalle de prenda que es muy
         * importante para editar detalle una prenda existente en la
         * aplicacion.
         */
        this.detallePrenda.clear();
        NDetallePrenda ndetallePrenda = new NDetallePrenda();
        for (Object[] detalle : agregardetallePrenda) {
            this.detallePrenda.add(new NDetallePrenda(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()),
                    detalle[2].toString()));
        }
        boolean crear = ndetallePrenda.crear(detallePrenda);
        this.detallePrenda.clear();
        for (Object[] detalle : eliminardetallePrenda) {
            this.detallePrenda.add(new NDetallePrenda(id_vestimenta,
                    Integer.valueOf(detalle[0].toString().split("-")[0]),
                    Integer.valueOf(detalle[1].toString()),
                    detalle[2].toString()));
        }
        return crear && ndetallePrenda.eliminar(detallePrenda);

    }
}
