package Final;



    public abstract class Person {
        // Member Variables
        String name;
        String DOB;
        // Constructor, and Member methods if needed
        Person(String n, String birthday){
            name = n;
            DOB = birthday;
        }
        abstract void printPerson();
        //public String toString();
       
        
    }

  
    
