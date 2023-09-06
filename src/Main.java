
public class Main {
    public static void main(String[] args) {
        MathCaculatorProxy proxy = new MathCaculatorProxy();
        double result = proxy.add(1,2);
        System.out.println("1 + 2 = " + result);
        result = proxy.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.MAX_VALUE = " + result);
    }
}