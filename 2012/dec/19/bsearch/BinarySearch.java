
public class BinarySearch {
    public static void main(String[] args) {
	/*                   0  1  2  3  4   5   6   7   8   9   */
	final int array[] = {1, 2, 5, 9, 20, 43, 59, 67, 89, 92};
	final int target = Integer.parseInt(args[0]);
	int result;

	result = binary_search(array, array.length, target);

	if (result == -1) {
	    System.out.println("The fucker is not been found.");
	} else {
	    System.out.println("Got you fucker at " + result + ".");
	}

    }

    public static int binary_search(final int array[],
				    int length,
				    int target) {
	int left = 0, right = length;
	int middle = -1;

	while (left <= right) {
	    middle = (left + right) / 2;

	    if (middle >= length)
		break;

	    System.out.println("" + middle + ", " + left + ", " + right);
	    if (array[middle] < target) {
		left = middle + 1;
	    } else if (array[middle] > target) {
		right = middle - 1;
	    } else {
		return middle;
	    }
	}
	return -1;
    }
}


// I am feeling lucky.
