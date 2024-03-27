
package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.*;

import proyecto2_edd.*;
import static proyecto2_edd.Proyecto2_EdD.checker;

public class MenuGestion extends javax.swing.JFrame {

    int x, y;
    
    SeccionEstados SecEst;
    SeccionReserva SecRes;
    SeccionHistorial SecHis;
    
    TablaHash clienteHospedaje;
    TablaHashHab habitaciones;
    ArbolBinarioBusqueda reservas;
    ArbolBinarioBusqueda historico;
    
    public MenuGestion() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
        this.clienteHospedaje = new TablaHash(15);
        this.habitaciones = new TablaHashHab(15);
        this.reservas = new ArbolBinarioBusqueda();
        this.historico = new ArbolBinarioBusqueda();
        
        
         //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        
        String file1 = "src\\Booking_hotel_estado.csv";
        BufferedReader reader1 = null;
        String line1 = "";
        
        try {
            reader1 = new BufferedReader(new FileReader(file1));
            while((line1 = reader1.readLine()) != null) {
                
                String[] row = line1.split(",");
                
                try {
                    if(row[0].equals("num_hab")){
                        throw new RuntimeException("Something went wrong.");
                    }
                    
                    String ci_ = checker("");
                    String habitacion_ = checker(row[0]);
                    String nombre_ = checker(row[1]);
                    String apellido_ = checker(row[2]);
                    String email_ = checker(row[3]);
                    String genero_ = checker(row[4]);
                    String celular_ = checker(row[5]);
                    String llegada_ = checker(row[6]);
                    String salida_ = checker("");
                    String tipoHabitacion_ = checker("");
                    
                    
                    ClienteHospedado clienteNuevo = new ClienteHospedado(ci_,habitacion_,nombre_,
                                                                        apellido_,email_,genero_,celular_,
                                                                        llegada_,salida_,tipoHabitacion_);
                    
                    
                    clienteHospedaje.insertarCliente(clienteNuevo);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            clienteHospedaje.printer();
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
         //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        
        String file2 = "src\\Booking_hotel_reservas.csv";
        BufferedReader reader2= null;
        String line2 = "";
        
        try {
            reader2 = new BufferedReader(new FileReader(file2));
            while((line2 = reader2.readLine()) != null) {
                
                String[] row = line2.split(",");
                
                try {
                    if(row[0].equals("ci")){
                        throw new RuntimeException("Something went wrong.");
                    }
                    
                    String ci_ = checker(row[0]);
                    if(ci_.equals("Desconocido")) {
                        throw new RuntimeException("Something went wrong.");
                    }
                    String habitacion_ = checker("");
                    String nombre_ = checker(row[1]);
                    String apellido_ = checker(row[2]);
                    String email_ = checker(row[3]);
                    String genero_ = checker(row[4]);
                    String celular_ = checker(row[6]);
                    String llegada_ = checker(row[7]);
                    String salida_ = checker(row[8]);
                    String tipoHabitacion_ = checker(row[5]);
                    
                    
                    ClienteHospedado clienteNuevo = new ClienteHospedado(ci_,habitacion_,nombre_,
                                                                        apellido_,email_,genero_,celular_,
                                                                        llegada_,salida_,tipoHabitacion_);
                    
                    
                    reservas.insertar(clienteNuevo);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            System.out.println(reservas.buscar("13.502.927"));
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
         //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        
        String file3 = "src\\Booking_hotel_historico.csv";
        BufferedReader reader3= null;
        String line3 = "";
        
        try {
            reader3 = new BufferedReader(new FileReader(file3));
            while((line3 = reader3.readLine()) != null) {
                
                String[] row = line3.split(",");
                
                try {
                    if(row[0].equals("ci")){
                        throw new RuntimeException("Something went wrong.");
                    }
                    
                    String ci_ = checker(row[0]);
                    String habitacion_ = checker(row[6]);
                    String nombre_ = checker(row[1]);
                    String apellido_ = checker(row[2]);
                    String email_ = checker(row[3]);
                    String genero_ = checker(row[4]);
                    String celular_ = checker("");
                    String llegada_ = checker(row[5]);
                    String salida_ = checker("");
                    String tipoHabitacion_ = checker("");
                    
                    
                    ClienteHospedado clienteNuevo = new ClienteHospedado(ci_,habitacion_,nombre_,
                                                                        apellido_,email_,genero_,celular_,
                                                                        llegada_,salida_,tipoHabitacion_);
                    
                    
                    historico.insertar(clienteNuevo);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            System.out.println(historico.buscar("3.616.656"));
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader3.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
         //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        
        String file4 = "src\\Booking_hotel_habitaciones.csv";
        BufferedReader reader4 = null;
        String line4 = "";
        
        try {
            reader4 = new BufferedReader(new FileReader(file4));
            while((line4 = reader4.readLine()) != null) {
                
                String[] row = line4.split(",");
                
                try {
                    if(row[0].equals("num_hab")){
                        throw new RuntimeException("Wow");
                    }
                    
                    String num_hab_ = checker(row[0]);
                    String tipo_hab_ = checker(row[1]);
                    String piso_ = checker(row[2]);
                    
                    Habitacion habit = new Habitacion(num_hab_, tipo_hab_, piso_);

                    habitaciones.insertarHabitacion(habit);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            habitaciones.printer();
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader4.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
         //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        
        
        SecEst = new SeccionEstados(clienteHospedaje);
        SecRes = new SeccionReserva(reservas);
        SecHis = new SeccionHistorial(historico);
        mostrarPanel(SecEst);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BorderPanel = new javax.swing.JPanel();
        ClosePanel = new javax.swing.JPanel();
        CloseLabel = new javax.swing.JLabel();
        MaximizePanel = new javax.swing.JPanel();
        MaximizeLabel = new javax.swing.JLabel();
        MinimizePanel = new javax.swing.JPanel();
        MinimizeLabel = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        EstadosDeClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BusquedaDeReservacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HistorialDeHabitacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CheckIn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CheckOut = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        Displayer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(860, 480));
        setResizable(false);

        BorderPanel.setBackground(new java.awt.Color(39, 39, 39));
        BorderPanel.setPreferredSize(new java.awt.Dimension(800, 30));
        BorderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BorderPanelMouseDragged(evt);
            }
        });
        BorderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorderPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderPanelMousePressed(evt);
            }
        });
        BorderPanel.setLayout(null);

        ClosePanel.setBackground(new java.awt.Color(39, 39, 39));
        ClosePanel.setForeground(new java.awt.Color(39, 39, 39));
        ClosePanel.setPreferredSize(new java.awt.Dimension(90, 30));
        ClosePanel.setLayout(new java.awt.BorderLayout());

        CloseLabel.setForeground(new java.awt.Color(51, 51, 51));
        CloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/icons8-close-18.png"))); // NOI18N
        CloseLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        CloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CloseLabelMousePressed(evt);
            }
        });
        ClosePanel.add(CloseLabel, java.awt.BorderLayout.LINE_END);

        BorderPanel.add(ClosePanel);
        ClosePanel.setBounds(0, 0, 30, 30);

        MaximizePanel.setBackground(new java.awt.Color(39, 39, 39));
        MaximizePanel.setForeground(new java.awt.Color(39, 39, 39));
        MaximizePanel.setPreferredSize(new java.awt.Dimension(90, 30));
        MaximizePanel.setLayout(new java.awt.BorderLayout());

        MaximizeLabel.setForeground(new java.awt.Color(39, 39, 39));
        MaximizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaximizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/icons8-rectangle-18.png"))); // NOI18N
        MaximizeLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        MaximizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaximizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaximizeLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MaximizeLabelMousePressed(evt);
            }
        });
        MaximizePanel.add(MaximizeLabel, java.awt.BorderLayout.CENTER);

        BorderPanel.add(MaximizePanel);
        MaximizePanel.setBounds(30, 0, 30, 30);

        MinimizePanel.setBackground(new java.awt.Color(39, 39, 39));
        MinimizePanel.setForeground(new java.awt.Color(39, 39, 39));
        MinimizePanel.setPreferredSize(new java.awt.Dimension(90, 30));
        MinimizePanel.setLayout(new java.awt.BorderLayout());

        MinimizeLabel.setForeground(new java.awt.Color(39, 39, 39));
        MinimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/icons8-minus-18.png"))); // NOI18N
        MinimizeLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        MinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizeLabelMousePressed(evt);
            }
        });
        MinimizePanel.add(MinimizeLabel, java.awt.BorderLayout.PAGE_START);

        BorderPanel.add(MinimizePanel);
        MinimizePanel.setBounds(60, 0, 30, 30);

        getContentPane().add(BorderPanel, java.awt.BorderLayout.PAGE_START);

        SidePanel.setBackground(new java.awt.Color(47, 47, 47));
        SidePanel.setPreferredSize(new java.awt.Dimension(150, 500));

        EstadosDeClientes.setBackground(new java.awt.Color(47, 47, 47));
        EstadosDeClientes.setMinimumSize(new java.awt.Dimension(150, 75));
        EstadosDeClientes.setPreferredSize(new java.awt.Dimension(150, 75));
        EstadosDeClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EstadosDeClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EstadosDeClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EstadosDeClientesMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estados de");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");

        javax.swing.GroupLayout EstadosDeClientesLayout = new javax.swing.GroupLayout(EstadosDeClientes);
        EstadosDeClientes.setLayout(EstadosDeClientesLayout);
        EstadosDeClientesLayout.setHorizontalGroup(
            EstadosDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadosDeClientesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(EstadosDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstadosDeClientesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        EstadosDeClientesLayout.setVerticalGroup(
            EstadosDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadosDeClientesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        BusquedaDeReservacion.setBackground(new java.awt.Color(47, 47, 47));
        BusquedaDeReservacion.setMinimumSize(new java.awt.Dimension(150, 75));
        BusquedaDeReservacion.setPreferredSize(new java.awt.Dimension(150, 75));
        BusquedaDeReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BusquedaDeReservacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BusquedaDeReservacionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BusquedaDeReservacionMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Búsqueda de");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reservación");

        javax.swing.GroupLayout BusquedaDeReservacionLayout = new javax.swing.GroupLayout(BusquedaDeReservacion);
        BusquedaDeReservacion.setLayout(BusquedaDeReservacionLayout);
        BusquedaDeReservacionLayout.setHorizontalGroup(
            BusquedaDeReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaDeReservacionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(BusquedaDeReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        BusquedaDeReservacionLayout.setVerticalGroup(
            BusquedaDeReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaDeReservacionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        HistorialDeHabitacion.setBackground(new java.awt.Color(47, 47, 47));
        HistorialDeHabitacion.setMinimumSize(new java.awt.Dimension(150, 75));
        HistorialDeHabitacion.setPreferredSize(new java.awt.Dimension(150, 75));
        HistorialDeHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialDeHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialDeHabitacionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HistorialDeHabitacionMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Historial de");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Habitación");

        javax.swing.GroupLayout HistorialDeHabitacionLayout = new javax.swing.GroupLayout(HistorialDeHabitacion);
        HistorialDeHabitacion.setLayout(HistorialDeHabitacionLayout);
        HistorialDeHabitacionLayout.setHorizontalGroup(
            HistorialDeHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialDeHabitacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(HistorialDeHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        HistorialDeHabitacionLayout.setVerticalGroup(
            HistorialDeHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialDeHabitacionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        CheckIn.setBackground(new java.awt.Color(47, 47, 47));
        CheckIn.setMinimumSize(new java.awt.Dimension(150, 75));
        CheckIn.setPreferredSize(new java.awt.Dimension(150, 75));
        CheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CheckInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckInMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckInMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Check-In");

        javax.swing.GroupLayout CheckInLayout = new javax.swing.GroupLayout(CheckIn);
        CheckIn.setLayout(CheckInLayout);
        CheckInLayout.setHorizontalGroup(
            CheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckInLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        CheckInLayout.setVerticalGroup(
            CheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckInLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        CheckOut.setBackground(new java.awt.Color(47, 47, 47));
        CheckOut.setMinimumSize(new java.awt.Dimension(150, 75));
        CheckOut.setPreferredSize(new java.awt.Dimension(150, 75));
        CheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CheckOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckOutMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check-Out");

        javax.swing.GroupLayout CheckOutLayout = new javax.swing.GroupLayout(CheckOut);
        CheckOut.setLayout(CheckOutLayout);
        CheckOutLayout.setHorizontalGroup(
            CheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckOutLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        CheckOutLayout.setVerticalGroup(
            CheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckOutLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EstadosDeClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BusquedaDeReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(HistorialDeHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(EstadosDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BusquedaDeReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistorialDeHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().add(SidePanel, java.awt.BorderLayout.LINE_START);

        MainPanel.setBackground(new java.awt.Color(65, 65, 65));

        Displayer.setBackground(new java.awt.Color(65, 65, 65));
        Displayer.setPreferredSize(new java.awt.Dimension(640, 360));

        javax.swing.GroupLayout DisplayerLayout = new javax.swing.GroupLayout(Displayer);
        Displayer.setLayout(DisplayerLayout);
        DisplayerLayout.setHorizontalGroup(
            DisplayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        DisplayerLayout.setVerticalGroup(
            DisplayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Displayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Displayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void MinimizeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMousePressed
        // TODO add your handling code here:
        MenuGestion.this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMousePressed

    private void MinimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseExited
        // TODO add your handling code here:
        MinimizePanel.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_MinimizeLabelMouseExited

    private void MinimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseEntered
        // TODO add your handling code here:
        MinimizePanel.setBackground(new Color(128 , 128, 128));
    }//GEN-LAST:event_MinimizeLabelMouseEntered

    private void MaximizeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeLabelMousePressed
        // TODO add your handling code here:
        if(MenuGestion.this.getExtendedState() == MAXIMIZED_BOTH) {
            MenuGestion.this.setExtendedState(JFrame.NORMAL);
        }
        else {
            MenuGestion.this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_MaximizeLabelMousePressed

    private void MaximizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeLabelMouseExited
        // TODO add your handling code here:
        MaximizePanel.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_MaximizeLabelMouseExited

    private void MaximizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeLabelMouseEntered
        // TODO add your handling code here:
        MaximizePanel.setBackground(new Color(128 , 128, 128));
    }//GEN-LAST:event_MaximizeLabelMouseEntered

    private void CloseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseEntered
        // TODO add your handling code here:
        ClosePanel.setBackground(new Color(238 , 79, 79));
    }//GEN-LAST:event_CloseLabelMouseEntered

    private void CloseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseExited
        // TODO add your handling code here
        ClosePanel.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_CloseLabelMouseExited

    private void CloseLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabelMousePressed

    private void BorderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderPanelMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_BorderPanelMousePressed

    private void BorderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderPanelMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int xy = evt.getYOnScreen();
        this.setLocation(xx - x, xy - y);
    }//GEN-LAST:event_BorderPanelMouseDragged

    private void BorderPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderPanelMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2 && !evt.isConsumed()) {
            if(MenuGestion.this.getExtendedState() == MAXIMIZED_BOTH) {
                MenuGestion.this.setExtendedState(JFrame.NORMAL);
            }
            else {
                MenuGestion.this.setExtendedState(MAXIMIZED_BOTH);
            }
        }
    }//GEN-LAST:event_BorderPanelMouseClicked

    private void EstadosDeClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadosDeClientesMouseEntered
        // TODO add your handling code here:
        EstadosDeClientes.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_EstadosDeClientesMouseEntered

    private void EstadosDeClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadosDeClientesMouseExited
        // TODO add your handling code here:
        EstadosDeClientes.setBackground(new Color(47,47,47));
    }//GEN-LAST:event_EstadosDeClientesMouseExited

    private void EstadosDeClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadosDeClientesMousePressed
        // TODO add your handling code here:
        mostrarPanel(SecEst);
    }//GEN-LAST:event_EstadosDeClientesMousePressed

    private void BusquedaDeReservacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaDeReservacionMouseEntered
        // TODO add your handling code here:
        BusquedaDeReservacion.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_BusquedaDeReservacionMouseEntered

    private void BusquedaDeReservacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaDeReservacionMouseExited
        // TODO add your handling code here:
        BusquedaDeReservacion.setBackground(new Color(47,47,47));
    }//GEN-LAST:event_BusquedaDeReservacionMouseExited

    private void BusquedaDeReservacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaDeReservacionMousePressed
        // TODO add your handling code here:
        mostrarPanel(SecRes);
    }//GEN-LAST:event_BusquedaDeReservacionMousePressed

    private void HistorialDeHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialDeHabitacionMouseEntered
        // TODO add your handling code here:
        HistorialDeHabitacion.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_HistorialDeHabitacionMouseEntered

    private void HistorialDeHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialDeHabitacionMouseExited
        // TODO add your handling code here:
        HistorialDeHabitacion.setBackground(new Color(47,47,47));
    }//GEN-LAST:event_HistorialDeHabitacionMouseExited

    private void HistorialDeHabitacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialDeHabitacionMousePressed
        // TODO add your handling code here:
        mostrarPanel(SecHis);
    }//GEN-LAST:event_HistorialDeHabitacionMousePressed

    private void CheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInMouseEntered
        // TODO add your handling code here:
        CheckIn.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_CheckInMouseEntered

    private void CheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInMouseExited
        // TODO add your handling code here:
        CheckIn.setBackground(new Color(47,47,47));
    }//GEN-LAST:event_CheckInMouseExited

    private void CheckInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckInMousePressed

    private void CheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutMouseEntered
        // TODO add your handling code here:
        CheckOut.setBackground(new Color(98 , 98, 98));
    }//GEN-LAST:event_CheckOutMouseEntered

    private void CheckOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutMouseExited
        // TODO add your handling code here:
        CheckOut.setBackground(new Color(47,47,47));
    }//GEN-LAST:event_CheckOutMouseExited

    private void CheckOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckOutMousePressed
    
    
    //---//---//---//---//---//---//---//---//---//---//
    
    
    private void mostrarPanel(JPanel panel) {
        panel.setSize(640,360);
        panel.setLocation(0, 0);
        
        Displayer.removeAll();
        Displayer.add(panel, BorderLayout.CENTER);
        Displayer.revalidate();
        Displayer.repaint();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BorderPanel;
    private javax.swing.JPanel BusquedaDeReservacion;
    private javax.swing.JPanel CheckIn;
    private javax.swing.JPanel CheckOut;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JPanel ClosePanel;
    private javax.swing.JPanel Displayer;
    private javax.swing.JPanel EstadosDeClientes;
    private javax.swing.JPanel HistorialDeHabitacion;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MaximizeLabel;
    private javax.swing.JPanel MaximizePanel;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JPanel MinimizePanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
