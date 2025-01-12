public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hellow, correcto!!");
        //Llamamos a la función
        mostratSaludo("Samuel");
        mostratSaludo("Paco");
        mostratSaludo("Lucia");
        int valor1 = numeroDoble(3);
        int valor2 = numeroDoble(7);
        int valor3 = numeroDoble(5);
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        int numero = recuperarAnyo();
        System.out.println(numero);
        int valor = sumarNumero(3, 8);
        System.out.println("la suma de los números es" + valor);
        comprobarParImpar(3);

        System.out.println(numeroRecibido(-4));
        System.out.println(numeroRecibido(100));
        System.out.println(numeroRecibido(0));


        String textoNumero = "12345";
        //Queremos guardar en un número dicho texto

        int datoNumero = Integer.parseInt(textoNumero);
        System.out.println(datoNumero);
        
        
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

    public static void numeroRecibido2(int numero){
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero == 0) {
            System.out.println("Cero");
        } else {
            System.out.println("Negativo");;
        }
    }

    public static void comprobarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("el número " + numero + " es impar");
        }
    }

    public static int sumarNumero(int num1, int num2){
        return num1 + num2;
    }

    //función con return
    public static int numeroDoble(int numero){
        return numero * 2;
    }
    
    //Metodo void que mueste un saludo
    public static void mostratSaludo(String nombre) {
        //INSTRUCCIONES
        System.out.println("Bienvenido/a a " + nombre);
    }

    //Función con return
    public static int recuperarAnyo() {
        //INSTRUCCIONES
        System.out.println("Me estoy ejecutando");
        return 2025;
    }




}
