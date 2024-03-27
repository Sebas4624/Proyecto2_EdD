
package proyecto2_edd;



public class NodoABB {
    
    ClienteHospedado client;
    NodoABB hijo_izq;
    NodoABB hijo_der;
    
    int altura;
    
    public NodoABB(ClienteHospedado client) {
        this.client = client;
        this.altura = 0;
    }
    
    public ClienteHospedado getClient() {
        return client;
    }
    
}
