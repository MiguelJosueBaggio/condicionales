import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class punto1 {
    public static void main(String[] args) {

        // Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
        //Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
        //Instrucciones:
        //•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
        //•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

        Scanner intro = new Scanner(System.in);

        double horasTotales = 0;
        double estudioIn= 0;
        double ejercicioIn= 0;
        double lecturaI= 0;
        double tiempoLibreIni= 0;

        while (horasTotales<=16){
            System.out.print("Ingresar las horas de estudio: ");
            double estudio = intro.nextDouble();
            estudioIn=+estudio;
            System.out.print("Ingresar las horas de ejercicios: ");
            double ejercicio = intro.nextDouble();
            ejercicioIn=+ejercicio;
            System.out.print("Ingresar las horas de lectura: ");
            double lectura = intro.nextDouble();
            lecturaI=+lectura;
            System.out.print("Ingresar las horas de tiempo libre: ");
            double tiempoLibre = intro.nextDouble();
            tiempoLibreIni=+tiempoLibre;
            horasTotales= estudio+ejercicio+lectura+tiempoLibre;

            if (horasTotales >16) {
                System.out.println("Usted duerme menos de 16 horas");

            }



        }//fin while

        System.out.println("Tiempo de estudio es: " + estudioIn);
        System.out.println("Tiempo de ejercicio es: " + ejercicioIn);
        System.out.println("Tiempo de lectura es: " + lecturaI);
        System.out.println("Tiempo de tiempo libre es: " + tiempoLibreIni);

    }//fin main
} //fin class


