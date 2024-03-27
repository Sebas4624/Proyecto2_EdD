
package proyecto2_edd;



public class ListaEnlazada {
    
    private NodoLE nfirst;
    private NodoLE nlast;
    private int iN;
    
    public ListaEnlazada() {
        nfirst = null;
        nlast = null;
        iN = 0;
    }
    
    //---------------------------------//
    
    public boolean esVacio() {
        return nfirst == null;
    }
    
    public NodoLE primerNodo() {
        return nfirst;
    }
    
    public NodoLE ultimoNodo() {
        return nlast;
    }
    
    public int size() {
        return iN;
    }
    
    //---------------------------------//
    
    public int buscarIndex(String nombre, String apellido) {
        NodoLE pAux = nfirst;
        for(int i = 0; i <= iN; i++) {
            if(pAux.client.nombre.equals(nombre) && pAux.client.apellido.equals(apellido)) {
                return i;
            }
            else {
                pAux = pAux.next;
            }
        }
        return -1;
    }
    
    public NodoLE getNodoLE(int inX) {
        NodoLE pAux = nfirst;
        for(int i = 0; i < inX; i++) {
            pAux = pAux.next;
        }
        return pAux;
    }
    
    //---------------------------------//
    
    public void insertarPrimero(ClienteHospedado client_) {
        NodoLE pNew = new NodoLE(client_);
        if(nfirst == null) {
            nfirst = nlast = pNew;
            iN++;
            return;
        }
        
        pNew.next = nfirst;
        nfirst = pNew;
        
        iN++;
    }
    
    public void insertar(ClienteHospedado client_, int inX) {
        
    }
    
    public void insertarUltimo(ClienteHospedado client_) {
        if(nlast == null) {
            insertarPrimero(client_);
            return;
        }
        NodoLE pNew = new NodoLE(client_);
        
        nlast.next = pNew;
        nlast = pNew;
        
        iN++;
    }
    
    //---------------------------------//
    
    public void borrarPrimero() {
        nfirst = nfirst.next;
        if(nfirst == null) {
            nlast = null;
        }
        
        iN--;
    }
    
    public void borrar(int inX) {
        if(inX == 0) {
            borrarPrimero();
            return;
        }
        else if(inX == iN - 1) {
            borrarUltimo();
            return;
        }
        
        NodoLE pPrev = getNodoLE(inX - 1);
        pPrev.next = pPrev.next.next;
        
        iN--;
    }
    
    public void borrarUltimo() {
        if(iN <= 1) {
            borrarPrimero();
            return;
        }
        
        NodoLE pSecLast = getNodoLE(iN - 2);
        nlast = pSecLast;
        nlast.next = null;
        
        iN--;
    }
    
    public void borrarTodo() {
        this.nfirst = null;
        this.iN = 0;
    }
    
    //---------------------------------//
    
    public void printer() {
        NodoLE pAux = nfirst;
        for(int i = 0; i <= iN; i++) {
            try {
                System.out.print(pAux.client.nombre + " -> ");
                pAux = pAux.next;
            }
            catch(Exception e) {
                
            }
        }
        System.out.println("Fin");
    }
    
}
