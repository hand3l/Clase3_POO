import static java.lang.Math.*;

public class Operaciones {
    private double num1;
    private double num2;

    // Constructor
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Operaciones básicas
    public double suma() {
        return num1 + num2;
    }

    public double resta() {
        return num1 - num2;
    }

    public double multiplicacion() {
        return num1 * num2;
    }

    public double division() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

}