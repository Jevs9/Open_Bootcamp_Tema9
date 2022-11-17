//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
public class Main {
    public static void main(String[] args) {
       Cliente cliente1 = new Cliente();
       cliente1.setEdad(52);
        System.out.println("Edad cliente 1: "+cliente1.getEdad());
        cliente1.setTelefono(12345678);
        System.out.println("Telefóno cliente1: "+cliente1.getTelefono() );
        cliente1.setNombre("Julano");
        System.out.println("Nombre Cliente1: "+cliente1.getNombre());
        cliente1.setCredito(1523);
        System.out.println("Crédito cliente1: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(24);
        System.out.println("Edad trabajador 1: "+trabajador1.getEdad());
        trabajador1.setTelefono(8765432);
        System.out.println("Telefóno trabajador1: "+trabajador1.getTelefono() );
        trabajador1.setNombre("Pepito");
        System.out.println("Nombre trabajador1: "+trabajador1.getNombre());
        trabajador1.setSalario(125463);
        System.out.println("Salario trabajador1: "+trabajador1.getSalario());
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona{
    float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
}
class Trabajador extends Persona{
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}



