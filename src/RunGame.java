import java.util.Scanner;

public class RunGame {
    public static void main(String [] args){
        // se eligen los personajes
        Scanner scanner = new Scanner(System.in);
        Character jugador1;
        Weapon armaSeleccionada;

        System.out.println("----- Bienvenido a MagicWar-----");
        System.out.println("+++++ Elige  Tu Personaje +++++");
        System.out.println("------ Jugador 1 ------");


        // me toco colocar un condicional para que no acepte el nombre en blanco
        String name1;
        do {
            System.out.println("Escribe el Nombre");
            name1 = scanner.nextLine();
            if (name1.trim().isEmpty()){
                System.out.println(" El nombre no puede ir vacio, porfavor digite un nombre");
            }
        }while(name1.trim().isEmpty());

        // elegir arma
        System.out.println("+++++ Elige Tu Arma +++++");
        System.out.println("1. Baculo");
        System.out.println("2. Daga.");
        System.out.println("3. Extensor de Garras");
        int opcionWeapon = scanner.nextInt();
        scanner.nextLine();// limpiar bufer

        // elegir clase
        System.out.println("***** Elige La Clase *****");
        System.out.println("1. Mago.");
        System.out.println("2. Vampiro");
        System.out.println("3. Hombre Lobo");
        int opcionClass = scanner.nextInt();
        scanner.nextLine(); //limpiar bufer



        //asignar arma
        switch (opcionWeapon){
            case 1 :
                armaSeleccionada = new Baculo();
                break;
            case 2 :
                armaSeleccionada = new Daga();
                break;
            case 3 :
                armaSeleccionada = new ExtensorGarras();
                break;
            default:
                System.out.println("Opcion invalida, no se equipa arma:");
                armaSeleccionada = new Baculo();
        }
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

        // se mmuestra el personaje creado

        System.out.println("+*+*+* Personaje Elejido +*+*+*");
        System.out.println("Nombre: " + jugador1.getName());
        System.out.println("Clase: " + jugador1.getCharacterClass());
        System.out.println("Arma: " + jugador1.getWeapon());
        System.out.println("--------------------------------------------");

        // jugador dos

        Character jugador2;
        Weapon armaSeleccionada2;

        System.out.println("----- Bienvenido a MagicWar-----");
        System.out.println("+++++ Elige  Tu Personaje +++++");
        System.out.println("------ Jugador 2 ------");

        String name2;
        do {
            System.out.println("Escribe el Nombre");
            name2 = scanner.nextLine();
            if (name2.trim().isEmpty()){
                System.out.println(" El nombre no puede ir vacio, porfavor digite un nombre");
            }
        }while(name2.trim().isEmpty());

        // elegir arma
        System.out.println("+++++ Elige Tu Arma +++++");
        System.out.println("1. Baculo");
        System.out.println("2. Daga.");
        System.out.println("3. Extensor de Garras");
        int opcionWeapon2 = scanner.nextInt();

        // elegir clase
        System.out.println("***** Elige La Clase *****");
        System.out.println("1. Mago.");
        System.out.println("2. Vampiro");
        System.out.println("3. Hombre Lobo");
        int opcionClass2 = scanner.nextInt();


        //asignar arma
        switch (opcionWeapon2){
            case 1 :
                armaSeleccionada2 = new Baculo();
                break;
            case 2 :
                armaSeleccionada2 = new Daga();
                break;
            case 3 :
                armaSeleccionada2 = new ExtensorGarras();
                break;
            default:
                System.out.println("Opcion invalida, no se equipa arma:");
                armaSeleccionada2 = null;
        }


        // Asignar clase
        switch (opcionClass2){
            case 1:
                jugador2 = new Mago(name2,100, armaSeleccionada2);
                break;
            case 2:
                jugador2 = new Vampiro(name2,100, armaSeleccionada2);
                break;
            case 3:
                jugador2 = new HombreLobo(name2,100, armaSeleccionada2);
                break;
            default:
                System.out.println("opcion incorrecta, se asigna por defecto un Mago");
                jugador2 = new Mago(name2,100, armaSeleccionada2);
        }



        // se mmuestra el personaje creado

        System.out.println("+*+*+* Personaje Elejido +*+*+*");
        System.out.println("Nombre: " + jugador2.getName());
        System.out.println("Clase: " + jugador2.getCharacterClass());
        System.out.println("Arma: " + jugador2.getWeapon());
        System.out.println("--------------------------------------------");

        // se llama al metodo controlador en este caso startFight
        FightingGame runGame = new FightingGame(jugador1,jugador2);
        runGame.startFight();



    }
}
