
package controlador;


public class Aviones {
    
    private Nodo[] listas = new Nodo[5];
    
//    Nodo 1 es al inicio
    
    public Aviones(){
        for (int i = 0; i < listas.length; i++) {
            listas[i] = null;
        }
    }
    
    public void insertarPila1(String modelo, int pasajeros, int sobrecargos, String piloto){
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.modelo = modelo;
        nuevo.pasajeros = pasajeros;
        nuevo.sobrecargos = sobrecargos;
        nuevo.piloto = piloto;
        
        if(listas[1] == null){
            listas[1] = nuevo;
        }else{
            Nodo aux = listas[1];

            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }   
    }
    
    
    public int contador_Inicio(){
        int contador = 0;
        for (Nodo aux = listas[1]; aux != null;aux = aux.siguiente) {
            contador++;
        }
        System.out.println(contador);
        
        return contador;
    }
    
    public void distribuirAviones(){
        
    }

}