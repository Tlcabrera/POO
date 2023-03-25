package Principal;

public class Inicio {
    public static void main(String[] args) {
        /*para invocar los métodos de una clase siempre 
        1. se debe instanciar la clase=crear un objeto de la clase.
        2. invocar el metodo= nombreObjeto+nombredel metodo */
        Animal oso=new Animal();
        oso.registrarAnimal();
        oso.mostrarAnimal();
    }
}
