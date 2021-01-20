public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        int counter=0;
        double sum = 0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                sum = sum+mat[i][j];
                counter++;
            }
        }
        return sum/counter;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // Create a counter that adds up the total number of items in array (similar to above)
        // Divide that by 2 because the halfway point is the median
        // How do I know what row and column that halfway point is? Can I use getValue() method?
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // I think a counter would be useful here but how do I create seperate counters for each unique number?
        // I could use these counters to then say that the counter with the highest value is the mode.. 
        // or rather the number which cause the counter to increase is the mode
        
    }


    public static void main(String[] args) {
        System.out.println(mean(double[][]mat));
    }
}
