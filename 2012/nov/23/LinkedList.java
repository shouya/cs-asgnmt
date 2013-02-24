
class LinkedListNode {
    private Student val;
    private LinkedListNode next, prev;

    public LinkedListNode(Student value,
			  LinkedListNode prev, LinkedListNode next)
    {
	this.val = value;
	this.prev = prev;
	this.next = next;
    }

    public Student value() {
	return this.val;
    }
    public void set_next(LinkedListNode next) {
	this.next = next;
    }
    public void set_prev(LinkedListNode prev) {
	this.prev = prev;
    }
    public LinkedListNode next() {
	return this.next;
    }
    public LinkedListNode prev() {
	return this.prev;
    }
}

public class LinkedList {
    private LinkedListNode head, tail;
    private int length;

    public LinkedList() {
	head = tail = null;
	length = 0;
    }

    public void push_back(Student fucker) {
	LinkedListNode new_node = new LinkedListNode(fucker, this.tail, null);
	if (length == 0)
	    this.head = this.tail = new_node;
	else
	    this.tail.set_next(new_node);
	this.tail = new_node;
	++this.length;
    }
    public void push_front(Student fucker) {
	LinkedListNode new_node = new LinkedListNode(fucker, null, this.head);
	if (length == 0)
	    this.head = this.tail = new_node;
	else
	    this.head.set_prev(new_node);
	this.head = new_node;
	++this.length;
    }

    public Student pop_front() {
	if (this.length < 0)
	    throw new RuntimeException("List is empty.");

	Student retval = this.head.value();
	this.head = this.head.next();
	--this.length;
	return retval;
    }
    public Student pop_back() {
	if (this.length < 0)
	    throw new RuntimeException("List is empty.");

	Student retval = this.tail.value();
	this.tail = this.tail.prev();
	--this.length;
	return retval;
    }
    public Student delete(int index) {
	if (index < 0 || index > this.length - 1)
	    throw new RuntimeException("List out of bound.");
	if (index == 0)
	    return pop_front();
	if (index == length - 1)
	    return pop_back();

	LinkedListNode prev = ref(index - 1), next = ref(index + 1);
	Student retval = prev.next().value();

	prev.set_next(next);
	next.set_prev(prev);

	--this.length;
	return retval;
    }
    public void insert(int index, Student fucker) {
	if (index < 0 || index > this.length)
	    throw new RuntimeException("List out of bound.");
	
	if (index == 0) {
	    push_front(fucker);
	    return;
	}
	if (index == this.length) {
	    push_back(fucker);
	    return;
	}

	LinkedListNode prev = ref(index - 1), next = ref(index);
	LinkedListNode new_node = new LinkedListNode(fucker, prev, next);
	prev.set_next(new_node);
	next.set_prev(new_node);
	++this.length;
    }

    public void bubble_sort() {
	for (LinkedListNode iter = this.tail;
	     iter != null; iter = iter.prev()) {
	    for (LinkedListNode jter = this.head;
		 jter != iter; jter = jter.next()) {
		System.out.println(jter.value().inspect());
		if (jter.value().spaceship(jter.next().value()) == -1)
		    swap_with_next_node(jter);
	    }
	}
    }

    public String inspect() {
	String retval = "List (" + length + ") [\n";
	int i = 0;
	for (LinkedListNode iter = this.head;
	     iter != null; iter = iter.next(), ++i) {
	    retval += "\t[" + i + "] " +
		iter.value().inspect() + ",\n";
	}
	retval += "]";
	return retval;
    }

    private void swap_with_next_node(LinkedListNode node) {
	// BUG HERE, please fix
	LinkedListNode tmp = node.next();

	if (node == this.head)
	    this.head = tmp;
	else
	    node.prev().set_next(tmp);
	tmp.set_prev(node.prev());

	if (tmp == this.tail)
	    this.tail = node;
	else
	    tmp.next().set_prev(node);
	node.set_next(tmp.next());

	tmp.set_next(node);
	node.set_prev(tmp);
    }

    private LinkedListNode ref(int index) {
	LinkedListNode iter = this.head;

	for (int i = index; i != 0; --i) {
	    if (iter.next() == null)
		return null;
	    iter = iter.next();
	}

	return iter;
    }
}