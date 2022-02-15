import java.util.Random;
public class OrderdNumbers {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 100;
      int highestNum;
      int middleNum;
      int lowestNum;
      int intRandom1= rand.nextInt(upperbound); 
      int intRandom2= rand.nextInt(upperbound); 
      int intRandom3= rand.nextInt(upperbound); 

      System.out.print("The three random numbers are "+intRandom1+" "+intRandom2+" "+intRandom3+"\n");

      if(intRandom1>intRandom2){
          if(intRandom1>intRandom3){
            highestNum=intRandom1;
            if(intRandom2>intRandom3){
                middleNum=intRandom2;
                lowestNum=intRandom3;
                System.out.print("Sorted Order "+highestNum+" "+middleNum+" "+lowestNum+"\n");
            }else{
                middleNum=intRandom3;
                lowestNum=intRandom2;    
                System.out.print("Sorted Order "+highestNum+" "+middleNum+" "+lowestNum+"\n");
            }
        }
        else if(intRandom2>intRandom3){
             highestNum=intRandom2;
             if(intRandom3>intRandom1){
                middleNum=intRandom3;
                lowestNum=intRandom1; 
                System.out.print("Sorted Order "+highestNum+" "+middleNum+" "+lowestNum+"\n");
             }else{
                middleNum=intRandom1;
                lowestNum=intRandom3; 
                System.out.print("Sorted Order "+highestNum+" "+middleNum+" "+lowestNum+"\n");
                }
            }
        }
    }
}

