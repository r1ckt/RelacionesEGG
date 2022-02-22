/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. 
 */
package ejercicio_02;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        
        juego.crearJuego();
        
        while(!juego.finDelJuego()){
            juego.ronda();
        }
        
        System.out.println("Fin del juego.");
        
    }
    
}
