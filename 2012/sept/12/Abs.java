
/**
   Assigment, 12 September, 2012
 */

class Abs {
    public static int abs_clas(int num) {
	return num < 0 ? -num : num;
    }
    public int abs_inst(int num) {
	return Abs.abs_clas(num);
    }
    public static void main(String[] args) {
	final int NUMBER = -10;

	/* Calling abs instance method */
	System.out.println((new Abs()).abs_inst(NUMBER));

	/* Calling abs class method */
	System.out.println(Abs.abs_clas(NUMBER));
    }
}
