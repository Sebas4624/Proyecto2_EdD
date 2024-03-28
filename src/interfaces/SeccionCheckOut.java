
package interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

import proyecto2_edd.*;
import static proyecto2_edd.Proyecto2_EdD.checker;

public class SeccionCheckOut extends javax.swing.JPanel {
    
    ArbolBinarioBusqueda histori;
    TablaHash estados;
    
    String temp_nombre;
    String temp_apellido;

    public SeccionCheckOut(ArbolBinarioBusqueda histori, TablaHash estados) {
        
        initComponents();
        
        this.histori = histori;
        this.estados = estados;
        
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
        Container = new javax.swing.JPanel();
        NombreLabel = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        Buscar = new javax.swing.JPanel();
        BuscarLabel = new javax.swing.JLabel();
        CheckOutLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CajaInformacionCliente = new javax.swing.JTextArea();
        ApellidoLabel = new javax.swing.JLabel();
        ApellidoTextField = new javax.swing.JTextField();
        Separador2 = new javax.swing.JSeparator();
        Cerrar = new javax.swing.JPanel();
        CerrarLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CajaConfirmacion = new javax.swing.JTextArea();

        Container.setBackground(new java.awt.Color(65, 65, 65));

        NombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        NombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreLabel.setText("Nombre");

        NombreTextField.setBackground(new java.awt.Color(65, 65, 65));
        NombreTextField.setForeground(new java.awt.Color(180, 180, 180));
        NombreTextField.setToolTipText("Ingrese el apellido del cliente");
        NombreTextField.setBorder(null);

        Separador1.setForeground(new java.awt.Color(255, 255, 255));

        Buscar.setBackground(new java.awt.Color(65, 65, 65));
        Buscar.setPreferredSize(new java.awt.Dimension(100, 40));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarMousePressed(evt);
            }
        });
        Buscar.setLayout(new java.awt.BorderLayout());

        BuscarLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        BuscarLabel.setForeground(new java.awt.Color(255, 255, 255));
        BuscarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarLabel.setText("Buscar");
        Buscar.add(BuscarLabel, java.awt.BorderLayout.CENTER);

        CheckOutLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        CheckOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        CheckOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CheckOutLabel.setText("Check-Out");

        CajaInformacionCliente.setEditable(false);
        CajaInformacionCliente.setBackground(new java.awt.Color(65, 65, 65));
        CajaInformacionCliente.setColumns(20);
        CajaInformacionCliente.setForeground(new java.awt.Color(255, 255, 255));
        CajaInformacionCliente.setRows(5);
        jScrollPane1.setViewportView(CajaInformacionCliente);

        ApellidoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ApellidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApellidoLabel.setText("Apellido");

        ApellidoTextField.setBackground(new java.awt.Color(65, 65, 65));
        ApellidoTextField.setForeground(new java.awt.Color(180, 180, 180));
        ApellidoTextField.setToolTipText("Ingrese el apellido del cliente");
        ApellidoTextField.setBorder(null);

        Separador2.setForeground(new java.awt.Color(255, 255, 255));

        Cerrar.setBackground(new java.awt.Color(65, 65, 65));
        Cerrar.setPreferredSize(new java.awt.Dimension(100, 40));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CerrarMousePressed(evt);
            }
        });
        Cerrar.setLayout(new java.awt.BorderLayout());

        CerrarLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        CerrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        CerrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarLabel.setText("Cerrar");
        Cerrar.add(CerrarLabel, java.awt.BorderLayout.CENTER);

        CajaConfirmacion.setEditable(false);
        CajaConfirmacion.setBackground(new java.awt.Color(65, 65, 65));
        CajaConfirmacion.setColumns(20);
        CajaConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        CajaConfirmacion.setRows(5);
        jScrollPane2.setViewportView(CajaConfirmacion);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Separador2)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(ApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ApellidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Separador1)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(NombreTextField))
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CheckOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(CheckOutLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ApellidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        // TODO add your handling code here:
        Buscar.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        // TODO add your handling code here:
        Buscar.setBackground(new Color(65,65,65));
    }//GEN-LAST:event_BuscarMouseExited

    private void BuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMousePressed
        // TODO add your handling code here:
        CajaInformacionCliente.setText("");
        CajaConfirmacion.setText("");
        
        String nombre = NombreTextField.getText();
        String apellido = ApellidoTextField.getText();
        
        try {
            ClienteHospedado target = estados.buscar(nombre, apellido);
            
            CajaInformacionCliente.setText("   Habitación: " + target.habitacion + "\n" +
                                    "   Nombre: " + target.nombre + "\n" +
                                    "   Apellido: " + target.apellido + "\n" +
                                    "   Email: " + target.email + "\n" +
                                    "   Genero: " + target.genero + "\n" +
                                    "   Celular: " + target.celular + "\n" +
                                    "   Llegada: " + target.llegada);
            
            CajaConfirmacion.setText("Si pulsa 'Cerrar', cerrará el registro de " + target.nombre + " " + target.apellido + "\n" +
                                    "¿Desea continuar?");
            
            temp_nombre = nombre;
            temp_apellido = apellido;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "El cliente no existe o no se encuentra actualmente en el hotel.");
        }
    }//GEN-LAST:event_BuscarMousePressed

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
        Cerrar.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
        Cerrar.setBackground(new Color(65,65,65));
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMousePressed
        // TODO add your handling code here:
        
        
        try {
            ClienteHospedado target = estados.buscar(temp_nombre, temp_apellido);
            
            estados.eliminar(temp_nombre, temp_apellido);
            
            String ci_ = checker(target.ci);
            String habitacion_ = checker(target.habitacion);
            String nombre_ = checker(target.nombre);
            String apellido_ = checker(target.apellido);
            String email_ = checker(target.email);
            String genero_ = checker(target.genero);
            String celular_ = checker("");
            String llegada_ = checker(target.llegada);
            String salida_ = checker("");
            String tipoHabitacion_ = checker("");
            
            if(!target.ci.equals("") && !target.ci.equals("Desconocido")) {
                ClienteHospedado clienteHistoricoNuevo = new ClienteHospedado(ci_,habitacion_,nombre_,
                                                                        apellido_,email_,genero_,celular_,
                                                                        llegada_,salida_,tipoHabitacion_);
                
                histori.insertar(clienteHistoricoNuevo);
                
                CajaInformacionCliente.setText("");
                CajaConfirmacion.setText("");
            }
            else {
                CajaInformacionCliente.setText("");
                CajaConfirmacion.setText("");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra alojado actualmente en el hotel. Compruebe los hospedados actuales.");
        }
    }//GEN-LAST:event_CerrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JTextField ApellidoTextField;
    private javax.swing.JPanel Buscar;
    private javax.swing.JLabel BuscarLabel;
    private javax.swing.JTextArea CajaConfirmacion;
    private javax.swing.JTextArea CajaInformacionCliente;
    private javax.swing.JPanel Cerrar;
    private javax.swing.JLabel CerrarLabel;
    private javax.swing.JLabel CheckOutLabel;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
