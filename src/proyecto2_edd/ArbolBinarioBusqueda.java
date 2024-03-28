
package proyecto2_edd;



public class ArbolBinarioBusqueda {
    
    NodoABB raiz;
    
    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }
    
    //---------------------------------//
    
    public int altura(NodoABB Node) {
        return Node != null ? Node.altura : -1;
    }
    
    public void actualizarAltura(NodoABB Node) {
        int alturaHijoIzq = altura(Node.hijo_izq);
        int alturaHijoDer = altura(Node.hijo_der);
        Node.altura = Math.max(alturaHijoIzq, alturaHijoDer) + 1;
    }
    
    public int factorBalance(NodoABB Node) {
        return altura(Node.hijo_der) - altura(Node.hijo_izq);
    }
    
    //---------------------------------//
    
    public NodoABB rotarDerecha(NodoABB Node) {
        NodoABB hijoIzq = Node.hijo_izq;
        
        Node.hijo_izq = hijoIzq.hijo_der;
        hijoIzq.hijo_der = Node;
        
        actualizarAltura(Node);
        actualizarAltura(hijoIzq);
        
        return hijoIzq;
    }
    
    public NodoABB rotarIzquierda(NodoABB Node) {
        NodoABB hijoDer = Node.hijo_der;
        
        Node.hijo_der = hijoDer.hijo_izq;
        hijoDer.hijo_izq = Node;
        
        actualizarAltura(Node);
        actualizarAltura(hijoDer);
        
        return hijoDer;
    }
    
    //---------------------------------//
    
    public NodoABB rebalance(NodoABB Node) {
        int factorBalance = factorBalance(Node);
        
        if(factorBalance < -1) {
            if(factorBalance(Node.hijo_izq) <= 0) {
                Node = rotarDerecha(Node);
            }
            else {
                Node.hijo_izq = rotarIzquierda(Node.hijo_izq);
                Node = rotarDerecha(Node);
            }
        }
        
        if(factorBalance > 1) {
            if(factorBalance(Node.hijo_der) >= 0) {
                Node = rotarIzquierda(Node);
            }
            else {
                Node.hijo_izq = rotarDerecha(Node.hijo_der);
                Node = rotarIzquierda(Node);
            }
        }
        
        return Node;
    }
    
    //---------------------------------//
    
    /*NOTA: No lee todas las entradas del csv; posiblemente en esta función, aunque no se descarta la posibilidad de que sea otra.*/
    
    public int asciiCode(String specStr) {
        int strSize = specStr.length();
        int asignacion = 0;
        
        for(int i = 0; i < strSize; i++) {
            int Ascii = specStr.charAt(i);
            
            
            
            asignacion += Ascii * (i + 1);
        }
        
        return asignacion;
    }
    
    public int ciFix(String str) {
        String strFix = str.replace(".","");
        int ci = Integer.parseInt(strFix);
        return ci;
    }
    
    //---------------------------------//
    
    public void insertar(ClienteHospedado client_) {
        raiz = insertar_main(raiz, client_);
    }
    
    private NodoABB insertar_main(NodoABB Node, ClienteHospedado client_) {
        if (Node == null) {
            return new NodoABB(client_);
        }
        else if (ciFix(Node.client.ci) > ciFix(client_.ci)) {
            Node.hijo_izq = insertar_main(Node.hijo_izq, client_);
        }
        else if (ciFix(Node.client.ci) < ciFix(client_.ci)) {
            Node.hijo_der = insertar_main(Node.hijo_der, client_);
        }
        else {
            throw new RuntimeException("Cliente duplicado!");
        }
        
        //actualizarAltura(Node);
        
        return rebalance(Node);
    }
    
    //---------------------------------//
    
    public void borrar(ClienteHospedado client_) {
        raiz = borrar_main(raiz, client_);
    }
    
    public NodoABB borrar_main(NodoABB Node, ClienteHospedado client_) {
        if (Node == null) {
            return Node;
        }
        else if (ciFix(Node.client.ci) > ciFix(client_.ci)) {
            Node.hijo_izq = borrar_main(Node.hijo_izq, client_);
        }
        else if (ciFix(Node.client.ci) < ciFix(client_.ci)) {
            Node.hijo_der = borrar_main(Node.hijo_der, client_);
        }
        else {
            if (Node.hijo_izq == null || Node.hijo_der == null) {
                Node = (Node.hijo_izq == null) ? Node.hijo_der : Node.hijo_izq;
            }
            else {
                borrarNodoDosHijos(Node);
            }
        }
        if (Node != null) {
            Node = rebalance(Node);
        }
        return Node;
    }
    
    private void borrarNodoDosHijos(NodoABB Node) {
        NodoABB sucesorInorden = encontrarMinimo(Node.hijo_der);
        
        Node.client = sucesorInorden.client;
        
        Node.hijo_der = borrar_main(Node.hijo_der, sucesorInorden.client);
    }
    
    private NodoABB encontrarMinimo(NodoABB Node) {
        while (Node.hijo_izq != null) {
            Node = Node.hijo_izq;
        }
        return Node;
    }
    
    //---------------------------------//
    
    public NodoABB buscar(String str1) {
        NodoABB current = raiz;
        while (current != null) {
            if (current.client.ci.equals(str1)) {
                break;
            }
            current = (ciFix(current.client.ci) < ciFix(str1)) ? current.hijo_der : current.hijo_izq;
        }
        return current;
    }
    
    public void recorrer(NodoABB node) {
        try {
            recorrer(node.hijo_izq);
        }
        catch(NullPointerException e) {
            
        }
        
        System.out.println(node.client.nombre + " " + node.client.apellido);
        
        try {
            recorrer(node.hijo_der);
        }
        catch(NullPointerException e) {
            
        }
    }
    
    public void recorridoSpec(ListaEnlazada list, NodoABB node) {
        try {
            recorridoSpec(list, node.hijo_izq);
        }
        catch(NullPointerException e) {
            
        }
        
        
        list.insertarUltimo(node.client);
        
        
        try {
            recorridoSpec(list, node.hijo_der);
        }
        catch(NullPointerException e) {
            
        }
    }
    
    public void recorridoSpec(ListaEnlazada list, NodoABB node, String habitacion_) {
        try {
            recorridoSpec(list, node.hijo_izq, habitacion_);
        }
        catch(NullPointerException e) {
            
        }
        
        if(node.client.habitacion.equals(habitacion_)) {
            list.insertarUltimo(node.client);
        }
        
        try {
            recorridoSpec(list, node.hijo_der, habitacion_);
        }
        catch(NullPointerException e) {
            
        }
    }
    
    public NodoABB getRaiz() {
        return raiz;
    }
    
}
