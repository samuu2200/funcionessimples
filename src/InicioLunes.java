import java.util.Scanner;

public class InicioLunes {

    public static void main(String[] args) {

        // Creamos un teclado para pedir datos al usaurio
        Scanner scan = new Scanner(System.in);

        // Mostramos un mensaje al usuario para pedir un número
        System.out.println("Introduce un número");
        // Capturamos lo que el usuario ha escrito en su texto
        String entrada = scan.nextLine();
        // Declaramos un número y guardamos en su interior el valor que el usuario ha
        // escrito (entrada)
        // "12345" Integer.parse...
        int numero = Integer.parseInt(entrada);

        String respuesta = evaluarNumero(numero);
        System.out.println(respuesta);
        
        scan.close();
    }

    // Vamos a crear una función que recibirá un número y nos delvoverá un texto:
    // POSITIVO, NEGATIVO O CERO
    public static String evaluarNumero(int num) {
        if (num > 0) {
            return "POSITIVO";
        } else if (num == 0) {
            return "CERO";
        } else {
            return "NEGATIVO";
        }
    }

}
