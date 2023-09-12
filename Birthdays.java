class Birthdays{
    public static void main(String[] args) {

        countTerms();
    }



    // Calculates the amount of terms there are {#565, 12}
    public static void countTerms () {
       
        final int DAYS = 365;
        int days = 365;
        int terms = 0; // amount of (n/365)

        for (int i = 0; i < DAYS; i++) {
            int numerator = DAYS - i;
            terms++;
            days--;
        }
    }
}