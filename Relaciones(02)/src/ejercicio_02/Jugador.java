package ejercicio_02;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver r) {
        System.out.println("El " + nombre + " se apunta con el revolver...");
        if (r.mojar()) {
            System.out.println("El " + nombre + " ha sido mojado.");
            this.mojado = true;
        } else {
            System.out.println("El " + nombre + " se salvó...");
        }
        return this.mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return nombre + ", mojado: " + mojado;
    }

}
