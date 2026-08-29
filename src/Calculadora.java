public class Calculadora {
    public void sumar(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("RESULTADO SUMA: " + resultado);
    }

    public void restar(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("RESULTADO RESTA: " + resultado);
    }

    public void dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("RESULTADO DIVISION: NO SE PUEDE DIVIDIR ENTRE 0");
        }
        else {
            double resultado = num1 / num2;
            System.out.println("RESULTADO DIVISION: " + resultado);
        }            
    }
}
