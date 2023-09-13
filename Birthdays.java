class Birthdays {
    public static void main(String[] args) {
        int[] n = new int[60];
        double[] p = new double[60];

        for (int i = 1; i <= 60; i++) {
            double q = 1.0;
            for (int j = 0; j < i; j++) {
                q *= 1 - (double) j / 365;
            }
            p[i - 1] = 1 - q;
        }

        // Print the result
        for (int i = 0; i < 60; i++) {
            System.out.println("p[" + i + "] = " + p[i]);
        }
    }
}