/*
funciones acà se llaman metodos
variables acà se llaman atributos
constructores (cuya misión es inicializar un objeto de una clase. En el constructor se asignan los valores iniciales del nuevo objeto.)
vacìo: los ingresa el usuario.
sobrecargado:les asigno valor yo y los paso como paràmetro cuando creo el objeto-simpre respetando el orden de los atributos
/o pido al usuario-llamo al scanner,y los guardo en una variable
uso de this.: la clase tiene dos variables una que paso por parámetro y otra que he definido como atributo, entoces utilizo el this para hacer refencia a ese atributo 
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Libro {

    private long isbn; //numeros grandes long- si tiene guiones se declara como String
    private String titulo;
    private String autor;
    private int numPage;

    public Libro(int isbn, String titulo, String autor, int numPage) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPage = numPage;
    }

    public Libro() {
    }

    public void CargarLibro() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el código ISBN: ");
        int isbn1 = sc.nextInt();
        this.isbn = isbn1; //**otra opcion sería this.isbn = sc.nextInt();
        System.out.print("Ingrese el autor: ");
        String autor1 = sc.next();
        this.autor = autor1;
        System.out.print("Ingrese el nombre del libro: ");
        String titulo1 = sc.next();
        this.titulo = titulo1;
        System.out.print("Ingrese el numero de paginas: ");
        int numpage1 = sc.nextInt();
        this.numPage = numpage1;

    }

    public void mostrar() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Autor: " + this.autor);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Numero: " + this.numPage);

    }

}
