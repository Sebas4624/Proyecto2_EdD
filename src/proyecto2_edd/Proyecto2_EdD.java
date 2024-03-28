
package proyecto2_edd;

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
        
    }
    
}
