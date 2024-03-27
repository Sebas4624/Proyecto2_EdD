
package interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import proyecto2_edd.*;
import static proyecto2_edd.Proyecto2_EdD.checker;

public class SeccionCheckIn extends javax.swing.JPanel {
    
    ArbolBinarioBusqueda reserv;
    TablaHashHab habi;
    TablaHash estados;
    
    String temp_ci;
    
    public SeccionCheckIn(ArbolBinarioBusqueda reserv, TablaHashHab habi, TablaHash estados) {
        
        initComponents();
        
        JTableHeader tarble = TablaHabitaciones.getTableHeader();
        tarble.setBackground(new Color(75,75,75));
        tarble.setForeground(new Color(255,255,255));
        
        this.reserv = reserv;
        this.habi = habi;
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
        CedulaLabel = new javax.swing.JLabel();
        CedulaTextField = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        Buscar = new javax.swing.JPanel();
        BuscarLabel = new javax.swing.JLabel();
        CheckInLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CajaInformacionReserva = new javax.swing.JTextArea();
        HabitacionLabel = new javax.swing.JLabel();
        HabitacionTextField = new javax.swing.JTextField();
        Separador2 = new javax.swing.JSeparator();
        Asignar = new javax.swing.JPanel();
        AsignarLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaHabitaciones = new javax.swing.JTable();
        HabitacionesLabel = new javax.swing.JLabel();

        Container.setBackground(new java.awt.Color(65, 65, 65));

        CedulaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CedulaLabel.setForeground(new java.awt.Color(255, 255, 255));
        CedulaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CedulaLabel.setText("Cédula");

        CedulaTextField.setBackground(new java.awt.Color(65, 65, 65));
        CedulaTextField.setForeground(new java.awt.Color(180, 180, 180));
        CedulaTextField.setToolTipText("Ingrese la cédula del cliente");
        CedulaTextField.setBorder(null);

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

        CheckInLabel.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        CheckInLabel.setForeground(new java.awt.Color(255, 255, 255));
        CheckInLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CheckInLabel.setText("Check-In");

        CajaInformacionReserva.setEditable(false);
        CajaInformacionReserva.setBackground(new java.awt.Color(65, 65, 65));
        CajaInformacionReserva.setColumns(20);
        CajaInformacionReserva.setForeground(new java.awt.Color(255, 255, 255));
        CajaInformacionReserva.setRows(5);
        jScrollPane1.setViewportView(CajaInformacionReserva);

        HabitacionLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HabitacionLabel.setForeground(new java.awt.Color(150, 150, 150));
        HabitacionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HabitacionLabel.setText("Habitación");

        HabitacionTextField.setEditable(false);
        HabitacionTextField.setBackground(new java.awt.Color(65, 65, 65));
        HabitacionTextField.setForeground(new java.awt.Color(180, 180, 180));
        HabitacionTextField.setToolTipText("Ingrese la habitación a asignar");
        HabitacionTextField.setBorder(null);

        Separador2.setForeground(new java.awt.Color(150, 150, 150));

        Asignar.setBackground(new java.awt.Color(65, 65, 65));
        Asignar.setPreferredSize(new java.awt.Dimension(100, 40));
        Asignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AsignarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AsignarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AsignarMousePressed(evt);
            }
        });
        Asignar.setLayout(new java.awt.BorderLayout());

        AsignarLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        AsignarLabel.setForeground(new java.awt.Color(255, 255, 255));
        AsignarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AsignarLabel.setText("Asignar");
        Asignar.add(AsignarLabel, java.awt.BorderLayout.CENTER);

        TablaHabitaciones.setBackground(new java.awt.Color(65, 65, 65));
        TablaHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        TablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaHabitaciones.setToolTipText("");
        TablaHabitaciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaHabitaciones.setAutoscrolls(false);
        TablaHabitaciones.setGridColor(new java.awt.Color(65, 65, 65));
        TablaHabitaciones.setSelectionBackground(new java.awt.Color(75, 75, 75));
        TablaHabitaciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaHabitaciones.getTableHeader().setResizingAllowed(false);
        TablaHabitaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaHabitaciones);

        HabitacionesLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        HabitacionesLabel.setForeground(new java.awt.Color(255, 255, 255));
        HabitacionesLabel.setText("Habitaciones");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CheckInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Separador2)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(HabitacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(HabitacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Separador1)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(CedulaTextField))
                                .addComponent(CedulaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(Asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(HabitacionesLabel)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(CheckInLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CedulaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CedulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(HabitacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HabitacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(HabitacionesLabel)
                                .addGap(107, 107, 107)))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AsignarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsignarMousePressed
        // TODO add your handling code here:
        int habitacion = Integer.parseInt(HabitacionTextField.getText());
        
        try {
            if(habitacion > 0 && habitacion <= 300) {
                String habit_ = Integer.toString(habitacion);
                
                
                for(int i = 0; i < estados.tSize; i++) {
                    for(int j = 0; j < estados.lista_[i].size(); j++) {
                        String habi = estados.getHabitacionEnUso(i, j);
                        
                        if(habi.equals(habit_)) {
                            throw new RuntimeException("Something went wrong.");
                        }
                    }
                }
                
                ClienteHospedado target = reserv.buscar(temp_ci).getClient();
                
                String ci_ = checker(temp_ci);
                String habitacion_ = checker(habit_);
                String nombre_ = checker(target.nombre);
                String apellido_ = checker(target.apellido);
                String email_ = checker(target.email);
                String genero_ = checker(target.genero);
                String celular_ = checker(target.celular);
                String llegada_ = checker(target.llegada);
                String salida_ = checker(target.salida);
                String tipoHabitacion_ = checker("");
                
                ClienteHospedado clienteHospedadoNuevo = new ClienteHospedado(ci_,habitacion_,nombre_,
                                                                        apellido_,email_,genero_,celular_,
                                                                        llegada_,salida_,tipoHabitacion_);
                
                estados.insertarCliente(clienteHospedadoNuevo);
                reserv.borrar(target);
                
                HabitacionLabel.setForeground(new Color(150,150,150));
                Separador2.setForeground(new Color(150,150,150));

                HabitacionTextField.setText("");
                HabitacionTextField.setEditable(false);
            }
            else {
                throw new RuntimeException("Something went wrong.");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Habitacion incorrecta o ya ocupada. Compruebe de que el número de habitación se ubique entre los dígitos '1' y '300' y que esté desocupada.");
        }
    }//GEN-LAST:event_AsignarMousePressed

    private void AsignarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsignarMouseExited
        // TODO add your handling code here:
        Asignar.setBackground(new Color(65,65,65));
    }//GEN-LAST:event_AsignarMouseExited

    private void AsignarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsignarMouseEntered
        // TODO add your handling code here:
        Asignar.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_AsignarMouseEntered

    private void BuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMousePressed
        // TODO add your handling code here:
        CajaInformacionReserva.setText("");

        String ci = CedulaTextField.getText();
        this.temp_ci = ci;

        try {
            ClienteHospedado target = reserv.buscar(ci).getClient();

            String tipoHab = target.tipoHabitacion;

            CajaInformacionReserva.setText("   Cédula: " + target.ci + "\n" +
                "   Nombre: " + target.nombre + "\n" +
                "   Apellido: " + target.apellido + "\n" +
                "   Email: " + target.email + "\n" +
                "   Genero: " + target.genero + "\n" +
                "   Tipo de Habitación: " + target.tipoHabitacion + "\n" +
                "   Celular: " + target.celular + "\n" +
                "   Llegada: " + target.llegada + "\n" +
                "   Salida: " + target.salida);

            TablaHabitaciones.setModel(new DefaultTableModel(null, new String[]{"Número", "Tipo"}));
            DefaultTableModel model = (DefaultTableModel)TablaHabitaciones.getModel();

            for(int i = 0; i < habi.tSize; i++) {
                for(int j = 0; j < habi.lista_[i].size(); j++) {
                    NodoLEHab habit = habi.lista_[i].getNodoLE(j);
                    if(habit.getHab().getTipoHab().equals(tipoHab)) {
                        model.addRow(new String[]{habit.getHab().getNumHab(), habit.getHab().getTipoHab()});
                    }
                }
            }

            HabitacionLabel.setForeground(new Color(255,255,255));
            Separador2.setForeground(new Color(255,255,255));

            HabitacionTextField.setEditable(true);
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
    private javax.swing.JPanel Asignar;
    private javax.swing.JLabel AsignarLabel;
    private javax.swing.JPanel Buscar;
    private javax.swing.JLabel BuscarLabel;
    private javax.swing.JTextArea CajaInformacionReserva;
    private javax.swing.JLabel CedulaLabel;
    private javax.swing.JTextField CedulaTextField;
    private javax.swing.JLabel CheckInLabel;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel HabitacionLabel;
    private javax.swing.JTextField HabitacionTextField;
    private javax.swing.JLabel HabitacionesLabel;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JTable TablaHabitaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
