
package proyecto2_edd;

import java.io.*;
import interfaces.*;

public class Proyecto2_EdD {
    
    public static String checker(String str) {
        String new_str = "Desconocido";
        if(str.equals("") || str.equals(" ")) {
            return new_str;
        }
        else {
            return str;
        }
    }
    
    public static void main(String[] args) {
        
        
        MenuGestion wawawa = new MenuGestion();
        
         //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        //---//---//---//---//---//---//---//---//---//---//---//---//---//---//
        
        /*
        String filewa = "src\\prueba.csv";
        BufferedWriter writer = null;
        
        try {
            writer = new BufferedWriter(new FileWriter(filewa));
            writer.write("Wazdaa" + "," + "apellido" + "," + "hsudauisd");
            writer.newLine();
            writer.write("ALo" + ",");
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        
        
        String filewe = "src\\prueba.csv";
        BufferedReader reader = null;
        String line = "";
        
        try {
            reader = new BufferedReader(new FileReader(filewe));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                
                for(String index : row) {
                    System.out.printf("%-15s", index);
                }
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        
        /*
        TablaHash tabel = new TablaHash(15); //Clientes Hospedados Actualmente
        ArbolBinarioBusqueda avv = new ArbolBinarioBusqueda(); //Reservas
        ArbolBinarioBusqueda vva = new ArbolBinarioBusqueda(); //Historico
        TablaHashHab lebat = new TablaHashHab(15); //Habitaciones
        
        
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
                    
                    
                    tabel.insertarCliente(clienteNuevo);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            tabel.printer();
            
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
                    
                    
                    avv.insertar(clienteNuevo);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            System.out.println(avv.buscar("13.502.927"));
            
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
                    
                    
                    vva.insertar(clienteNuevo);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            System.out.println(vva.buscar("3.616.656"));
            
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

                    lebat.insertarHabitacion(habit);
                    
                    
                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
            }
            
            lebat.printer();
            
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
        */
        
        
        
        /*
        ListaEnlazadaHab apapar = new ListaEnlazadaHab();
        TablaHashHab lebat = new TablaHashHab(15);
        */
        /*
        Habitacion hab1 = new Habitacion("1", "simple", "1");
        Habitacion hab2 = new Habitacion("2", "simple", "1");
        Habitacion hab3 = new Habitacion("3", "simple", "1");
        Habitacion hab4 = new Habitacion("4", "simple", "1");
        Habitacion hab5 = new Habitacion("5", "simple", "1");
        */
        /*
        lebat.insertarHabitacion(hab1);
        lebat.insertarHabitacion(hab2);
        lebat.insertarHabitacion(hab3);
        lebat.insertarHabitacion(hab4);
        lebat.insertarHabitacion(hab5);
        
        lebat.printer();
        System.out.println(49 % 10);
        */
        /*
        apapar.insertarPrimero(hab1);
        apapar.insertarPrimero(hab2);
        apapar.insertarPrimero(hab3);
        apapar.insertarPrimero(hab4);
        apapar.insertarPrimero(hab5);
        
        apapar.printer();
        */
        
        /*
        ClienteHospedado person1 = new ClienteHospedado("13.502.927","","Evered","Ralestone","eralestone0@ask.com","Male","(648) 8757440","14/10/2023","27/10/2023","doble");
        ClienteHospedado person2 = new ClienteHospedado("13.369.274","","Berna","Lawly","blawly1@privacy.gov.au","Female","(984) 2395498","15/08/2023","06/09/2023","doble");
        ClienteHospedado person3 = new ClienteHospedado("17.614.312","","Marti","Meconi","mmeconi2@mozilla.org","Female","(581) 7713030","12/08/2023","01/09/2023","suite");
        ClienteHospedado person4 = new ClienteHospedado("18.383.175","","Jennifer","Allworthy","jallworthy3@squidoo.com","Female","(647) 9910223","02/10/2023","25/10/2023","doble");
        ClienteHospedado person5 = new ClienteHospedado("","","1","","","","","","","");
        
        
        avv.insertar(person1);
        avv.insertar(person2);
        avv.insertar(person3);
        avv.insertar(person4);
        avv.insertar(person5);
        
        System.out.println(avv.buscar(person1.nombre));
        System.out.println(avv.buscar(person2.nombre));
        System.out.println(avv.buscar(person3.nombre));
        System.out.println(avv.buscar(person4.nombre));
        System.out.println(avv.buscar(person5.nombre));
        */
        /*
        ClienteHospedado persona1 = new ClienteHospedado("","100", "Luis", "Armando", "1", "1", "1", "1","","");
        ClienteHospedado persona2 = new ClienteHospedado("","254", "Sarah", "Lopez", "1", "1", "1", "1","","");
        ClienteHospedado persona3 = new ClienteHospedado("","49", "Alberto", "Gutierrez", "1", "1", "1", "1","","");
        ClienteHospedado persona4 = new ClienteHospedado("","123", "Vanessa", "Gomez", "1", "1", "1", "1","","");
        ClienteHospedado persona5 = new ClienteHospedado("","207", "Ramirez", "Hernandez", "1", "1", "1", "1","","");
        
        
        tabel.insertarCliente(persona1);
        tabel.insertarCliente(persona2);
        tabel.insertarCliente(persona3);
        tabel.insertarCliente(persona4);
        tabel.insertarCliente(persona5);
        
        tabel.eliminar(persona5.nombre, persona5.apellido);
        
        tabel.printer();
        */
        
        
        
        /*
        rapapa.insertarPrimero(persona1);
        rapapa.insertarPrimero(persona2);
        rapapa.insertarPrimero(persona3);
        rapapa.insertarPrimero(persona4);
        rapapa.insertarPrimero(persona5);
        */
        /*
        rapapa.insertarUltimo(persona1);
        rapapa.insertarUltimo(persona2);
        rapapa.insertarUltimo(persona3);
        rapapa.insertarUltimo(persona4);
        rapapa.insertarUltimo(persona5);
        */
        
        //rapapa.borrar(3);
        
        //rapapa.printer();
        
        //System.out.println(rapapa.buscarIndex("Sarah", "Lopez"));
        
        
        
        
        /*
        int x = 3;
        
        for(int i = 0; i < x; i++) {
            System.out.print(i + " -> ");
        }
        System.out.println("END");
        System.out.println("Finished!");
        */
        
        
        
        /*
        String name = "100";
        
        for(int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            int ascii = ch;
            
            System.out.println(ascii);
            
        }
        */
        
        
        
        
        
        /*
        String file = "src\\Booking_hotel_reservas.csv";
        BufferedReader reader = null;
        String line = "";
        
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                
                String[] row = line.split(",");
                
                //System.out.println(row[0] + " ------------------------------------------");
                
                try {
                    if(row[0].equals("ci")){
                        throw new RuntimeException("Wow");
                    }
                    ClienteHospedado clienteNuevo = new ClienteHospedado(row[0], "", row[1], row[2], row[3], row[4], row[6], row[7], row[8], row[5]);

                    //tabel.insertarCliente(clienteNuevo);
                    avv.insertar(clienteNuevo);

                    for(String index : row) {
                        System.out.printf("%-15s", index);
                    }
                    System.out.println();
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
                
            }
            
            
            //ClienteHospedado cli = avv.buscar("13.502.927").client;
            //ClienteHospedado wav = avv.buscar("14.120.647").client;
            
            //avv.borrar(cli);
            
            //ClienteHospedado cli2 = avv.buscar("13.502.927").client;
            //System.out.println(wav.ci + " " + wav.nombre + ", " + wav.apellido);
            
            
            //avv.recorrer(avv.raiz);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        
        ////////////////////////////////////////////////////////////////////////
        
        /*
        String file = "src\\Booking_hotel_habitaciones.csv";
        BufferedReader reader = null;
        String line = "";
        
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                
                String[] row = line.split(",");
                
                //System.out.println(row[0] + " ------------------------------------------");
                
                try {
                    if(row[0].equals("num_hab")){
                        throw new RuntimeException("Wow");
                    }
                    if(!row[0].equals("")) {
                        Habitacion habit = new Habitacion(row[0], row[1], row[2]);

                        lebat.insertarHabitacion(habit);


                        for(String index : row) {
                            System.out.printf("%-15s", index);
                        }
                        System.out.println();
                    }
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
                
            }
            
            lebat.printer();
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        
        ////////////////////////////////////////////////////////////////////////
        
        /*
        String file2 = "src\\Booking_hotel_estado.csv";
        BufferedReader reader2 = null;
        String line2 = "";
        
        try {
            reader2 = new BufferedReader(new FileReader(file2));
            while((line2 = reader2.readLine()) != null) {
                
                String[] row = line2.split(",");
                
                //System.out.println(row[0] + " ------------------------------------------");
                
                try {
                    if(row[0].equals("num_hab")){
                        throw new RuntimeException("Wow");
                    }
                    if(!row[0].equals("")) {
                        ClienteHospedado clienteNuevo = new ClienteHospedado("", row[0], row[1], row[2], row[3], row[4], row[5], row[6], "", "");

                        tabel.insertarCliente(clienteNuevo);


                        for(String index : row) {
                            System.out.printf("%-15s", index);
                        }
                        System.out.println();
                    }
                }
                catch(Exception e) {
                    System.out.println("-------------");
                }
                
            }
            ////////
            for(int i = 0; i < tabel.tSize; i++) {
                for(int j = 0; j < tabel.lista_[i].size(); j++) {
                    String habi = tabel.getHabitacionEnUso(i, j);
                    
                    //lebat.eliminar(habi);
                }
            }
            
            tabel.printer();
            
            String str1 = "Arielle";
            String str2 = "Bragger";
            
            ClienteHospedado war = tabel.buscar(str1, str2);
            
            System.out.println(war.nombre + " " + war.apellido);
            
            //lebat.printer();
            ////////
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
        */
        
        ////////////////////////////////////////////////////////////////////////
        
    }
    
}
