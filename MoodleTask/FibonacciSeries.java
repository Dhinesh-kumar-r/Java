package MoodleTask;

public class FibonacciSeries {
    public static void main(String args[]) {
        int SeriesOfNo = 15, no1 = 0, no2 = 1;

        System.out.println("Fibonacci Series of " + SeriesOfNo + " terms:");

        for (int i = 0; i < SeriesOfNo; i++) {
            if (i <= 15) {
                int total = no1 + no2;
                no1 = no2;
                no2 = total;

                System.out.println(total);
            }
       }
    	
    

    }
}
