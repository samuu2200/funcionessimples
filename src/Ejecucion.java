import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Mensajes para pedir números
        System.out.println("Introduzca número 1");
        //Almacenamos el dato que ha escrito el usuario
        String entrada = scan.nextLine();
        //Almacenamos el número 1
        int num1 = Integer.parseInt(entrada);

        System.out.println("Introduzca el número 2");
        entrada = scan.nextLine();
        //Almacenamos el número 2
        int num2 = Integer.parseInt(entrada);
        //Creamos un menú para las opciones del usuario
        Calculadora.mostrarMenu();
        //Primero capturammos lo que ha escrito el usuario
        entrada = scan.nextLine();

        //Capturamos la opción seleccionada
        int opcion = Integer.parseInt(entrada);
        int resultado = 0;
        if (opcion == 1) {
            resultado = Calculadora.sumarNumeros(num1, num2);
        } else if (opcion == 2) {
            resultado = Calculadora.restarNumeros(num1, num2);
        } else if (opcion == 3) {
            resultado = Calculadora.multiplicarNumeros(num1, num2);
        } else if (opcion == 4) {
            resultado = Calculadora.dividirNumeros(num1, num2);
        }

        System.out.println("Resultado: " + resultado);
        
        scan.close();
    }

}
