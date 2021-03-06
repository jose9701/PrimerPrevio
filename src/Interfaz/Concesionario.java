/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Negocio.ConcesionarioInterface;
import Negocio.VenderFacade;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josea
 */
public class Concesionario extends javax.swing.JFrame {

    ConcesionarioInterface consecionario;
    VenderFacade vende;

    /**
     * Creates new form Concesionario
     */
    public Concesionario() {
        initComponents();
        this.labelCanPuertas.setVisible(false);
        this.puertas.setVisible(false);
        consecionario = new Negocio.Concesionario();
        vende = new VenderFacade();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/carros-y-motos.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Producto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Marca = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        labelCilindraje = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        puertas = new javax.swing.JLabel();
        labelCanPuertas = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONCESIONARIO");

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Producto");

        Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto", "Carro", "Moto" }));
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Marca");

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Cargar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Potencia");

        labelCilindraje.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        labelCilindraje.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Modelo");

        labelModelo.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(255, 0, 0));

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Precio");

        labelPrecio.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 0, 0));

        puertas.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        puertas.setForeground(new java.awt.Color(255, 0, 0));
        puertas.setText("Puertas");

        labelCanPuertas.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        labelCanPuertas.setForeground(new java.awt.Color(255, 0, 0));

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 87, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(puertas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(labelCanPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puertas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCanPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        if (this.Producto.getSelectedIndex() == 1) {
            this.labelCilindraje.setText("");
            this.labelModelo.setText("");
            this.labelCanPuertas.setText("");
            this.labelPrecio.setText("");
            this.labelCanPuertas.setVisible(true);
            this.puertas.setVisible(true);
            this.Marca.removeAllItems();
            this.Marca.addItem("Seleccione");
            this.Marca.addItem("fiat");
            this.Marca.addItem("ford");
        } else if (this.Producto.getSelectedIndex() == 2) {
            this.labelCilindraje.setText("");
            this.labelModelo.setText("");
            this.labelCanPuertas.setText("");
            this.labelPrecio.setText("");
            this.labelCanPuertas.setVisible(false);
            this.puertas.setVisible(false);
            this.Marca.removeAllItems();
            this.Marca.addItem("Seleccione");
            this.Marca.addItem("Yamaha");
            this.Marca.addItem("Honda");
        } else {
            this.Marca.removeAllItems();
            this.Marca.addItem("Seleccione..");
        }
    }//GEN-LAST:event_ProductoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (this.Producto.getSelectedIndex() == 0) {
            this.labelCilindraje.setText("");
            this.labelModelo.setText("");
            this.labelCanPuertas.setText("");
            this.labelPrecio.setText("");
            JOptionPane.showMessageDialog(this, "seleccione si es carro o moto");
        } else if (this.Producto.getSelectedIndex() == 1) {
            if (Marca.getSelectedIndex() == 0) {
                this.labelCilindraje.setText("");
                this.labelModelo.setText("");
                this.labelCanPuertas.setText("");
                this.labelPrecio.setText("");
                JOptionPane.showMessageDialog(this, "seleccione la marca del carro");
            } else {
                this.consecionario.ConstruirAuto(this.Marca.getSelectedItem().toString());
                this.labelCilindraje.setText("");
                this.labelModelo.setText("");
                this.labelPrecio.setText("");
                this.labelCanPuertas.setText("");
                this.labelCilindraje.setText(this.consecionario.devolverPotenciaAuto());
                this.labelModelo.setText(this.consecionario.DevolverModeloAuto());
                this.labelCanPuertas.setText(this.consecionario.devolverCantidadPuertas());
                this.labelPrecio.setText(this.consecionario.devolverPrecioAuto());
            }
        } else {

            if (Marca.getSelectedIndex() == 0) {
                this.labelCilindraje.setText("");
                this.labelModelo.setText("");
                this.labelCanPuertas.setText("");
                this.labelPrecio.setText("");
                JOptionPane.showMessageDialog(this, "seleccione la marca de la moto");
            } else {
                this.labelCilindraje.setText("");
                this.labelModelo.setText("");
                this.labelCanPuertas.setText("");
                this.labelPrecio.setText("");
                this.consecionario.ConstruirMoto(this.Marca.getSelectedItem().toString());
                this.labelCilindraje.setText(this.consecionario.devolverPotenciaMoto());
                this.labelModelo.setText(consecionario.DevolverModeloMoto());
                this.labelPrecio.setText(this.consecionario.DevolverPrecioMoto());
            }

        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        this.labelCilindraje.setText("");
        this.labelModelo.setText("");
        this.labelCanPuertas.setText("");
        this.labelPrecio.setText("");
    }//GEN-LAST:event_MarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (this.Producto.getSelectedIndex() != 0) {
            if (this.Marca.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "debe indicar el modelo a comprar");
            } else {
                String marca = this.Marca.getSelectedItem().toString();
                String tipo = this.Producto.getSelectedItem().toString();
                //String modelo=vende.vender(tipo, marca);
                //String tipo,int precio,String marca,int cantPuertas,String modelo, String potencia)
                String precio = this.labelPrecio.getText();
                String canpuerta = this.labelCanPuertas.getText();
                int cpuerta = 0;
                int p = 0;
                if (canpuerta.equalsIgnoreCase("")) {
                    cpuerta = 0;
                } else {
                    cpuerta = Integer.parseInt(canpuerta);
                }
                if(precio.equalsIgnoreCase("")){
                    p=0;
                }else{
                    p=Integer.parseInt(precio);
                }
                String modelo = this.labelModelo.getText();
                String pot = this.labelCilindraje.getText();
                if (marca.isEmpty() || tipo.isEmpty() || precio.isEmpty()  || modelo.isEmpty() || pot.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Poe favor cargue los datos para poder seguir con la compra");
                } else {
                    vende.vender(tipo, p, marca, cpuerta, modelo, pot);
                    if (tipo.equalsIgnoreCase("moto")) {
                        JOptionPane.showMessageDialog(this, "se vendio una moto de marca " + marca + " del modelo " + modelo);
                    } else {
                        JOptionPane.showMessageDialog(this, "se vendio un carro de marca " + marca + " del modelo " + modelo);
                    }
                }
            }
        } else if (this.Producto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un carro o una moto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int totalAPagar = vende.totalVenta();
        int totalCarros = vende.cantCarros();
        int totalMotos = vende.cantMotos();
        JOptionPane.showMessageDialog(this, "el total a pagar es " + totalAPagar + " por comprar " + totalCarros + " carros " + "/n"
                + " y " + totalMotos + " motos");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Concesionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Marca;
    private javax.swing.JComboBox<String> Producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCanPuertas;
    private javax.swing.JLabel labelCilindraje;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel puertas;
    // End of variables declaration//GEN-END:variables
}
