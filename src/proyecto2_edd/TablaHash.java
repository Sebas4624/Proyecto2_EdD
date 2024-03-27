
package proyecto2_edd;



public class TablaHash {
    
    public ListaEnlazada[] lista_;
    public int tSize;
    
    public TablaHash(int size) {
        lista_ = new ListaEnlazada[size];
        tSize = size;
        
        for(int i = 0; i < tSize; i++) {
            lista_[i] = new ListaEnlazada();
        }
    }
    
    //---------------------------------//
    
    public ClienteHospedado crearHospedado(String ci_, String habitacion_,String nombre_,
                                            String apellido_,String email_,
                                            String genero_,String celular_,
                                            String llegada_, String salida_, String tipoHabitacion) {
        
        ClienteHospedado clienteHospActual = new ClienteHospedado(ci_,habitacion_,nombre_,
                                                                apellido_,email_,genero_,
                                                                celular_,llegada_, salida_, tipoHabitacion);
        
        return clienteHospActual;
    }
    
    public int asignar(String specStr) {
        int strSize = specStr.length();
        
        int asignacion = 0;
        
        for(int i = 0; i < strSize; i++) {
            char Ch = specStr.charAt(i);
            int Ascii = Ch;
            
            asignacion += Ascii;
        }
        
        int eleccion = asignacion % tSize;
        
        return eleccion;
    }
    
    //---------------------------------//
    
    public void insertarCliente(ClienteHospedado client_) {
        int celda = asignar(client_.nombre + client_.apellido);
        
        lista_[celda].insertarUltimo(client_);
    }
    
    public void eliminar(String nombre, String apellido) {
        int celda = asignar(nombre + apellido);
        
        int inX_del = lista_[celda].buscarIndex(nombre, apellido);
        
        lista_[celda].borrar(inX_del);
    }
    
    //---------------------------------//
    
    public ClienteHospedado buscar(String nombre, String apellido) {
        int asign = asignar(nombre + apellido);
        
        int inX = lista_[asign].buscarIndex(nombre, apellido);
        ClienteHospedado wa = lista_[asign].getNodoLE(inX).client;
        
        return wa;
    }
    
    //---------------------------------//
    
    public void printer() {
        for(int i = 0; i < tSize; i++) {
            lista_[i].printer();
        }
    }
    
    public String getHabitacionEnUso(int inX_i, int inX_j) {
        return lista_[inX_i].getNodoLE(inX_j).client.habitacion;
    }
    
    public ClienteHospedado getHabitacionesAux(int inX_i, int inX_j) {
        return lista_[inX_i].getNodoLE(inX_j).client;
    }
    
}
