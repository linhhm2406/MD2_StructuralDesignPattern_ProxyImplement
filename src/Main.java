public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1,2);
        System.out.println(result);
    }
}
