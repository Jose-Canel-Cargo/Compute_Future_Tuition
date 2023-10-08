public class ComputeFutureTuition {
    public static void main(String[] args) throws Exception {
        final double tuitionPercentage = 0.05;
        float tuitionIncrease;
        float fourYearTuition = 10000;
        float tuition = 10000;
        int count = 0;
        int year = 1;


        System.out.println("Year     Tuition\n" + year + "         " + tuition);
        year++;

        while (count < 4){
            tuitionIncrease = (float) (tuitionPercentage * tuition);
            tuition = tuition + tuitionIncrease;
            System.out.printf(year + "         " + tuition + "\n");
            count++;
            year++;
            fourYearTuition = fourYearTuition + tuition;

        }

        while (count < 9){
            tuitionIncrease = (float) (tuitionPercentage * tuition);
            tuition = tuition + tuitionIncrease;
            System.out.printf(year + "         " + tuition + "\n");
            count++;
            year++;
        }

        System.out.println("\nFour years of tuition is: $" + fourYearTuition  + "\n");
        
    }
}
