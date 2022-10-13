package Presentacion;

import Negocio.NPrenda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matias
 */
public class PPrenda extends javax.swing.JFrame {

    private int id;
    private String nombre;
    private String tipo;
    private String descripcion;

    private NPrenda nprenda;

    /**
     * Creates new form PPrenda
     */
    public PPrenda() {
        initComponents();
        this.nprenda = new NPrenda();
        this.listar();
        this.apagarbotonCrear(true);
        this.jtf_id.setEditable(false);
        this.jtf_id.setEnabled(false);
        this.setSize(761, 456);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_listar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_descripcion = new javax.swing.JTextArea();
        jbt_crear = new javax.swing.JButton();
        jbt_editar = new javax.swing.JButton();
        jbt_eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcb_tipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRENDAS");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(740, 380));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "tipo", "descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_listarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_listar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 400, 310));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jtf_id.setBorder(null);
        jPanel1.add(jtf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 22));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/limpiar.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 30, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 20));

        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("descripcion :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jta_descripcion.setColumns(20);
        jta_descripcion.setRows(5);
        jScrollPane1.setViewportView(jta_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 180, 120));

        jbt_crear.setText("Crear");
        jbt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_crearActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jbt_editar.setText("Editar");
        jbt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_editarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jbt_eliminar.setText("Eliminar");
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("tipo :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, 20));

        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO", "NEUTRO" }));
        jPanel1.add(jcb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_listarMouseClicked
        // TODO add your handling code here:
        int rowSelected = this.jt_listar.getSelectedRow();
        this.jtf_id.setText(this.jt_listar.getValueAt(rowSelected, 0).toString());
        this.jtf_nombre.setText(this.jt_listar.getValueAt(rowSelected, 1).toString());
        this.jcb_tipo.setSelectedIndex(this.settipo(this.jt_listar.getValueAt(rowSelected, 2).toString()));
        this.jta_descripcion.setText(this.jt_listar.getValueAt(rowSelected, 3).toString());
        this.apagarbotonCrear(false);
    }//GEN-LAST:event_jt_listarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.jtf_id.setText("");
        this.apagarbotonCrear(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jbt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_crearActionPerformed
        // TODO add your handling code here:
        this.nombre = this.jtf_nombre.getText();
        this.tipo = this.gettipo();
        this.descripcion = this.jta_descripcion.getText();
        this.crear();
    }//GEN-LAST:event_jbt_crearActionPerformed

    private void jbt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_editarActionPerformed
        // TODO add your handling code here:
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.nombre = this.jtf_nombre.getText();
        this.tipo = this.gettipo();
        this.descripcion = this.jta_descripcion.getText();
        this.editar();
    }//GEN-LAST:event_jbt_editarActionPerformed

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        this.id = Integer.valueOf(this.jtf_id.getText());
        this.eliminar();
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void crear() {
        System.out.println(nombre + " " + tipo + " " + descripcion);
        if (this.nprenda.crear(nombre, tipo, descripcion)) {
            JOptionPane.showMessageDialog(null, "Se Inserto Correctamente", "Crear", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Insertar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void eliminar() {
        if (this.nprenda.eliminar(this.id)) {
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void editar() {
        if (this.nprenda.editar(this.id, this.nombre, this.tipo, this.descripcion)) {
            JOptionPane.showMessageDialog(null, "Se Edito Correctamen", "Edicion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Editar", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.listar();
        this.limpiar();
    }

    private void listar() {
        ArrayList<Object[]> prendas = new ArrayList<>();
        prendas = this.nprenda.listar();
        String data[][] = (prendas.size() != 0) ? new String[prendas.size()][prendas.get(0).length] : null;
        for (int i = 0; i < prendas.size(); i++) {
            data[i][0] = String.valueOf(prendas.get(i)[0]);
            data[i][1] = String.valueOf(prendas.get(i)[1]);
            data[i][2] = String.valueOf(prendas.get(i)[2]);
            data[i][3] = String.valueOf(prendas.get(i)[3]);
        }
        String[] column = {"id", "nombre", "tipo", "descripcion"};
        this.jt_listar.setModel(new DefaultTableModel(data, column));
    }

    private void limpiar() {
        this.jtf_id.setText("");
        this.jtf_nombre.setText("");
        this.jta_descripcion.setText("");
        this.apagarbotonCrear(true);
    }

    private void apagarbotonCrear(boolean valor) {
        this.jbt_editar.setEnabled(!valor);
        this.jbt_eliminar.setEnabled(!valor);
        this.jbt_crear.setEnabled(valor);
    }

    private String gettipo() {
        switch (this.jcb_tipo.getSelectedItem().toString()) {
            case "MASCULINO":
                return "'MAS'";
            case "FEMENINO":
                return "'FEM'";
            case "NEUTRO":
                return "'NEU'";
        }
        return "'NEU'";
    }

    private int settipo(String valor) {
        switch (valor) {
            case "MAS":
                return 0;
            case "FEM":
                return 1;
            case "NEU":
                return 2;
        }
        return 2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPrenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbt_crear;
    private javax.swing.JButton jbt_editar;
    private javax.swing.JButton jbt_eliminar;
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JTable jt_listar;
    private javax.swing.JTextArea jta_descripcion;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}