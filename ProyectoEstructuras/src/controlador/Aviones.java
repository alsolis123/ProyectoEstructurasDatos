
package controlador;


public class Aviones {
    private Nodo pilaInicio;
    
    
    public Aviones(){
        pilaInicio = null;
    }
    
    public void inicioAplicacion(){
        
//        Esto da un numero aleatorio entre 10 y 25
        int aleatorio = (int)Math.floor(Math.random()*(25-10+1)+10);
        for (int i = 0; i <= aleatorio-1; i++) {
            String nombre = "Avion"+(i+1);
            insertarFinal(nombre);
        }
        
    }
    public void insertarFinal(String avion){
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.avion = avion;
        
        if(pilaInicio == null){
            pilaInicio = nuevo;
        }else{
            Nodo aux = pilaInicio;

            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }   
    }
    
    
    public void imprimir(){
        for (Nodo aux = pilaInicio; aux != null;aux = aux.siguiente) {
            System.out.println(aux.avion);
        }
    }
    
    
}
