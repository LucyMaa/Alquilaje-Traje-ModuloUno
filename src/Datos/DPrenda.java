package Datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class DPrenda {

    /**
     * Esta es una clase de capa de datos para Prenda en java..
     *
     * @param
     */
    private int id;
    private String nombre;
    private String tipo;
    private String descripcion;

    private Connection con;

    public DPrenda() {
        Conexion conn = new Conexion();
        con = conn.conectar();
    }

    public boolean crear() {
        /**
         * Este es el método booleano crear una prenda que es muy importante
         * para agregar una nueva prenda a la aplicacion.
         */
        String query = "insert into prendas (nombre,tipo,descripcion) values(?," + this.tipo + ",?)";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setString(2, this.descripcion);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar db " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public ArrayList listar() {
        /**
         * Este es el arreglo para poder listar las prendas que es muy
         * importante para mostrar las prendas existentes en la aplicacion.
         */
        ArrayList<Object[]> prendas = new ArrayList<>();
        String query = "select * from prendas order by id ASC";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            ResultSet result = pre.executeQuery();
            while (result.next()) {
                prendas.add(new Object[]{result.getInt(1), result.getString(2), result.getString(3), result.getString(4)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar " + e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return prendas;
    }

    public boolean editar() {
        /**
         * Este es el método booleano editar una prenda que es muy
         * importante para modificar una prenda existente en la aplicacion.
         */
        String query = "update prendas set nombre = ?, tipo = " + this.tipo + ", descripcion = ? where id = ? ";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, this.nombre);
            pre.setString(2, this.descripcion);
            pre.setInt(3, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean eliminar() {
        /**
         * Este es el método booleano eliminar una prenda que es muy
         * importante para eliminar una prenda existente en la aplicacion.
         */
        String query = "delete from prendas where id = ?";
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setInt(1, this.id);
            pre.execute();
            pre.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
