package series.com;

public class pyramidpattern {
	public static void main(String[] args) {
		        int rows = 5; // Total number of rows

		        for (int i = 1; i <= rows; i++) {
		            // Print spaces
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }

		            // Print stars (2*i - 1 stars per row)
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }

		            // Move to the next line
		            System.out.println();
		        }
		    }

	}

