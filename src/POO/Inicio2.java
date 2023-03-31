package POO;

import Salud.persona2;

public class Inicio2 {
    public static void main(String[] args) {
        double peso=0,estatura=0,pesoActual;
        //creacion del objeto 
        persona2 salud=new persona2();
        salud.pedirDatos();
        //salud.mostrarPersona();
        pesoActual=salud.calcularmc(peso,estatura);
        System.out.println("su peso actual es" + pesoActual);
        //salud.mayorEdad();
    }
}
