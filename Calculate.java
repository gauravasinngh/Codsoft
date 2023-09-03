import java.util.Scanner;
class Calculate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter average of your marks(less than 100)::");
        float average= sc.nextFloat();
        char grade;
        if(average>=80){
            grade='A';
        }else if(average>=60 && average<80){
            grade='B';
        }
        else if(average>=40 && average<60){
            grade='c';

        }
else{
    grade='d';
}
switch(grade){
    case 'A':
    System.out.println("excellent");
    break;
    case 'B':
    case'c':
    System.out.println("well done");
    break;
    case'D' :
    System.out.println("you passed");
    break;
    case 'F':
    System.out.println("better try again");
    break;
    default:
    System.out.println("invalid grade");
}
System.out.println("your grade is"+grade);
    }
} 