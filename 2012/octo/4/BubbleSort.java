
/* import CommonUtils.*; */


public class BubbleSort {
    public static void main(String[] args) {
	final int ARRAY_LENGTH = 10;
	final int ELEMENT_BOUND = 100;

	int ary[] = new int[ARRAY_LENGTH];

	for (int i = 0; i != ARRAY_LENGTH; ++i)
	    ary[i] = (int)(Math.random() * ELEMENT_BOUND) + 1;

	System.out.println("Before sort:");
	CommonUtils.print_array(ary);

	bubble_sort(ary);

	System.out.println("After bubble sort:");
	CommonUtils.print_array(ary);
    }

    static void bubble_sort(int[] array) {
	for (int i = array.length - 1; i != 0; --i) {
	    for (int j = 0; j != i; ++j) {
		if (array[j] > array[j + 1]) {
		    int tmp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = tmp;
		}
	    }
	}
    }

}
