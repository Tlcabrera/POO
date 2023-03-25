package Principal;

public class Ave extends Animal {
    private float envergadura;
    //método constructor de la subclase
    public Ave(int idCodigo, String nombre, String raza, int edad,float envergadura){
    super(idCodigo, nombre, raza, edad);
    this.envergadura=envergadura;
    }
    //métodos accesores get y set
    public float getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(float envergadura) {
        this.envergadura = envergadura;
    }
    
    public void mostrarAve(){
    System.out.println("Los datos del Ave registrado son: \n1.Código: "+getIdCodigo()+"\n2.Nombre: "+getNombre()+"\n3.Raza: "+getRaza()+"\n4.Edad: "+getEdad()+"\n5.Envergadura: "+envergadura);
    }


    
}
