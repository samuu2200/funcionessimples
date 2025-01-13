import java.util.Scanner;

public class EjecucionPersonas {

    public static void main(String[] args) {       
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el número del DNI");
        String entrada = scan.nextLine();
        //Recuperamos el numero de dni
        int numeroDni = Integer.parseInt(entrada);

        String letra = HerramientasPersonas.getLetraNIF(numeroDni);
        System.out.println("Su letra de NIF es " + letra);
        System.out.println("Introduzca un DNI completo");
        String dni = scan.nextLine();

        boolean respuesta = HerramientasPersonas.validarNIF(dni);
        System.out.println("El dni " + dni + " es correcto: " + respuesta);

        scan.close();
    }

}
