import java.util.Scanner;

class Conversor 
{
    static double celsiusParaFarenheit(double tempC) {
        return tempC*9/5+32;
    } 
    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a temperatura em C: ");
            double tempC = sc.nextDouble();
            System.out.println("Celsius: " + tempC);
            double tempF = celsiusParaFarenheit(tempC);
            System.out.println("Farenheit: " + tempF);
            sc.close();
    } else {
            // for (int i=0; i < args.length; i++) {
            for (String valor: args) {
                double tempC = Double.parseDouble(valor);
                System.out.println("Celsius: " + tempC);
                double tempF = celsiusParaFarenheit(tempC);
                System.out.println("Farenheit: " + tempF);
            }
        }
    }
}