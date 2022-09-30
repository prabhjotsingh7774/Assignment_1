package Assignment1;

public class Sol1 {

	    public static void printShape(int row, char symbol)
	    {
	        // printing current row then calling for recursion
	        for(int i=0; i<row; i++)
	        {
	            System.out.print(symbol + " ");
	        }
	        System.out.println();
	        if(row > 1)
	            printShape(row-1, symbol);
	    }

	public static void main(String[] args) {
		printShape(5, '@');
		
	}

}
