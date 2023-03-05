package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;

/**
 *
 * @author Sebastian
 */
public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var sc = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de una pelicula a agregar: ");
                    var nombrePelicula = sc.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de una pelicula a buscar: ");
                    var buscar = sc.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("Elige opcion: ");
        System.out.println("1.- Iniciar catalogo peliculas");
        System.out.println("2.- Agregar pelicula");
        System.out.println("3.- Listar peliculas");
        System.out.println("4.- Buscar pelicula");
        System.out.println("0.- Salir");
        System.out.print(">");
    }
}
