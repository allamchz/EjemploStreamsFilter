package ejemplostreams;

/**
 * Programa principal donde se aplican distintos filtrados para procesar un listado de personas
 */

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Nacho", 42));
        listaPersonas.add(new Persona("Juan", 70));
        listaPersonas.add(new Persona("Mario", 7));
        listaPersonas.add(new Persona("Laura", 4));
        listaPersonas.add(new Persona("May", 41));

        System.out.println("Personas adultas cuyo nombre comienza por M:");
        listaPersonas.stream()
                     .filter(p -> p.getEdad() >= 18 && p.getNombre().startsWith(("M")))
                     .forEach(p -> System.out.println(p));
                     // También sirve .forEach(System.out::println);
    }
}
