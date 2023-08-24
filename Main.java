    package org.example;

    import static org.example.ConversionTemperatura.celsiusToFahrenheit;
    import static org.example.ConversionTemperatura.fahrenheitToCelsius;
    import static org.example.EjercicioPromedio.calcularPromedio;

    public class Main {
        public static void main(String[] args) {

            //EJERCICIO 1:
            double temperaturaCelsius1 = 0;
            double temperaturaFahrenheit1 = 32;
            double temperaturaFahrenheit2 = 100;
            double temperaturaCelsius2 = 100;
            double temperaturaCelsius3 = 25;
            double temperaturaCelsius4 = -10;
            double temperaturaFahrenheit3 = -40;

            double fahrenheitConvertido1 = celsiusToFahrenheit(temperaturaCelsius1);
            double celsiusConvertido1 = fahrenheitToCelsius(temperaturaFahrenheit1);
            double celsiusConvertido2 = fahrenheitToCelsius(temperaturaFahrenheit2);
            double fahrenheitConvertido2 = celsiusToFahrenheit(temperaturaCelsius2);
            double fahrenheitConvertido3 = celsiusToFahrenheit(temperaturaCelsius3);
            double fahrenheitConvertido4 = celsiusToFahrenheit(temperaturaCelsius4);
            double celsiusConvertido3 = fahrenheitToCelsius(temperaturaFahrenheit3);

            System.out.println("\nSOLUCIÓN EJERCICIO 1:");
            System.out.println(temperaturaCelsius1 + "C = " + fahrenheitConvertido1 + "F");
            System.out.println(temperaturaFahrenheit1 + "F = " + celsiusConvertido1 + "C");
            System.out.println(temperaturaFahrenheit2 + "F = " + celsiusConvertido2 + "C");
            System.out.println(temperaturaCelsius2 + "C = " + fahrenheitConvertido2 + "F");
            System.out.println(temperaturaCelsius3 + "C = " + fahrenheitConvertido3 + "F");
            System.out.println(temperaturaCelsius4 + "C = " + fahrenheitConvertido4 + "F");
            System.out.println(temperaturaFahrenheit3 + "F = " + celsiusConvertido3 + "C");

            //FIN EJERCICIO 1 -------------------------------------------------------------

            //EJERCICIO 2:
            double[] numeros = { 40, 50, 60, 24, 66, 12, 98 };
            double promedio = calcularPromedio(numeros);
            System.out.println("\n\nSOLUCIÓN EJERCICIO 2:");
            System.out.println("El promedio es: " + promedio);

            for (double numero : numeros) {
                if (numero > promedio) {
                    System.out.println(numero + " está por encima del promedio.");
                } else if (numero < promedio) {
                    System.out.println(numero + " está por debajo del promedio.");
                } else {
                    System.out.println(numero + " es igual al promedio.");
                }
            }

            //FIN EJERCICIO 2 -------------------------------------------------------------
        }

    }
