import java.util.Scanner;

/*
Escriba la clase "MarcaPagina", que ayuda a llevar el control de la lectura de un libro. Debe disponer
de metodos para incrementar la pagina leida, para obtener informacion de la ultima pagina que se ha leido y para
comenzar desde el principio una nueva lectura del mismo libro.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MarcaPagina marcador = new MarcaPagina();

        System.out.println("¿Cuántas páginas has leído hasta ahora?: ");
        int paginasLeidas = sc.nextInt();
        System.out.println("Cuantas paginas tiene el libro?: ");
        int paginasTotales = sc.nextInt();

        marcador.setUltimaPagina(paginasLeidas);

        System.out.println("Última página leída: " + marcador.ultimaPaginaLeida());

        if(marcador.ultimaPaginaLeida() == paginasTotales){
            System.out.println("Esa era la ultima pagina del libro. Bien hecho!!!");
            marcador.reiniciar();
        }else {
            marcador.incrementar();
            System.out.println("Después de leer una página más, ahora llevas: " + marcador.ultimaPaginaLeida());
        }
    }
}