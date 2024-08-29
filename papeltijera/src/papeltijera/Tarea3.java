//se cambio el packege y class por el nombre del nuestro
package papeltijera;
//lee la entrada del usuario
import java.util.Scanner;
public class Tarea3 {
 
	  public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar la entrada del jugador 1
	        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	        String j1 = scanner.nextLine().trim();//Utilicé .trim() para eliminar espacios adicionales en las entradas de los jugadores.


	        // Solicitar la entrada del jugador 2
	        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	        String j2 = scanner.nextLine().trim();

	        // Determinar el ganador y mostrar el resultado
	        int winner = determineWinner(j1, j2);
	        System.out.println("Gana el jugador " + winner);

	        // Cerrar el scanner
	        scanner.close();
	    }
	  
// Función para determinar el ganador del juego
public static int determineWinner(String j1, String j2) {
 // para comparar el contenido de dos cadenas, se debe usar el método .equals() en lugar de ==. == compara referencias, no el contenido.
	if (j1.equals(j2)) {
        return 0; // Empate
    }

    switch (j1) {
        case "piedra":
            if (j2.equals("tijeras")) {
                return 1; // Jugador 1 gana
            }
            break;
        case "papel":
            if (j2.equals("piedra")) {
                return 1; // Jugador 1 gana
            }
            break;
        case "tijeras":
            if (j2.equals("papel")) {
                return 1; // Jugador 1 gana
            }
            break;
            //Añadí break al final de cada case
        default:
            System.out.println("Entrada inválida para el jugador 1.");
            return -1; // Entrada inválida
    }

    return 2; // Jugador 2 gana si ninguna condición de victoria para el jugador 1 se cumple
}
}