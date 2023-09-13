class Birthdays{
    public static void main(String[] args) {
        countTerms();
    }

    // Calculates the amount of terms there are {#565, 20}
    public static void countTerms () {
       
        final int DAYS = 365;
        int days = 365;
        int count = 0; // amount of (n/365)
        int term = 1;
        double sum1 = 1;
        double sum2 = 1;

        for (int i = 0; i < DAYS; i++) {
            double numerator = days - i;
            double fraction = numerator / 365;
            count++;
            numerator = numerator - term;
            sum1 = 1 - fraction;
            sum2 *= fraction;
            System.out.println(fraction + " " + count + " " + sum2);
        }  
    }
}