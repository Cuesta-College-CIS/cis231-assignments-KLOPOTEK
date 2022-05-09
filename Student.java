

import java.util.ArrayList;

public class Student {
    private int currentCredits;

	Integer sid;
	String sname;
	ArrayList<Course> clist;
    String studentInfo;

	Student(Integer id, String name, ArrayList<Course> c) {
		sid = id;
		sname = name;
		clist = c;
	}

	public String toString() {
		return "Student: " + sid + " " + sname +"\n"+ clist;
	}

    public Integer getStudentID() {
        return sid;
    }

	public Integer getTotalCredits() {
		currentCredits = 0;
		for(int i=0; i< clist.size(); ++i){
            currentCredits += clist.get(i).getCredit(); 
        }
        return currentCredits;
	}
}
