

public class CommonUtils {
    public static void print_array(int[] array) {
	System.out.print('[');
	for (int i = 0; i != array.length; ++i) {
	    System.out.print(array[i]);
	    if (i != array.length - 1)
		System.out.print(", ");
	}
	System.out.println(']');
    }
}


