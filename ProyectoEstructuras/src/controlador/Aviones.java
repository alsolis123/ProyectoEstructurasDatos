
package controlador;


public class Aviones {
    
    private Nodo[] listas = new Nodo[5];
    
//    Nodo 1 es al inicio
    
    public Aviones(){
        for (int i = 0; i < listas.length; i++) {
            listas[i] = null;
        }
    }
    
    public void insertarFila1(String modelo, int pasajeros, int sobrecargos, String piloto){
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
        for (Nodo aux = listas[1]; aux != null; aux = aux.siguiente) {
            int aleatorio = (int) (Math.random() * (5 + 1 - 2)) + 2;
            insertarlistasAleatorio(aux.modelo, aux.pasajeros, aux.sobrecargos, aux.piloto, aleatorio);
        }
    }
    private void insertarlistasAleatorio(String modelo, int pasajeros, int sobrecargos, String piloto, int lista){
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.modelo = modelo;
        nuevo.pasajeros = pasajeros;
        nuevo.sobrecargos = sobrecargos;
        nuevo.piloto = piloto;
        
        if(listas[lista] == null){
            listas[lista] = nuevo;
        }else if(lista != 2){
            nuevo.siguiente = listas[lista];
            listas[lista] = nuevo;
        }else{
//            Aca se debe de agregar para los aviones en vuelo esto en es orden alfabetico
        }
            
    }
    public void insertar_enVuelo(){
        String palabra1 = "Alberto";
        String palabra2 = "Arberto";
        int comparacion =  palabra1.compareTo(palabra2);
        System.out.println(comparacion);
//        ver notas aqui hay que ordenar por alfabeto
    }

}