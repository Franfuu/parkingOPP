public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pedro", 12);
        Persona persona3 = new Persona();
        System.out.println(persona.saluda());
        System.out.println(persona3.saluda());

        if (persona.esMayorEdad()){
            System.out.println(persona.nombre+ " es mayor de edad");
        }else{
            System.out.println(persona.nombre+ " es menor de edad");
        }
        if (persona.esMayorEdad()){
            System.out.println(persona3.nombre+ " es mayor de edad");
        }else{
            System.out.println(persona3.nombre+ " es menor de edad");
        }
    }
}