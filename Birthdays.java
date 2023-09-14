// Aaron Prince Anu

class Birthdays {
    public static void main(String[] args) {
        calculateAndPrintThresholds();
    }

    public static void calculateAndPrintThresholds() {
        final int DAYS = 365;
        double[] thresholds = { 0.10, 0.20, 0.30, 0.40, 0.50, 0.60, 0.70, 0.80, 0.90, 1.0 };
        int[] requiredPeople = new int[thresholds.length];

        for (int i = 0; i < thresholds.length; i++) {
            int count = 0;
            double probability = 1.0;

            while (probability > 1.0 - thresholds[i]) {
                probability *= (double) (DAYS - count) / DAYS;
                count++;
            }
            requiredPeople[i] = count;
        }

        // Print the results
        for (int i = 0; i < thresholds.length; i++) {
            System.out.println("For threshold " + (thresholds[i] * 100) + "%, " + requiredPeople[i] + " people are required.");
        }
    }
}