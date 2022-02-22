package ejercicio_02;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        llenarRevolver();
    }
    
    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        this.posicionActual = (int) (Math.random() * 6) + 1;
        this.posicionAgua = (int) (Math.random() * 6) + 1;
    }
    
    public boolean mojar(){
        boolean disparo = false;
        if(this.posicionActual == this.posicionAgua){
            disparo = true; 
        }
        
        siguienteChorro();
        return disparo;
    }
    
    public void siguienteChorro(){
        if(posicionActual == 6){
            this.posicionActual = 1;
        } else {
            this.posicionActual++;
        }
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    @Override
    public String toString() {
        return  "posicion Agua Actual:" + posicionActual + ", posicion Agua:" + posicionAgua;
    }
    

}
