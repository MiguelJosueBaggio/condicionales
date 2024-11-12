
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class punto6 {       //Ejercicio 6: Evaluador de Hábitos Saludables
    //Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
   //ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
    //hábitos saludables basada en estos datos

   public static void main(String[] args) {
      Scanner intro = new Scanner(System.in);
      System.out.println("ingrese horas al dia que duerme");
      int horasDuerme = intro.nextInt();
      System.out.println("ingrese horas al dia que hace ejercicio");
      int horasEjercico = intro.nextInt();

      System.out.println("ingrese cuantas comidas saludable");
      int cantComidasSalu = intro.nextInt();

      if (horasDuerme>=7) {
         System.out.println("Usted comple con las horas de sueño");

      } else {
         System.out.println("Usted necesita dormir más");
      }

      if (horasEjercico>=1) {
         System.out.println("Usted hace buena cantidad de ejercicio");

      } else {
         System.out.println("Usted es sedentario");
      }

      if (cantComidasSalu>=2) {
         System.out.println("Usted se alimenta correctamente");

      } else {
         System.out.println("Usted debe modificar la dieta");
      }







   }
}

