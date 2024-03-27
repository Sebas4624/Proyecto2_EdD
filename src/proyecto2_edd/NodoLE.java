
package proyecto2_edd;



public class NodoLE {
    
    ClienteHospedado client;
    NodoLE next;
    
    public NodoLE(ClienteHospedado client) {
        this.client = client;
    }
    
    public NodoLE(ClienteHospedado client, NodoLE next) {
        this.client = client;
        this.next = next;
    }
    
}
