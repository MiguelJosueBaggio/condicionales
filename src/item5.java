import java.util.Random;
import java.util.Scanner;

public class item5 {

        public static void main(String[] args) {


            //Ejercicio 5: Juego de Piedra, Papel o Tijera
            //Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
            //elige una opción al azar y determina quién gana. Imprime el resultado del jueg


            Scanner intro= new Scanner(System.in);
            System.out.println("Elegir entre piedra, papel o tijera");
            String usuario= intro.next();
            String usuarioMin = usuario.toLowerCase();
            Random random = new Random();

            int maquina = random.nextInt(1,3);
            String opcionMaquina = "";

            switch (maquina) {

                case 1 :

                    opcionMaquina = "piedra";
                    break;


                case 2:
                    opcionMaquina = "papel";
                    break;


                case 3 :

                    opcionMaquina = "tijera";
                    break;


                default:




            }//fin switch

            if ((usuarioMin.equals("tijera") ) || (usuarioMin.equals("piedra") ) || (usuarioMin.equals("papel")  )) {


                if ((opcionMaquina.equals("piedra") ) && (usuarioMin.equals("tijera") ) ) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces gana MAQUINA");




                }
                if ((opcionMaquina.equals("piedra") ) && (usuarioMin.equals("papel") )) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces gana USUARIO");





                }


                if ((opcionMaquina.equals("papel") ) && (usuarioMin.equals("tijera"))) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces gana USUARIO");




                }

                if ((opcionMaquina.equals("papel")) && (usuarioMin.equals("piedra") )) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces gana MAQUINA");




                }


                if ((opcionMaquina.equals("tijera"))  && (usuario.equals("papel")) ) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces gana MAQUINA");




                }

                if ((opcionMaquina.equals("tijera")) && (usuarioMin.equals("piedra") ) ) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces gana USUARIO");






                }

                if (opcionMaquina.equals(usuarioMin)   ) {
                    System.out.println("la maquina es " + opcionMaquina + "y el usuario es " + usuarioMin + " entoces EMPATEEE");




                }




            }//primer if para validar

            else {
                System.out.println("error al cargar");
            }


        }//main




    }
