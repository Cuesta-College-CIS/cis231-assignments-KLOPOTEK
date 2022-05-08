package Quiz4;

import java.util.ArrayList;

public class Student {
    private Integer currentCredits;

	Integer sid;
	String sname;
	ArrayList<Course> clist;
    String studentInfo;

	Student(Integer id, String name, ArrayList<Course> c) {
		sid = id;
		sname = name;
		ArrayList<Course>clist = c;
	}

	public String toString() {
		return "Student: " + sid + " " + sname + clist;
	}

    public Integer getStudentID() {
        return sid;
    }

	public Integer getTotalCredits() {
		for(int i=0; i< clist.size(); ++i){
            currentCredits += clist.get(i).getCredit(); 
        }
        return currentCredits;
	}
}
