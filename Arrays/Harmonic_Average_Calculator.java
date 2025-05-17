package Arrays;

public class Harmonic_Average_Calculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        double result = calculateHarmonicSeriesAverage(numbers);
        System.out.println("Harmonik Seri Ortalaması: " + result);
    }

    public static double calculateHarmonicSeriesAverage(int[] numbers) {
        double totalHarmonicSum = 0.0;
        
        for (int number : numbers) {
            if (number == 0) {
                System.out.println("Uyarı: Dizide 0 değeri var. Harmonik seri hesaplanamaz.");
                continue;
            }

            double harmonicSeriesOfElement = calculateHarmonicSeries(number);

            totalHarmonicSum += harmonicSeriesOfElement;
        }
        if (numbers.length == 0) {
            return 0.0;
        }
        
        return totalHarmonicSum / numbers.length;
    }
    
    public static double calculateHarmonicSeries(int n) {
        if (n <= 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        return sum;
    }
}