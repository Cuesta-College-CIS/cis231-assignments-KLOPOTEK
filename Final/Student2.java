package Final;

import java.util.ArrayList;

public class Student2 extends Person {
        Integer sid,credits;
        ArrayList<Course2>clist;
        
        
        Student2(String name, String DOB, Integer id, Integer credit, ArrayList<Course2> list) {
            super(name, DOB);
            sid = id;
            credits = credit;
            clist = list;
        }
        @Override
        public void printPerson() {
            System.out.println("Name:   "+name+"   DOB:   "+DOB);
        }

        public String toString(){
           printPerson();
           return "ID:\t"+ sid +"   Credits:\t"+credits+"\n"+clist;
           
        }
    }

