package kz.kaznu.amir.SRS1;

public class MainApplication {
    public static double[] leastSquares(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }
        double a = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double b = (sumY - a * sumX) / n;
        return new double[] {a, b};

    }
    public static void main(String[] args) {
        double[] x = {1804, 1924, 1960, 1974, 1987, 1999, 2011, 2022};
        double[] y = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        double[] coefficients = leastSquares(x, y);
        double a = coefficients[0];
        double b = coefficients [1];
        System.out.println("Коэффициент а = " +a + " " +"Коэффициент б = " +b);
        double predict = a * 2100 + b;
        System.out.println(predict);
    }
}
