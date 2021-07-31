
package controlador;


public class Aviones {
    
    private Nodo[] pilas = new Nodo[5];
    
//    Nodo 1 es al inicio
    
    public Aviones(){
        for (int i = 0; i < pilas.length; i++) {
            pilas[i] = null;
        }
    }
    
    public void insertarPila1(String modelo, int pasajeros, int sobrecargos, String piloto){
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.modelo = modelo;
        nuevo.pasajeros = pasajeros;
        nuevo.sobrecargos = sobrecargos;
        nuevo.piloto = piloto;
        
        if(pilas[1] == null){
            pilas[1] = nuevo;
        }else{
            Nodo aux = pilas[1];

            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }   
    }
    
    
    public int contador_Inicio(){
        int contador = 0;
        for (Nodo aux = pilas[1]; aux != null;aux = aux.siguiente) {
            contador++;
        }
        System.out.println(contador);
        
        return contador;
    }
    
    public void distribuirAviones(){
        
    }

}