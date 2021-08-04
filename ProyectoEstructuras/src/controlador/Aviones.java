
package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Aviones {
    
    private Nodo[] listas = new Nodo[5];
    
//    Nodo 0 es al inicio
//    Nodo 1 - enVuelo, Nodo 2 - En pista, Nodo 3 - Despegue, Nodo 4 - Hangar
    
    public Aviones(){
        for (int i = 0; i < listas.length; i++) {
            listas[i] = null;
        }
    }
    
    public boolean validarPiloto(String piloto){
        Nodo aux = listas[0];
        boolean condicion = false;
        
        
        while(aux!=null){
            if(aux.piloto.equals(piloto)){
                condicion = true;
            }
            aux = aux.siguiente;
        }
        return condicion;
    }
    
    
    public void insertarFila1(String modelo, int pasajeros, int sobrecargos, String piloto){
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.modelo = modelo;
        nuevo.pasajeros = pasajeros;
        nuevo.sobrecargos = sobrecargos;
        nuevo.piloto = piloto;
        
        if(validarPiloto(piloto)==false){
                
            if(listas[0] == null){
                listas[0] = nuevo;
            }else{
                Nodo aux = listas[0];

                while(aux.siguiente != null){
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este piloto ya fue ingresado");
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
            int aleatorio = (int) (Math.random() * (4 + 1 - 1)) + 1;
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
//            Se inserta al final
            Nodo aux = listas[lista];
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            
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
    public DefaultTableModel llenarTablas(DefaultTableModel modelo, int lista){
        Object[]columna = new Object[4];
        Nodo aux = listas[lista];
        modelo.setNumRows(0);
        
        while(aux!=null){
            columna[0] = aux.piloto;
            columna[1] = aux.modelo;
            columna[2] = aux.pasajeros;
            columna[3] = aux.sobrecargos;
            modelo.addRow(columna);
            aux = aux.siguiente;
        }
        return modelo;
    }
    
    
    
    // Logica incluir
    
    public void incluirAvion(String modelo, int pasajeros, int sobrecargos, String piloto, String lista){
        if(lista.equals("Aleatorio")){
            int aleatorio = (int) (Math.random() * (4 + 1 - 1)) + 1;
            insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, aleatorio);
        }else if(lista.equals("Aviones en Vuelo")){
            insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 1);
        }else if(lista.equals("Aviones en Hangar")){
            insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 4);
        }else if(lista.equals("Pista de Despegue")){
            insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 3);
        }else{
            insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 2);
        }
    }
    
    

}