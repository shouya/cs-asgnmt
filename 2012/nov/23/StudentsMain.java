


public class StudentsMain {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();

	list.push_back(new Student("Rixer", 321));
	list.push_back(new Student("Rix", 123));

	list.bubble_sort();

	System.out.println(list.inspect());
    }
}

