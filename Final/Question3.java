package Final;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

    public class Question3 {
        public static ArrayList<Student2> fillupStudent() throws FileNotFoundException {
    
        ArrayList<Student2> slist = new ArrayList<Student2>();
		FileInputStream fileByteStream = null;
        Scanner sc = null;
        int sid, credits,coursenum; //int types for student
        String sname,DOB; //String type for student

        int score; //int type for class
        String cname, ctype; // String types for class;

        fileByteStream = new FileInputStream("Final/studentinfo2.txt");
        sc = new Scanner(fileByteStream);

        while (sc.hasNextLine()) {
            sid = sc.nextInt();
            sname = sc.next();
            credits = sc.nextInt();
            DOB = sc.next();
            coursenum = credits/3;
            ArrayList<Course2> cl = new ArrayList<Course2>();
            for (int i = 0; i<coursenum; i++){
                cname = sc.next();
                ctype = sc.next();
                score = sc.nextInt();
                Course2 c = new Course2(cname, ctype, score);
                cl.add(c);

            }
            Student2 s = new Student2(sname, DOB, sid, credits, cl);
            slist.add(s);
        }
        sc.close();
		return slist;
	}
    
        public static void printStudent(ArrayList<Student2> slist) {
            for (int i = 0; i < slist.size(); i++) {
                System.out.println(slist.get(i).toString().replace("[","").replace("]","").replace(",",""));
            }
        }
    
        public static void main(String[] args) throws FileNotFoundException {
            ArrayList<Student2> slist;
    
            slist = fillupStudent();
            printStudent(slist);
            // More code to test the methods in each Class Object
        }
    
    }
    

