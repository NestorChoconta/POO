package Salud;

import java.util.Scanner;

public class Persona3 {
        //atributos con accesibilidad privada
        private String tipoDoc,nombre,apellido,sexo;
        private int Documento,edad;
        private double peso,estatura,pesoActual;
        //declaracion de metodos
        public void pedirDatos(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        tipoDoc=capturar.next();
        System.out.println("digite su documento");
        Documento=capturar.nextInt();
        System.out.println("digite su nombre");
        nombre=capturar.next();
        System.out.println("digite su apellido");
        apellido=capturar.next();
        /*System.out.println("digite su peso");
        peso=capturar.nextInt();
        System.out.println("digite su estatura");
        estatura=capturar.nextInt();
        System.out.println("digite su edad");
        edad=capturar.nextInt();
        System.out.println("digite su sexo");
        sexo=capturar.next();*/
        }
    
        public void mostrarPersona(){
            System.out.println("el tipo de documento es"+tipoDoc);
            System.out.println("el numero de documento es"+Documento);
            System.out.println("el nombre de la persona es"+nombre);
            System.out.println("el apellido de la persona es"+apellido);
            /*System.out.println("el peso de la persona es"+peso);
            System.out.println("la estatura de la persona es"+estatura);
            System.out.println("la edad de la persona es"+edad);
            System.out.println("el sexo de la persona es"+sexo); */
        }
        
        public void calcularmc(){
            pesoActual=(peso/estatura)*2;
            if (pesoActual<20) {
                System.out.println("El peso esta por debajo de lo ideal");
            }else if (pesoActual>20 && pesoActual<25) {
                System.out.println("El peso es ideal");
            }else {
                System.out.println("tiene sobrepeso");
            }
        }
    
        public void mayorEdad(){
            if (edad>60) {
                System.out.println("usted es mayor de edad");
            }else {
                System.out.println("usted es joven");
            }
        }

        public String gettipoDoc(){
            return tipoDoc;
        }
        public void settipoDoc(String tipoDoc){
            this.tipoDoc=tipoDoc;
        }

        public int getdocumento(){
            return Documento;
        }
        public void settipoDoc(int Documento){
            this.Documento=Documento;
        }

        public String getnombre(){
            return nombre;
        }
        public void setnombre(String nombre){
            this.nombre=nombre;
        }
        
        public String getapellido(){
            return apellido;
        }
        public void setapellido(String apellido){
            this.apellido=apellido;
        }

        public String getsexo(){
            return sexo;
        }
        public void setsexo(String sexo){
            this.sexo=sexo;
        }

        public int getedad(){
            return edad;
        }
        public void setedad(int edad){
            this.edad=edad;
        }

        public double getpeso(){
            return peso;
        }
        public void setpeso(Double peso){
            this.peso=peso;
        }

        public double geteststura(){
            return estatura;
        }
        public void setestatura(Double estatura){
            this.estatura=estatura;
        }

        public void calcularHonorarios() {
        }
        
}
