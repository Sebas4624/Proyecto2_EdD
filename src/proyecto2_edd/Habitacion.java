
package proyecto2_edd;



public class Habitacion {
    
    String num_hab;
    String tipo_hab;
    String piso;
    
    public Habitacion(String num_hab, String tipo_hab, String piso) {
        this.num_hab = num_hab;
        this.tipo_hab = tipo_hab;
        this.piso = piso;
    }
    
    public String getNumHab() {
        return num_hab;
    }
    
    public String getTipoHab() {
        return tipo_hab;
    }
    
    public String getPiso() {
        return piso;
    }
    
}
