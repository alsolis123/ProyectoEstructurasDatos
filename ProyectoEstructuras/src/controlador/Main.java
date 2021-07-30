
package controlador;

import vista.Aterrizar;
import vista.Despegue;
import vista.Hangar;
import vista.Inicio;
import vista.Principal;
import vista.Vuelo;


public class Main {
    
    //    Vista
    public static Aterrizar aterrizar = new Aterrizar();
    public static Despegue despegue = new Despegue();
    public static Hangar hangar = new Hangar();
    public static Inicio inicio = new Inicio();
    public static Principal principal = new Principal();
    public static Vuelo vuelo = new Vuelo();
    
    //Logica
    public static Aviones aviones = new Aviones();
    
    
    public static void main(String[] args) {
        mostrar_Inicio();
        aviones.inicioAplicacion();
        aviones.imprimir();
    }
    
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
    
    
    
}
