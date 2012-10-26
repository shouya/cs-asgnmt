

public class SelectionSort {
    public static void main(String[] args) {
	final int ARRAY_LENGTH = 10;
	final int ELEMENT_BOUND = 100;

	int ary[] = new int[ARRAY_LENGTH];

	for (int i = 0; i != ARRAY_LENGTH; ++i)
	    ary[i] = (int)(Math.random() * ELEMENT_BOUND) + 1;


	System.out.println("Before sort:");
	CommonUtils.print_array(ary);

	selection_sort(ary);

	System.out.println("After selection sort sort:");
	CommonUtils.print_array(ary);
    }

    static void selection_sort(int[] array) {
	for (int i = array.length; i != 1; --i) {
	    int max_idx = 0;
	    for (int j = 1; j != i; ++j) {
		if (array[j] > array[max_idx])
		    max_idx = j;
	    }

	    int tmp = array[i - 1];
	    array[i - 1] = array[max_idx];
	    array[max_idx] = tmp;
	}
    }

}

