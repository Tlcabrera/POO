package Introduccion;

import java.util.Scanner;

import Principal.Animal;
import Principal.Ave;

public class Inicio {
    public static void main(String[] args) {
        int estatura,ed,en;
        String no;
        Scanner captura=new Scanner(System.in);
        //nombre clase+ nombre objeto= palabra reservada+metodo constructor
        Animal oso=new Animal();
        System.out.println("Por favor registre la envergadura");
        en=captura.nextInt();
       /*System.out.println("Por favor digite la estatura del animal");
        estatura=captura.nextInt();
        System.out.println("Digite el nombre del animal");
        no=captura.next();
        System.out.println("Por favor digite la edad del animal");
        ed=captura.nextInt();
        
        //oso.registrarAnimal();
        oso.setNombre(no);
        oso.setEdad(ed);
        oso.setIdCodigo(12456);
        System.out.println("----------------");
        System.out.println("el nombre es "+oso.getNombre());
        System.out.println("----------------");
        oso.mostrarAnimal();
        System.out.println("----------------");
        oso.mostrarAnimal(no, ed);
        //cuando invoco un método con parametros se solicita el argumento
        //oso.calcularPeso(estatura);*/
        
        oso.registrarAnimal();


        Ave aguila=new Ave(oso.getIdCodigo(),oso.getNombre(),oso.getRaza(),oso.getEdad(),en);
        
        aguila.mostrarAve();

        captura.close();

    }
}
