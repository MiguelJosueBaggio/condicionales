import java.util.Scanner;

public class punto7 {
//Ejercicio 7: Sistema de Recomendación de Actividades
//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//recomiende una actividad basada en su estado de ánimo.



    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        System.out.println("Opciones: \n" +"Feliz\n" + "Triste\n" + "energico\n" + "relajado\n" );

        System.out.println("Ingrese su estado de animo: ");

        String estado = intro.next();
        String estadoMin = estado.toLowerCase();

        switch (estadoMin) {

            case "feliz":
                System.out.println("Usted debe hacer un hobbie");
                break;

            case "triste":
                System.out.println("Dialogar con personas");
                break;

            case "energico":
                System.out.println("Practicar deportes");
                break;

            case "relajado":
                System.out.println("tomar un café");
                break;


            default:
                System.out.println("Ingreso mal el estado");


        }








    }



}
