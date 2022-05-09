

public class Course {

	String 	cid;
	String 	cname;
	Integer credit;
	String 	grade;

	Course(String id, String name, Integer c, String g) {
		cid = id;
        cname = name;
        credit = c;
        grade = g;
	}

    public Integer getCredit() {
        return credit;
    }

	public String toString() {
		return "\tCourse: " + cid +" "+ cname +" "+ credit +" "+ grade + "\n";
	}

}
