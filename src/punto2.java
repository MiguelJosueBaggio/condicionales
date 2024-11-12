import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class punto2 {
    public static void main(String[] args) {

        // Ejercicio 2: Calculadora de Descuentos
        //Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
        //(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
        //15% para jubilados. Imprime el precio final después del descuento.

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese precio del producto");
        double precio = ingreso.nextDouble();
        System.out.println("Categoria: \n" + "Estudiante\n" + "Adulto\n" + "Jubilado\n");
        System.out.println("Ingrese la categoria");
        String categoria = ingreso.next();
        String categoriamin = categoria.toLowerCase();
        boolean error = false;
        double total = 0;
        switch (categoriamin) {

            case "estudiante":
                total = precio-(precio*10)/100;

                break;
            case "adulto":
                total = precio-(precio*5)/100;

                break;

            case "jubilado":
                total= precio-(precio*15)/100;

                break;

            default:
                error=true;
                break;




        }//cierre switch

        if (error == false){
            System.out.println("El precio total es de: " + total);
        } else {
            System.out.println("datos mal cargado");

        }

    }//main
}//class

