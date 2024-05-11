import java.util.*;
public class Main {
    public static void main(String[] args) {
        ConsultaDeCambio consulta = new ConsultaDeCambio();
        TipoDeMonedas monedas = consulta.ingresarMoneda("USD");
        int opcion = 0;
        String menu = """
                *******************************************************************************************
                Bienvenido a la calculadora de cambio de divisas. Por favor, elige el tipo de moneda que deseas convertir:
                1. Dolares =>> Pesos Argentinos
                2. Pesos Argentinos =>> Dolares
                3. Dolares =>> Real
                4. Real =>> Dolares
                5. Dolares =>> Peso Colombiano
                6. Peso Colombiano =>> Dolares
                7. Salir
                *******************************************************************************************
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            System.out.println("Por favor, elige una de las opciones: ");
            opcion = teclado.nextInt();
            if(opcion == 1){
                System.out.println("Por favor, introduce la cantidad de dolares que deseas convertir: ");
                int dolares = teclado.nextInt();


                System.out.println("Dolares =>> Pesos Argentinos: " + dolares * monedas.ARS());
            }

        }
    }
}