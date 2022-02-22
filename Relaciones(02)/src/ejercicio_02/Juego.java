package ejercicio_02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Juego {

    private Scanner scan;
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        this.scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.jugadores = new ArrayList<>();
        this.revolver = new Revolver();
        

    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public void crearJuego(){
        crearJugadores();
    }

    public void crearJugadores() {
        System.out.println("Ingrese la cantidad de jugadores: ");
        int numJugadores = scan.nextInt();
        for (int i = 0; i < numJugadores; i++) {
            if ((numJugadores >= 1 && numJugadores <= 6)) {
                Jugador jugador = new Jugador(i + 1);
                agregarJugador(jugador);
            } else {
                Jugador jugador = new Jugador(6);
                agregarJugador(jugador);
            }

        }

    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public boolean finDelJuego() {
        for (Jugador jugador : jugadores) {
            if (jugador.isMojado()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {

        for (Jugador jugador : jugadores) {
            jugador.disparo(revolver);

            if (jugador.isMojado()) {
                break;
            }
        }
    }

}
