
package controlador;

import javax.swing.JOptionPane;
import vista.Aterrizar;
import vista.Configurar;
import vista.Despegue;
import vista.Hangar;
import vista.Inicio;
import vista.Principal;
import vista.Vuelo;


public class Main {
    
    //    Vista - Objetos
    public static Aterrizar aterrizar = new Aterrizar();
    public static Despegue despegue = new Despegue();
    public static Hangar hangar = new Hangar();
    public static Inicio inicio = new Inicio();
    public static Principal principal = new Principal();
    public static Vuelo vuelo = new Vuelo();
    public static Configurar configurar = new Configurar();
    
    //Logica
    public static Aviones aviones = new Aviones();
    
    
    public static void main(String[] args) {
        mostrar_Inicio();
    }
    
//    Logica Inicio
    public static void configurar_Inicio(){
        
        if(aviones.contador_Inicio() < 25){
            aviones.insertarFila1(configurar.getText_modelo(), Integer.parseInt(configurar.getText_pasajeros()), Integer.parseInt(configurar.getText_sobrecargo()), configurar.getText_piloto());
        }else {
            JOptionPane.showMessageDialog(null, "No se puede ingresar mas de 25 aviones al inicio");
        }
    }
    
    public static void llenarTablas(){
        
    }
    
    public static int contador_Inicio(){
        return aviones.contador_Inicio();
    }

    public static void distribuirAviones(){
        aviones.distribuirAviones();
        aviones.imprimirlista2();
    }
    
    
//    Abrir y cerrar ventanas
    
    public static void mostrar_Aterrizar(){
        aterrizar.setVisible(true);
    }
    public static void ocultar_Aterrizar(){
        aterrizar.setVisible(false);
    }
    
    public static void mostrar_Despegue(){
        despegue.setVisible(true);
    }
    public static void ocultar_Despegue(){
        despegue.setVisible(false);
    }
    
    public static void mostrar_Hangar(){
        hangar.setVisible(true);
    }
    public static void ocultar_Hangar(){
        hangar.setVisible(false);
    }
    
    public static void mostrar_Inicio(){
        inicio.setVisible(true);
    }
    public static void ocultar_Inicio(){
        inicio.setVisible(false);
    }
    
    public static void mostrar_Principal(){
        principal.setVisible(true);
    }
    public static void ocultar_Principal(){
        principal.setVisible(false);
    }
    
    public static void mostrar_Vuelo(){
        vuelo.setVisible(true);
    }
    public static void ocultar_Vuelo(){
        vuelo.setVisible(false);
    }
    public static void mostrar_Configurar(){
        configurar.setVisible(true);
    }
    public static void ocultar_Configurar(){
        configurar.setVisible(false);
    }
    
}
