package Labs_71_74;

public class Assignment_7_4_2 {
        private int num;
        private String s;
        public void Number(int n) {
           num = n;
        }
     
        public String toString(){
           
           s="The value is "+Integer.toString(num);
           return s;
        }
        
        public int getNum() {
           return num;
        }
        
        public void setNum(int n) {
           num = n;
        }
     
        //public static void main(String [] args) {
       //    Number yourNum = new Number(723);
        //   System.out.print(yourNum);
        //}
     }