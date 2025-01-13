public class Calculadora {
    // Esta clase es una herramienta
    // Por si misma no sirve de nada
    // Tendrá un método para hacer operaciones matemáticas
    public static void mostrarMenu() {
        // Creamos un menú para las opciones del usuario
        System.out.println("----------");
        System.out.println("Selecciona una opción");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
    }

    public static int sumarNumeros(int num1, int num2) {
        int operacion = num1 + num2;
        return operacion;
    }

    public static int restarNumeros(int num1, int num2) {
        int operacion = num1 - num2;
        return operacion;
    }

    public static int multiplicarNumeros(int num1, int num2) {
        int operacion = num1 * num2;
        return operacion;
    }

    public static int dividirNumeros(int num1, int num2) {
        int operacion = num1 / num2;
        return operacion;
    }

}
