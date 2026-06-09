package Cinema;

import Cinema.Services.ManageClients;

import java.util.Scanner;

public class MainApp {
        public static void main(String[] args) {
            // Menú
            Scanner input = new Scanner(System.in);
            var CallManage = new ManageClients();

            int option;
            do{
                System.out.println("""
                    ### Sistema de cine ###
                    1. Registrar cliente
                    2. Registrar pelicula
                    3. Mostrar cliente
                    4. Mostrar pelicula
                    5. Salir""");
                System.out.print("Seleccione una opción: ");
                option = input.nextInt();
                switch(option){
                    case 1:
                        System.out.print("Nombre: ");
                        String name = input.nextLine();
                        CallManage.AddClients(name);
                        break;
                    case 2:
                        System.out.println("Registrar peliculas");
                        break;
                    case 3:
                        System.out.println("Mostrar clientes");
                        CallManage.ShowClients();
                        break;
                    case 4:
                        System.out.println("Mostrar pelicula");
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            } while(option != 5);
        }
}

