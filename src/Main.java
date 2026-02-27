void main() {
    int precioBase=100;
    int  descuento=110;
    System.out.println(calcularPrecioFinal(precioBase,descuento));
}

// ejercicio 3
public static int calcularPrecioFinal(int precioBase, int descuento) {
    if (precioBase < 0 || descuento < 0 || descuento > 100) {
        throw new IllegalArgumentException("Valores fuera de rango");
    }
    return precioBase - (precioBase * descuento / 100);
}
// ejercicio 5
public static int maximo(int[] datos) {

    // Comprobar si el array es null
    if (datos == null) {
        throw new IllegalArgumentException("El array no puede ser null");
    }

    // Comprobar si está vacío
    if (datos.length == 0) {
        throw new IllegalArgumentException("El array no puede estar vacio");
    }

    // Inicializar el máximo con el primer elemento
    int max = datos[0];

    // Recorrer desde la posición 1
    for (int i = 1; i < datos.length; i++) {
        if (datos[i] > max) {
            max = datos[i];
        }
    }

    return max;
}