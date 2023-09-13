class Birthdays{
    public static void main(String[] args) {
        countTerms();
    }

    // Calculates the amount of terms there are
    public static void countTerms () {
       
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        double number5 = 0;
        double number6 = 0;
        double number7 = 0;
        double number8 = 0;
        double number9 = 0;
        double number10 = 0;

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
                number1 = count;
            } else {
                if (sum1 <= 0.2) {
                    number2 = count;
                } else {
                    if (sum1 <= 0.3) {
                        number3 = count;
                    } else {
                        if (sum1 <= 0.4) {
                            number4 = count;
                        } else {
                            if (sum1 <= 0.5) {
                                number5 = count;
                            } else {
                                if (sum1 <= 0.6) {
                                    number6 = count;
                                } else {
                                    if (sum1 <= 0.7) {
                                        number7 = count;
                                    } else {
                                        if (sum1 <= 0.8) {
                                            number8 = count;
                                        } else {
                                            if (sum1 <= 0.9) {
                                                number9 = count;
                                            } else {
                                                if (sum1 <= 0.10) {
                                                    number10 = count;
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
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7 + " " + number8 + " " + number9 + " " + number10);
    }
}