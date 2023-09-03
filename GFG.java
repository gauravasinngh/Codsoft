import java.util.Scanner;
public class GFG {
    


public static void guessingNumbergame(){
    Scanner sc=new Scanner(System.in);
    int number=1 + (int)(100 * Math.random());
    System.out.println("number");
    int k=5;
    int i,guess;
    System.out.println("a number is chosen"+"between 1 to 100"+"guess the number"+"within 5 trials");
    for(i=0;i<k;i++){
        System.out.println("guess the number");
        guess=sc.nextInt();
        if(number==guess){
            System.out.println("congratulation!"+"you guessed the number");
            break;
        }
        else if(number>guess){
System.out.println("the number is"+"greater than"+guess);
        }
        else if (number<guess){
            System.out.println("the number is"+"less than"+guess);
        }
    }
    if(i==k){
        System.out.println("you have exhausted"+"k trials");
        System.out.println("the number was"+number);
 
    }
}
public static void main(String args[]){
    guessingNumbergame();
}
}





