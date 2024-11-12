import java.util.Scanner;

class punto3{
    public static void main(String[] args) {
        //Ejercicio 3: Sistema de Recomendación de Libros
        //Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
        //ciencia ficción) y luego recomiende un libro basado en su elección.
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el genero:\n" + "Fantasia\n" + "Misterio\n" + "Romance\n" + "Ciencia ficcion\n");
        String libro = intro.next();
        String libro_min = libro.toLowerCase();


        switch (libro_min) {
            case "fanatasia":
                System.out.println("El señor de los anillos");

                break;

            case "misterio":
                System.out.println("Sherloc Homes");

                break;
            case "romance":
                System.out.println("romeo y julieta");
                break;

            case "ciencia ficcion":

                System.out.println("Stars Wars");

                break;


            default:
                System.out.println("Error en carga de genero");


        }

    }

}