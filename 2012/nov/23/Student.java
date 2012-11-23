
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
	this.name = name;
	this.score = score;
    }

    public int get_score() {
	return this.score;
    }
    public String get_name() {
	return this.name;
    }

    public void set_score(int score) {
	this.score = score;
    }
    public void set_name(String name) {
	this.name = name;
    }

    public int spaceship(Student another) {
	if (this.score == another.score)
	    return 0;
	else if (this.score < another.score)
	    return -1;
	else
	    return 1;
    }

    public String inspect() {
	String retval = "";
	retval += "name: " + this.name;
	retval += ", score: " + this.score;
	return retval;
    }

}



