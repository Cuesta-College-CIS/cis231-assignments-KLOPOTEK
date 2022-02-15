import java.util.Random;
public class MaxNumber {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 100;
      int highestNum;
      int intRandom1= rand.nextInt(upperbound); 
      int intRandom2= rand.nextInt(upperbound); 
      int intRandom3= rand.nextInt(upperbound); 

      System.out.print("The three random numbers are "+intRandom1+" "+intRandom2+" "+intRandom3+"\n");

      if(intRandom1>intRandom2){
        highestNum=intRandom1;
          if(intRandom1>intRandom3){
            System.out.print("The highest number is "+highestNum);
          }else{
            highestNum=intRandom3;
            System.out.print("The highest number is "+highestNum);
            }
        }
        else if(intRandom2>intRandom3){
            highestNum=intRandom2;
            System.out.print("The highest number is "+highestNum);
        }else{
                highestNum=intRandom3;
                System.out.print("The highest number is "+highestNum);
            }
        }
    }