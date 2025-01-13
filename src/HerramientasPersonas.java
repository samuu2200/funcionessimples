public class HerramientasPersonas {

    public static String getLetraNIF(int numeroDni) {
       
        int resultado = (numeroDni - ((numeroDni / 23) * 23));
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = secuencia.charAt(resultado);
        String letraConvertida = String.valueOf(letra);

        return letraConvertida;
    }

    //Quisiera un metodo que reciba un NIF/DINI
    //Y nos devuelva si es valido o no
    public static boolean validarNIF(String nif) {
        char ultimaLetra = nif.charAt(nif.length() -1);
        String numeros = nif.substring(0, 8);
        System.out.println(numeros);
        System.out.println(ultimaLetra); 

        //Necesitamos convertir los tipos
        int numerDni = Integer.parseInt(numeros);
        //Convertimos la letra a String para comparar
        String letraComparacion = String.valueOf(ultimaLetra);
        //Llamamos al metodo que nos devuelve una letra
        String resultado = getLetraNIF(numerDni);
        return resultado.equals(letraComparacion);
    }

    
}
