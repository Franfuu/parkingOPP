public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos
    Persona() {
        nombre = "Mipoyaenmoto33";
        edad = -1;
    }

    Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    String saluda() {
        return "Buenas soy " + nombre + " y tengo " + edad;
    }

    boolean esMayorEdad() {
        boolean valido = false;
        if (edad >= 18) {
            valido = true;
        }
        return valido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
