package Principal;

import java.util.Scanner;

public class Animal {
    //Atributos
    private int idCodigo;
    private String nombre;
    private String raza;
    private int edad;


    //método contructor vacio
    public Animal(){
    }
    //método constructor con parámetros
    /*Sobrecarga=métodos que tengan el mismo nombre
     1. que tengan misma cantidade parametros pero por lo menos un tipo de dato diferente
     2. que tengan diferente cantidad de parametros

    */
    public Animal(int idCodigo, String nombre, String raza, int edad) {
        this.idCodigo = idCodigo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    /*public Animal(int _idCodigo, String _nombre, String _raza, int _edad){
        idCodigo=_idCodigo;
        nombre=_nombre;
        raza=_raza;
        edad=_edad;
    }*/
    //metodos accesores getter y setter
   /* //get
    public int getIdCodigo(){
    return idCodigo;
    }
    //set
    public void setIdcodigo(int idCodigo){
    this.idCodigo=idCodigo;
    }*/

    

    //Métodos
    // modificador de acceso+ valor de retorno+nmbre del metodo+parámetros
    //+registrarAnimal() +mostrarAnimal() +calcularPeso()
   
    public int getIdCodigo() {
        return idCodigo;
    }
    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void registrarAnimal(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Por favor registre el código del animal");
        idCodigo=capturar.nextInt();
        System.out.println("Por favor registre el nombre del animal");
        nombre=capturar.next();
        System.out.println("Por favor registre la raza del animal");
        raza=capturar.next();
        System.out.println("Por favor registre la edad del animal");
        edad=capturar.nextInt();
        capturar.close();
    }
    public void mostrarAnimal(){
        System.out.println("Los datos del Animal registrado son: \n1.Código: "+idCodigo+"\n2.Nombre: "+nombre+"\n3.Raza: "+raza+"\n4.Edad: "+edad);
    }

    public void mostrarAnimal(String no,int ed) {
        System.out.println("El animal ingresado tiene el nombre "+no+" y su edad es "+ed+" años");
    }
    /*método con parámetros
     modificador de acceso+ valor retorno +nombre del método+parámetros
    peso=estatura*50 
    3 tipos de parametros in (entrada) out(salida) inout(entrada y salida)*/
    public int calcularPeso(int estatura){
        int peso;
        peso=(estatura*50);
        System.out.println("El peso del animal es: "+peso);
        if(peso<30){
            System.out.println("El animal esta bajo de peso");
        }else if(peso>30 && peso<100){
            System.out.println("El animal tiene un peso normal");
        }else if(peso>100){
            System.out.println("El animal esta es sobrepeso");
        }else{
            System.out.println("se calculo mal el peso del animal");
        }
        return peso;
    }

}