import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        Double pesosColombianos = 0.0;
        int moneda = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la cantidad de Pesos Colombianso a convertir " + pesosColombianos);
        pesosColombianos = sc.nextDouble();
        System.out.println("Digite la moneda a convertir: 1-Dólar");
        System.out.println("Digite la moneda a convertir: 2-Euro");
        System.out.println("Digite la moneda a convertir: 3-Libra");
        System.out.println("Digite la moneda a convertir: 4-Yen");
        System.out.println("Digite la moneda a convertir: 1-Won");
        moneda = sc.nextInt();

        switch (moneda) {
            case 1:
                double dolares = pesosColombianos / 4151;
                System.out.println("El valor en dólares es: " + dolares);
                break;
            case 2:
                double euros = pesosColombianos / 4545;
                System.out.println("El valor en euros es: " + euros);
                break;
            case 3:
                double libras = pesosColombianos / 5307;
                System.out.println("El valor en libras es: " + libras);
                break;
            case 4:
                double Yen = pesosColombianos / 29.6;
                System.out.println("El valor en Yen es: " + Yen);
                break;
            case 5:
                double Won = pesosColombianos / 3.27;
                System.out.println("El valor en Won es: " + Won);
                break;
            default:
        }
    }
}
