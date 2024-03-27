
package interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

import proyecto2_edd.*;

public class SeccionEstados extends javax.swing.JPanel {
    
    TablaHash estados;
    
    public SeccionEstados(TablaHash estados) {
        
        initComponents();
        
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

        Container = new javax.swing.JPanel();
        NombreTextField = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        ApellidoTextField = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        LineaInformacionPrincipal = new javax.swing.JTextField();
        Buscar = new javax.swing.JPanel();
        BuscarLabel = new javax.swing.JLabel();
        EstadoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CajaInformacion = new javax.swing.JTextArea();

        Container.setBackground(new java.awt.Color(65, 65, 65));

        NombreTextField.setBackground(new java.awt.Color(65, 65, 65));
        NombreTextField.setForeground(new java.awt.Color(180, 180, 180));
        NombreTextField.setToolTipText("Ingrese el nombre del cliente");
        NombreTextField.setBorder(null);

        NombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        NombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreLabel.setText("Nombre");

        ApellidoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ApellidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApellidoLabel.setText("Apellido");

        ApellidoTextField.setBackground(new java.awt.Color(65, 65, 65));
        ApellidoTextField.setForeground(new java.awt.Color(180, 180, 180));
        ApellidoTextField.setToolTipText("Ingrese el apellido del cliente");
        ApellidoTextField.setBorder(null);

        Separador1.setForeground(new java.awt.Color(255, 255, 255));

        Separador2.setForeground(new java.awt.Color(255, 255, 255));

        LineaInformacionPrincipal.setEditable(false);
        LineaInformacionPrincipal.setBackground(new java.awt.Color(65, 65, 65));
        LineaInformacionPrincipal.setForeground(new java.awt.Color(255, 255, 255));

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

        EstadoLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        EstadoLabel.setForeground(new java.awt.Color(255, 255, 255));
        EstadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EstadoLabel.setText("Estados de Clientes");

        CajaInformacion.setEditable(false);
        CajaInformacion.setBackground(new java.awt.Color(65, 65, 65));
        CajaInformacion.setColumns(20);
        CajaInformacion.setForeground(new java.awt.Color(255, 255, 255));
        CajaInformacion.setRows(5);
        jScrollPane1.setViewportView(CajaInformacion);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Separador1)
                        .addComponent(Separador2)
                        .addComponent(ApellidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ContainerLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addComponent(ApellidoTextField))))
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LineaInformacionPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EstadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(EstadoLabel)
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(NombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ApellidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(LineaInformacionPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        LineaInformacionPrincipal.setText("");
        CajaInformacion.setText("");
        
        String nombre = NombreTextField.getText();
        String apellido = ApellidoTextField.getText();
        
        try {
            ClienteHospedado target = estados.buscar(nombre, apellido);
        
            LineaInformacionPrincipal.setText("Actualmente está hospedado en la habitación: " + target.habitacion);
            
            CajaInformacion.setText("   Nombre: " + target.nombre + "\n" +
                                    "   Apellido: " + target.apellido + "\n" +
                                    "   Email: " + target.email + "\n" +
                                    "   Genero: " + target.genero + "\n" +
                                    "   Celular: " + target.celular + "\n" +
                                    "   Llegada: " + target.llegada);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "El cliente no existe o no se encuentra actualmente en el hotel.");
        }
    }//GEN-LAST:event_BuscarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JTextField ApellidoTextField;
    private javax.swing.JPanel Buscar;
    private javax.swing.JLabel BuscarLabel;
    private javax.swing.JTextArea CajaInformacion;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JTextField LineaInformacionPrincipal;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
