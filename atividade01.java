import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8]; // Array para armazenar as 8 notas
        double mediaFinal;
        
        // Recebendo as notas do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i+1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }
        
        // Calculando médias bimestrais (já são as notas digitadas)
        double media1B = notas[0];
        double media2B = notas[1];
        double media3B = notas[2];
        double media4B = notas[3];
        double media5B = notas[4];
        double media6B = notas[5];
        double media7B = notas[6];
        double media8B = notas[7];
        
        // Calculando médias semestrais
        double media1Sem = (media1B + media2B) / 2;
        double media2Sem = (media3B + media4B) / 2;
        double media3Sem = (media5B + media6B) / 2;
        double media4Sem = (media7B + media8B) / 2;
        
        // Calculando a média final
        mediaFinal = (media1Sem + media2Sem + media3Sem + media4Sem) / 4;
        
        // Exibindo resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("1º Bimestre: " + media1B);
        System.out.println("2º Bimestre: " + media2B);
        System.out.println("1º Semestre: " + media1Sem);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + media3B);
        System.out.println("4º Bimestre: " + media4B);
        System.out.println("2º Semestre: " + media2Sem);
        System.out.println("----------------------");
        System.out.println("5º Bimestre: " + media5B);
        System.out.println("6º Bimestre: " + media6B);
        System.out.println("3º Semestre: " + media3Sem);
        System.out.println("----------------------");
        System.out.println("7º Bimestre: " + media7B);
        System.out.println("8º Bimestre: " + media8B);
        System.out.println("4º Semestre: " + media4Sem);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);
        
        sc.close();
    }
}
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
