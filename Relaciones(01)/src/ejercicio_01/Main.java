/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/
package ejercicio_01;


public class Main {

    public static void main(String[] args) {
        Persona person1 = new Persona();
        Persona person2 = new Persona();
        
        Perro dog1 = new Perro();
        Perro dog2 = new Perro();
        
        dog1.setNombre("Beethoven");
        dog1.setRaza("Grandanés");
        dog1.setEdad(2);
        dog1.setTamanio("Grande");
        
        person1.setNombre("Ricardo");
        person1.setApellido("Olivera");
        person1.setEdad(28);
        person1.setDocumento(12123123);
        person1.setPerro(dog1);
        
        
        dog2.setNombre("Chopin");
        dog2.setRaza("Cocker");
        dog2.setEdad(1);
        dog2.setTamanio("Mediano");
        
        person2.setNombre("Maria");
        person2.setApellido("Salgado");
        person2.setEdad(22);
        person2.setDocumento(12123123);
        person2.setPerro(dog2);
        
        System.out.println("Persona 1");
        System.out.println(person1);
        System.out.println();
        System.out.println("Persona 2");
        System.out.println(person2);
    }
    
}
