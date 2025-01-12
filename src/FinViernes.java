import java.util.Scanner;
public class FinViernes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número");
        //Capturamos el string númerico que el usuario ha introducido
        String dato = scan.nextLine();
        //convertimos el texto a número
        int numero = Integer.parseInt(dato);
        //llamamos a evaluar
        String respuesta = numeroRecibido(numero);
        System.out.println(respuesta);
            
        scan.close();
    }

    public static String numeroRecibido(int numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero == 0) {
            return "Cero";
        } else {
            return "Negativo";
        }
    }

}
