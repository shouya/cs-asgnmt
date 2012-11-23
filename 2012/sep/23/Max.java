/*
  Find maximum number in an array with traveling through all element and
  remain the larger one to the right.

  Then the rightest element will be the one maximum.
 */


class Max {
    public static void main(String[] args) {
	final int array_length = 10;
	int[] array = new int[array_length];

	System.out.print("array = [");
	for (int i = 0; i != array_length; ++i) {
	    array[i] = (int)(Math.random() * 100);
	    System.out.print(array[i]);
	    if (i != array_length - 1)
		System.out.print(", ");
	}
	System.out.println("]");

	for (int i = 0; i != array_length - 1; ++i) {
	    if (array[i] > array[i + 1]) {
		int tmp = array[i + 1];
		array[i + 1] = array[i];
		array[i] = tmp;
	    }
	}

	System.out.println("Max: " + array[array_length - 1]);
    }
}




