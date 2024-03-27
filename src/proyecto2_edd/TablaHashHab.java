
package proyecto2_edd;



public class TablaHashHab {
    
    public ListaEnlazadaHab[] lista_;
    public int tSize;
    
    public TablaHashHab(int size) {
        lista_ = new ListaEnlazadaHab[size];
        tSize = size;
        
        for(int i = 0; i < tSize; i++) {
            lista_[i] = new ListaEnlazadaHab();
        }
    }
    
    //---------------------------------//
    
    public Habitacion crearHabitacion(String num_hab_, String tipo_hab_, String piso_) {
        
        Habitacion habActual = new Habitacion(num_hab_, tipo_hab_, piso_);
        
        return habActual;
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
    
    public void insertarHabitacion(Habitacion hab_) {
        int celda = asignar(hab_.num_hab);
        
        lista_[celda].insertarUltimo(hab_);
    }
    
    public void eliminar(String num_hab_) {
        int celda = asignar(num_hab_);
        
        int inX_del = lista_[celda].buscarIndex(num_hab_);
        
        lista_[celda].borrar(inX_del);
    }
    
    //---------------------------------//
    
    public void printer() {
        for(int i = 0; i < tSize; i++) {
            lista_[i].printer();
        }
    }
    
}
