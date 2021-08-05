
package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Aviones {
    
    private Nodo[] listas = new Nodo[5];
    
//    Nodo 0 es al inicio
//    Nodo 1 - enVuelo, Nodo 2 - En pista Aterrizaje, Nodo 3 - Despegue, Nodo 4 - Hangar
    
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
    
    
    public boolean insertarFila1(String modelo, int pasajeros, int sobrecargos, String piloto){
        boolean condicion = false;
        Nodo nuevo = new Nodo();
        nuevo.siguiente = null;
        nuevo.modelo = modelo;
        nuevo.pasajeros = pasajeros;
        nuevo.sobrecargos = sobrecargos;
        nuevo.piloto = piloto;
        
        if(validarPiloto(piloto)==false){
            condicion = true;    
            if(listas[0] == null){
                listas[0] = nuevo;
                
            }else{
//                Se esta agregando al final de la lista principal
                Nodo aux = listas[0];

                while(aux.siguiente != null){
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este piloto ya fue ingresado");
        }
        return condicion;
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
        if(insertarFila1(modelo, pasajeros, sobrecargos, piloto)== true){
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
    
    //Logica vuelo
    
    public void logicaTablas(JTable tabla, int fila, int lista){
        try{
            String piloto = (String) tabla.getValueAt(fila, 0);
            String modelo = (String) tabla.getValueAt(fila, 1);
            int pasajeros = (int) tabla.getValueAt(fila, 2);
            int sobrecargos = (int) tabla.getValueAt(fila, 3);

            if (lista == 1){
                Vuelo(modelo, pasajeros, sobrecargos, piloto);
            }else if(lista == 2){
                Aterrizaje(modelo, pasajeros, sobrecargos, piloto);
            }else if(lista == 3){
                Despegue(modelo, pasajeros, sobrecargos, piloto);
            }else{
                Hangar(modelo, pasajeros, sobrecargos, piloto);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "No hay aviones en esta area");
        }
    }
    
    public void Vuelo(String modelo, int pasajeros, int sobrecargos, String piloto){
        insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 2);
        borrarVuelo(piloto);
    }
    public void borrarVuelo(String piloto){
        
        
        if (listas[1].piloto.equals(piloto)){
            if(listas[1].siguiente == null){
                listas[1] = null;
            }else{
                listas[1] = listas[1].siguiente;
            }
        }else{
            Nodo aux = listas[1];
            while(aux.siguiente.piloto != piloto && aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = aux.siguiente.siguiente;
        }
    }
    //Logica aterrizaje
    public void Aterrizaje(String modelo, int pasajeros, int sobrecargos, String piloto){
//        Se debe de insertar en el hangar
        insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 4);
        borrarAterrizaje_o_Despegue(2);
    }
    public void borrarAterrizaje_o_Despegue(int lista){
        if(listas[lista] == null){
            JOptionPane.showMessageDialog(null, "No hay aviones en esta area");
        }else if (listas[lista].siguiente == null){
            listas[lista] = null;
        }else{
            listas[lista] = listas[lista].siguiente;
        }
    }
    
//    Logica Despegue
    public void Despegue(String modelo, int pasajeros, int sobrecargos, String piloto){
        insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 1);
        borrarAterrizaje_o_Despegue(3);
    }
//    Logica hangar
    public void Hangar(String modelo, int pasajeros, int sobrecargos, String piloto){
        insertarlistasAleatorio(modelo, pasajeros, sobrecargos, piloto, 3);
        borrarHangar();
    }
    public void borrarHangar(){
        
        if(listas[4].siguiente == null){
            listas[4] = null;
        }else{
            Nodo aux = listas[4];
            while(aux.siguiente.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = null;  
        }
        
        
    }
}