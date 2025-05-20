import java.util.Scanner;

public class RunGame {
    public static void main(String [] args){
        // se eligen los personajes
        Scanner scanner = new Scanner(System.in);
        Character jugador1= null;
        Weapon armaSeleccionada = null;

        System.out.println("----- Bienvenido a MagicWar-----");
        System.out.println("+++++ Elige  Tu Personaje +++++");

        System.out.println("Escribe el Nombre");
        String name1 = scanner.nextLine();

        // elegir clase
        System.out.println("***** Elige La Clase *****");
        System.out.println("1. Mago.");
        System.out.println("2. Vampiro");
        System.out.println("3. Hombre Lobo");
        int opcionClass = scanner.nextInt();

        // elegir arma
        System.out.println("+++++ Elige Tu Arma +++++");
        System.out.println("1. Baculo");
        System.out.println("2. Daga.");
        System.out.println("3. Extensor de Garras");
        int opcionWeapon = scanner.nextInt();

        // Asignar clase
        switch (opcionClass){
            case 1:
                jugador1 = new Mago(name1,100,armaSeleccionada);
                break;
            case 2:
                jugador1 = new Vampiro(name1,100,armaSeleccionada);
                break;
            case 3:
                jugador1 = new HombreLobo(name1,100,armaSeleccionada);
                break;
            default:
                System.out.println("opcion incorrecta, se asigna por defecto un Mago");
                jugador1 = new Mago(name1,100,armaSeleccionada);
        }

        //asignar arma
        switch (opcionWeapon){
            case 1 :
                armaSeleccionada = new Baculo();
        }





    }
}
