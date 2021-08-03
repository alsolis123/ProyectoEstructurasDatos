
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
        
        if(listas[0] == null){
            listas[0] = nuevo;
        }else{
            Nodo aux = listas[0];

            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }   
    }
    
    
    public int contador_Inicio(){
        int contador = 0;
        for (Nodo aux = listas[0]; aux != null;aux = aux.siguiente) {
            contador++;
        }
        System.out.println(contador);
        
        return contador;
    }
    
    public void distribuirAviones(){
        for (Nodo aux = listas[0]; aux != null; aux = aux.siguiente) {
//            int aleatorio = (int) (Math.random() * (4 + 1 - 1)) + 1;
            int aleatorio = 1;
            insertarlistasAleatorio(aux.modelo, aux.pasajeros, aux.sobrecargos, aux.piloto, aleatorio);
        }
    }
    @SuppressWarnings("empty-statement")
    private void insertarlistasAleatorio(String modelo, int pasajeros, int sobrecargos, String piloto, int lista){
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.modelo = modelo;
        nuevo.pasajeros = pasajeros;
        nuevo.sobrecargos = sobrecargos;
        nuevo.piloto = piloto;
        
        if(listas[lista] == null){
            listas[lista] = nuevo;
        }else if(lista != 1){
            nuevo.siguiente = listas[lista];
            listas[lista] = nuevo;
        }else{
            
            if (listas[lista].piloto.compareTo(piloto) > 0 ){
                nuevo.siguiente = listas[lista];
                listas[lista] = nuevo;
            }else{
                Nodo aux = listas[lista];
                
                while (aux.siguiente != null && aux.siguiente.piloto.compareTo(piloto) <= 0){
                    aux = aux.siguiente;
                   
                }
                nuevo.siguiente = aux.siguiente;
                aux.siguiente = nuevo;
            }    
        }
         
    }
    public void imprimirlista2(){
        for (Nodo aux = listas[1]; aux!= null; ) {
            System.out.print(aux.piloto);
            System.out.println(" ");
            aux = aux.siguiente;
        }
    }

}