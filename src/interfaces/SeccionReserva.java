
package interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

import proyecto2_edd.*;

public class SeccionReserva extends javax.swing.JPanel {
    
    ArbolBinarioBusqueda reserv;
    
    public SeccionReserva(ArbolBinarioBusqueda reserv) {
        
        initComponents();
        
        this.reserv = reserv;
        
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
        CedulaLabel = new javax.swing.JLabel();
        CedulaTextField = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        Buscar = new javax.swing.JPanel();
        BuscarLabel = new javax.swing.JLabel();
        ReservasLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CajaInformacion = new javax.swing.JTextArea();

        Container.setBackground(new java.awt.Color(65, 65, 65));

        CedulaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CedulaLabel.setForeground(new java.awt.Color(255, 255, 255));
        CedulaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CedulaLabel.setText("Cédula");

        CedulaTextField.setBackground(new java.awt.Color(65, 65, 65));
        CedulaTextField.setForeground(new java.awt.Color(180, 180, 180));
        CedulaTextField.setToolTipText("Ingrese la cédula del cliente");
        CedulaTextField.setBorder(null);

        Separador.setForeground(new java.awt.Color(255, 255, 255));

        Buscar.setBackground(new java.awt.Color(65, 65, 65));
        Buscar.setAlignmentX(0.0F);
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

        ReservasLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        ReservasLabel.setForeground(new java.awt.Color(255, 255, 255));
        ReservasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ReservasLabel.setText("Búsqueda de Reservaciones");

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
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ReservasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Separador, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(CedulaTextField))
                                .addComponent(CedulaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ReservasLabel)
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(CedulaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void BuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMousePressed
        // TODO add your handling code here:
        CajaInformacion.setText("");
        
        String ci = CedulaTextField.getText();
        
        try {
            ClienteHospedado target = reserv.buscar(ci).getClient();
            
            CajaInformacion.setText("   Cédula: " + target.ci + "\n" +
                                    "   Nombre: " + target.nombre + "\n" +
                                    "   Apellido: " + target.apellido + "\n" +
                                    "   Email: " + target.email + "\n" +
                                    "   Genero: " + target.genero + "\n" +
                                    "   Tipo de Habitación: " + target.tipoHabitacion + "\n" +
                                    "   Celular: " + target.celular + "\n" +
                                    "   Llegada: " + target.llegada + "\n" +
                                    "   Salida: " + target.salida + "\n");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "La cédula no se encuentra en el registro. Asegúrese de colocar la cédula en el formato 'XX.XXX.XXX' ");
        }
    }//GEN-LAST:event_BuscarMousePressed

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        // TODO add your handling code here:
        Buscar.setBackground(new Color(65,65,65));
    }//GEN-LAST:event_BuscarMouseExited

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        // TODO add your handling code here:
        Buscar.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_BuscarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buscar;
    private javax.swing.JLabel BuscarLabel;
    private javax.swing.JTextArea CajaInformacion;
    private javax.swing.JLabel CedulaLabel;
    private javax.swing.JTextField CedulaTextField;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel ReservasLabel;
    private javax.swing.JSeparator Separador;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
