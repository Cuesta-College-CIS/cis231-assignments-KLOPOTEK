package Final;



    
    public class Course2 implements CourseActivity {

        // Class Properties
        String cid;
        String cname;
        Integer cscore;
        String cgrade;
        Course2(String id, String name, Integer score){
            cid = id;
            cname = name;
            cscore = score;
        }
        // Member Methods
        @Override
        public String decideGrade() {
            if(cscore>=90){
                cgrade = "A";
            }
                else if(cscore>=80){
                    cgrade = "B";
                }
                    else if(cscore>=70){
                        cgrade = "C";
                    }
                        else if(cscore>=60){
                            cgrade = "D";
                        }
                            else{
                                cgrade = "F";
                            }
            return cgrade;
        }
            @Override
            public void printCourseinfo() {
                
                //System.out.println("Course ID     "+cid+"   Name: "+cname+"   Score:  "+cscore+"     Grade   "+cgrade);
            }
        
            public String toString(){
                return "Course ID \t"+cid+"\tName: "+cname+"\tScore:  "+cscore+"\tGrade\t"+decideGrade()+"\n";
                
            }
    
    }

