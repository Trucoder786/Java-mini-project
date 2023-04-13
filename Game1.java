//  In the game computer take a random number and we guess

import java.util.*;

import javax.print.event.PrintEvent;
class Game1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*100);
        // System.out.println(random);
        int number = Integer.MAX_VALUE;
        int count = 0;
        do{
            System.out.print("Choose the Number: ");
            number = sc.nextInt();
            count++;
            if(number>random){
                System.out.println("Choose small Number");
            }else if(number<random){
                System.out.println("Choose Large Number");
            }else{
                System.out.println("==========================================================================");    
                System.out.println("*****-Congratulations you choose right Number in "+count+"th Attempt-***** ");
                System.out.println("==========================================================================");
            }
        }while(number != random);
        sc.close();
    }
}