import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = input.nextDouble();
        
        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Conversão para Kelvin
        double kelvin = celsius + 273.15;
        
        // Exibe os resultados
        System.out.println("\nResultados da conversão:");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        
        input.close();
    }
}