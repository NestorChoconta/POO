package POO;

import Salud.Persona3;

public class Inicio3 {
    public static void main(String[] args) {
        //creacion del objeto 
        Persona3 salud=new Persona3();
        salud.pedirDatos();
        salud.mostrarPersona();
        //salud.calcularmc();
        //salud.mayorEdad();
        salud.calcularHonorarios();
    }
}
