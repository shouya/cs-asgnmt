

public class FindFromArrayWithWhile {
    public static void main(String[] args) {
	final int target = 3;
	int arr[] = {1, 2, 3, 4, 5, 6, 7, -1};

	int i = 0;
	while (i != arr.length && target != arr[i++]);

	if (i == arr.length - 1) {
	    System.out.println("Not found.");
	} else {
	    System.out.println("Result index: " + (i - 1));
	}
    }
}

