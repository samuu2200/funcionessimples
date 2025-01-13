import java.util.Scanner;

public class EjecucionNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Pedimos al usuario el número 1
        System.out.println("Introduzca el número 1");
        String entrada = scan.nextLine();
        int num1 = Integer.parseInt(entrada);

        // Pedimos al usuario el número 2
        System.out.println("Introduzca el número 2");
        entrada = scan.nextLine();
        int num2 = Integer.parseInt(entrada);

        // Verificamos cual es el número mayor
        int mayor = EvaluacionNumeros.mayorDosNumero(num1, num2);
        int menor = EvaluacionNumeros.menorDosNumero(num1, num2);

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        // Pedimos al usuario el número 3
        System.out.println("Introduzca el número 3");
        entrada = scan.nextLine();
        int num3 = Integer.parseInt(entrada);
        EvaluacionNumeros.evaluarTresNumeros(num1, num2, num3);

        scan.close();

    }

}
