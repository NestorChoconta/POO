package POO;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //creacion del objeto 
        Persona salud=new Persona();
        salud.pedirDatos();
        salud.mostrarPersona();
        salud.calcularmc();
        salud.mayorEdad();
    }
}
