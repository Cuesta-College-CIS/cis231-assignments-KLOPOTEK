package Quiz4;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Quiz4 {

	public static ArrayList<Student> fillupStudent() throws FileNotFoundException,IOException{

		ArrayList<Student> slist = new ArrayList<Student>();
		FileInputStream fileByteStream = null;
        Scanner sc = null;
        int sid, coursenum; //int types for student
        String sname; //String type for student

        int credit; //int type for class
        String cid, cname, grade; // String types for class;

        fileByteStream = new FileInputStream("studentinfo.txt");
        sc = new Scanner(fileByteStream);

        while (sc.hasNextLine()) {
            sid = sc.nextInt();
            sname = sc.next();
            coursenum = sc.nextInt();
            ArrayList<Course> cl = new ArrayList<Course>();
            for (int i = 0; i<coursenum; i++){
                cid = sc.next();
                cname = sc.next();
                credit = sc.nextInt();
                grade = sc.next();
                Course c = new Course(cid, cname, credit, grade);
                cl.add(c);

            }
            Student s = new Student(sid, sname, cl);
            slist.add(s);
        }
        sc.close();
		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		for(int i=0; i<slist.size(); i++){
            System.out.println(slist.get(i).toString());
            
        }
	}

	public static void printStudent(ArrayList<Student> slist, Integer id) {
		Integer callID = id, loopID;
        for(int i=0; i<slist.size(); i++){
            loopID = slist.get(i).getStudentID();
            if(loopID == callID){
                System.out.println(slist.get(i).toString());
            }
        }
			}

	public static Integer findStudent(ArrayList<Student> slist) {
        Integer mostCredits = 0, currentCredits = 0, mostCreditID = 0;
		for(int i=0; i<slist.size(); ++i){
            currentCredits = slist.get(i).getTotalCredits();
            if(currentCredits>mostCredits){
                mostCredits = currentCredits;
                mostCreditID = slist.get(i).getStudentID();
            }
        }
        return mostCreditID;
	}

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Integer sid;
		ArrayList<Student> slist;

		slist = fillupStudent();
		printStudent(slist);
		sid = findStudent(slist);
		
		printStudent(slist, sid);
    }
}