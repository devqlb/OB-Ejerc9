/*
Enunciado del ejercicio:
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades
la edad, el telefono, el nombre y el credito, tienes que darles valor y
mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que
herede de Persona, y con una variable salario que
solo tenga la clase Trabajador.
* */

public class Main {
    public static void main(String[] args) {

        Cliente clienteUno = new Cliente();

        System.out.println("**----Crédito del cliente----**");
        System.out.println(clienteUno.credito = 200.85);

        System.out.println("**----Nombre del cliente----**");
        System.out.println(clienteUno.nombre = "Juan");

        System.out.println("**----Edad del cliente----**");
        System.out.println(clienteUno.edad = 75);

        System.out.println("**----Número de teléfono del cliente----**");
        System.out.println(clienteUno.telefono = 5211223);


        Trabajador trabajadorUno = new Trabajador();

        System.out.println("**----Salario del trabajador----**");
        System.out.println(trabajadorUno.salario = 1750.67);

        System.out.println("**----Nombre del trabajador----**");
        System.out.println(trabajadorUno.nombre = "Eduardo");

        System.out.println("**----Edad del trabajador----**");
        System.out.println(trabajadorUno.edad = 23);

        System.out.println("**----Número de teléfono del trabajador----**");
        System.out.println(trabajadorUno.telefono = 1187223);

    }
}


class Persona {
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}