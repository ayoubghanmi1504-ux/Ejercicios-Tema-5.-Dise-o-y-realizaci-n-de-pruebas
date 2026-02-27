import java.util.*;

public class prueba {
    static int precioBase;
    static int descuento;
    static boolean correcto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        correcto = false;

        do {
            try {
                System.out.print("introduce el precio base: ");
                precioBase = sc.nextInt();

                System.out.print("introduce el descuento: ");
                descuento = sc.nextInt();

                System.out.println("precio final: " + calcularPrecioFinal(precioBase, descuento));
            // si es correcto seguira funcionando normal
                correcto = true;

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());
                System.out.println("Vuelve a introducir los datos.\n");
            }

        } while (!correcto);
    }
    public static int calcularPrecioFinal(int precioBase, int descuento) {
        if (precioBase < 0 || descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("Valores fuera de rango");
        }
        return precioBase - (precioBase * descuento / 100);
    }
}
