
package proyecto2_edd;



public class ListaEnlazadaHab {
    
    private NodoLEHab nfirst;
    private NodoLEHab nlast;
    private int iN;
    
    public ListaEnlazadaHab() {
        nfirst = null;
        nlast = null;
        iN = 0;
    }
    
    //---------------------------------//
    
    public boolean esVacio() {
        return nfirst == null;
    }
    
    public NodoLEHab primerNodo() {
        return nfirst;
    }
    
    public NodoLEHab ultimoNodo() {
        return nlast;
    }
    
    public int size() {
        return iN;
    }
    
    //---------------------------------//
    
    public int buscarIndex(String num_hab) {
        NodoLEHab pAux = nfirst;
        for(int i = 0; i <= iN; i++) {
            if(pAux.hab.num_hab.equals(num_hab)) {
                return i;
            }
            else {
                pAux = pAux.next;
            }
        }
        return -1;
    }
    
    public NodoLEHab getNodoLE(int inX) {
        NodoLEHab pAux = nfirst;
        for(int i = 0; i < inX; i++) {
            pAux = pAux.next;
        }
        return pAux;
    }
    
    //---------------------------------//
    
    public void insertarPrimero(Habitacion hab_) {
        NodoLEHab pNew = new NodoLEHab(hab_);
        if(nfirst == null) {
            nfirst = nlast = pNew;
            iN++;
            return;
        }
        
        pNew.next = nfirst;
        nfirst = pNew;
        
        iN++;
    }
    
    public void insertar(Habitacion hab_, int inX) {
        
    }
    
    public void insertarUltimo(Habitacion hab_) {
        if(nlast == null) {
            insertarPrimero(hab_);
            return;
        }
        NodoLEHab pNew = new NodoLEHab(hab_);
        
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
        
        NodoLEHab pPrev = getNodoLE(inX - 1);
        pPrev.next = pPrev.next.next;
        
        iN--;
    }
    
    public void borrarUltimo() {
        if(iN <= 1) {
            borrarPrimero();
            return;
        }
        
        NodoLEHab pSecLast = getNodoLE(iN - 2);
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
        NodoLEHab pAux = nfirst;
        for(int i = 0; i <= iN; i++) {
            try {
                System.out.print(pAux.hab.num_hab + ": " + pAux.hab.tipo_hab + " -> ");
                pAux = pAux.next;
            }
            catch(Exception e) {
                
            }
        }
        System.out.println("Fin");
    }
    
}
