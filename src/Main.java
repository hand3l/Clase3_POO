public class Main {
    public static void main(String[] args) {
        // Valores de ejemplo
        double num1 = 5.0;
        double num2 = 3.0;

        // Crear objeto de la clase Operaciones
        Operaciones operaciones = new Operaciones(num1, num2);

        // Mostrar resultados
        System.out.println("Suma: " + operaciones.suma());
        System.out.println("Resta: " + operaciones.resta());
        System.out.println("Multiplicación: " + operaciones.multiplicacion());
        System.out.println("División: " + operaciones.division());
    }
}