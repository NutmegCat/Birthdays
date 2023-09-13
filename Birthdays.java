class Birthdays{
    public static void main(String[] args) {
        countTerms();
    }

    // Calculates the amount of terms there are
    public static void countTerms () {
       
        double dec1 = 0;
        double dec2 = 0;
        double dec3 = 0;
        double dec4 = 0;
        double dec5 = 0;
        double dec6 = 0;
        double dec7 = 0;
        double dec8 = 0;
        double dec9 = 0;
        double dec10 = 0;

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
            // System.out.println(fraction + " " + count + " " + sum1 + " " + sum2);
            
            if (sum1 <= 0.1) {
                dec1 = count;
            } else {
                if (sum1 <= 0.2) {
                    dec2 = count;
                } else {
                    if (sum1 <= 0.3) {
                        dec3 = count;
                    } else {
                        if (sum1 <= 0.4) {
                            dec4 = count;
                        } else {
                            if (sum1 <= 0.5) {
                                dec5 = count;
                            } else {
                                if (sum1 <= 0.6) {
                                    dec6 = count;
                                } else {
                                    if (sum1 <= 0.7) {
                                        dec7 = count;
                                    } else {
                                        if (sum1 <= 0.8) {
                                            dec8 = count;
                                        } else {
                                            if (sum1 <= 0.9) {
                                                dec9 = count;
                                            } else {
                                                if (sum1 <= 0.10) {
                                                    dec10 = count;
                                                } else {
                                                    ;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }  

        System.out.println(dec1 + " " + dec2 + " " + dec3 + " " + dec4 + " " + dec5 + " " + dec6 + " " + dec7 + " " + dec8 + " " + dec9 + " " + dec10);
    }
}