
package proyecto2_edd;



public class NodoLEHab {
    
    Habitacion hab;
    NodoLEHab next;
    
    public NodoLEHab(Habitacion hab) {
        this.hab = hab;
    }
    
    public NodoLEHab(Habitacion hab, NodoLEHab next) {
        this.hab = hab;
        this.next = next;
    }
    
    public Habitacion getHab() {
        return hab;
    }
    
}
