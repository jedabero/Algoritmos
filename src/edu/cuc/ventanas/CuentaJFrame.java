/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.ventanas;

import edu.cuc.cuentas.Cuenta;
import edu.cuc.cuentas.Titular;
import javax.swing.JOptionPane;

/**
 *
 * @author jberdugo10
 */
public class CuentaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CuentaJFrame
     */
    public CuentaJFrame() {
        initComponents();
        this.setLocationRelativeTo(this.getRootPane());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrearCuenta = new javax.swing.JPanel();
        labelCedula = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        textNombres = new javax.swing.JTextField();
        labelNumCuenta = new javax.swing.JLabel();
        textNumCuenta = new javax.swing.JTextField();
        btnCrearCuenta = new javax.swing.JButton();
        panelConsignarRetirar = new javax.swing.JPanel();
        textMonto = new javax.swing.JTextField();
        btnConsignar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        labelCantidad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creación de Cuenta");

        panelCrearCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCedula.setText("Cédula:");

        labelApellidos.setText("Apellidos:");

        labelNombre.setText("Nombres:");

        textApellidos.setColumns(15);

        textCedula.setColumns(10);

        textNombres.setColumns(15);

        labelNumCuenta.setText("Numero Cuenta:");

        textNumCuenta.setColumns(20);

        btnCrearCuenta.setText("Crea Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearCuentaLayout = new javax.swing.GroupLayout(panelCrearCuenta);
        panelCrearCuenta.setLayout(panelCrearCuentaLayout);
        panelCrearCuentaLayout.setHorizontalGroup(
            panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearCuentaLayout.createSequentialGroup()
                        .addComponent(labelCedula)
                        .addGap(18, 18, 18)
                        .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearCuentaLayout.createSequentialGroup()
                                .addComponent(labelNombre)
                                .addGap(18, 18, 18)
                                .addComponent(textNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearCuentaLayout.createSequentialGroup()
                                .addComponent(labelApellidos)
                                .addGap(18, 18, 18)
                                .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearCuentaLayout.createSequentialGroup()
                        .addComponent(labelNumCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(textNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearCuenta)))
                .addContainerGap())
        );
        panelCrearCuentaLayout.setVerticalGroup(
            panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCedula)
                        .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearCuentaLayout.createSequentialGroup()
                        .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellidos)
                            .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(textNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCuenta)
                    .addComponent(labelNumCuenta)
                    .addComponent(textNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelConsignarRetirar.setBorder(javax.swing.BorderFactory.createTitledBorder("Consignaciones y Retiros"));

        textMonto.setColumns(10);

        btnConsignar.setText("Consignar");
        btnConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        labelCantidad.setText("Cantidad:");

        javax.swing.GroupLayout panelConsignarRetirarLayout = new javax.swing.GroupLayout(panelConsignarRetirar);
        panelConsignarRetirar.setLayout(panelConsignarRetirarLayout);
        panelConsignarRetirarLayout.setHorizontalGroup(
            panelConsignarRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsignarRetirarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCantidad)
                .addGap(18, 18, 18)
                .addGroup(panelConsignarRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsignarRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsignarRetirarLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsignar)))
                    .addComponent(textMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConsignarRetirarLayout.setVerticalGroup(
            panelConsignarRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsignarRetirarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsignarRetirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetirar)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la Cuenta"));

        jLabel1.setText("Titular:");

        jLabel3.setText("Saldo Actual:");

        txtTitular.setEditable(false);
        txtTitular.setColumns(10);
        txtTitular.setFocusable(false);

        txtSaldo.setEditable(false);
        txtSaldo.setColumns(10);
        txtSaldo.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitular))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelConsignarRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelConsignarRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        //1. Capturar datos
        String cedula = textCedula.getText();
        String nombres = textNombres.getText();
        String apellidos = textApellidos.getText();
        String numeroCuenta = textNumCuenta.getText();
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(this, "Es necesario el numero de "
                    + "identificación del usuario.");
        }else if(apellidos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese el/los apelli"
                    + "do(s) del usuario");
        }else if(nombres.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese el/los nombre"
                    + "(s) del usuario");
        }else if(numeroCuenta.isEmpty()){
            JOptionPane.showMessageDialog(this, "No ha ingresado un número de cuenta");
        }else{
            //2. Crear instancias
        Titular titular1 = new Titular(nombres, apellidos, cedula);
        Cuenta cuenta1 = new Cuenta(titular1, numeroCuenta);
        //3. Confirmar acciones
        JOptionPane.showMessageDialog(this, "Cuenta creada");
        textCedula.setText(null);
        textNombres.setText(null);
        textApellidos.setText(null);
        textNumCuenta.setText(null);
        this.setTitle("Cuenta activa: "+numeroCuenta);
        
        this.ctaVentana = cuenta1;
        
        txtTitular.setText(titular1.getNombres()+" "+titular1.getApellidos());
        txtSaldo.setText(""+cuenta1.getSaldo());
        }
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarActionPerformed
        //1. Verificar que haya una cuenta:
        if(ctaVentana==null){
            JOptionPane.showMessageDialog(this, "No ha creado una cuenta!");
        }else{
            String txtmonto = textMonto.getText();
            double monto = Double.parseDouble(txtmonto);
            ctaVentana.consignar(monto);
            JOptionPane.showMessageDialog(this, "Se han consignado "+monto+" a la cuenta");
            txtSaldo.setText(""+ctaVentana.getSaldo());
        }
        
        
    }//GEN-LAST:event_btnConsignarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        if(ctaVentana==null){
            JOptionPane.showMessageDialog(this, "No ha creado una cuenta!");
        }else{
            String txtmonto = textMonto.getText();
            double monto = Double.parseDouble(txtmonto);
            if(ctaVentana.retirar(monto)){
                JOptionPane.showMessageDialog(this, "Se han retirado "+monto+" de la cuenta");
                txtSaldo.setText(""+ctaVentana.getSaldo());
            }else{
                JOptionPane.showMessageDialog(this, "Cuenta con saldo insuficiente");
            }
            
            
            
        }
        
    }//GEN-LAST:event_btnRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(CuentaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CuentaJFrame().setVisible(true);
            }
        });
    }
    
    private Cuenta ctaVentana;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsignar;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumCuenta;
    private javax.swing.JPanel panelConsignarRetirar;
    private javax.swing.JPanel panelCrearCuenta;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textMonto;
    private javax.swing.JTextField textNombres;
    private javax.swing.JTextField textNumCuenta;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
