

public class ForTest {
    public static void main(String[] args) {
	/*
	  Result:
	  |  *
	  | ***
	  |*****
	  | ***
	  |  *
	 */

	final int line_count = 7; /* could be any odd number */
	int star_count = 1, space_count = (line_count-1)/2;

	for (int i = 0; i != line_count; ++i) {
	    for (int j = 0; j != space_count; ++j)
		System.out.print(" ");
	    for (int j = 0; j != star_count; ++j)
		System.out.print("*");

	    if (i < (line_count-1)/2) {
		--space_count;
		star_count += 2;
	    } else {
		++space_count;
		star_count -= 2;
	    }
	    System.out.println();
	}
	
    }
}


