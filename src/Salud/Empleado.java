package Salud;

import java.sql.Date;
import java.util.Scanner;

public class Empleado extends Persona3{
    private String cargo,departamento;
    private int valorhora;
    private int horasTrabajadas;
    private double honorarios;
    private double total;
    private double reteica=0.966;

    public void calcularHonorarios(){
        honorarios=valorhora*horasTrabajadas;
        total=honorarios-reteica;

        Scanner capturar=new Scanner(System.in);
        System.out.println("digite su cargo");
        cargo=capturar.next();
        System.out.println("digite sus horsa trabajadas");
        cargo=capturar.next();
        System.out.println("digite el valor por hora");
        cargo=capturar.next();
        System.out.println("el total a pagar es"+total);
    }
    
}
