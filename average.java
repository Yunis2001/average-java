import java.util.Scanner;

public class Average{
 public static void main(String[] args)
{
double math, biology, chemistry, english, swahili, total,average;
 Scanner eunice= new Scanner(System.in); 

 System.out.println("Enter math marks:");
  math = eunice.nextInt();

 System.out.println("Enter biology marks:");
  biology = eunice.nextInt();

 System.out.println("Enter chemistry marks:");
  chemistry = eunice.nextInt();

 System.out.println("Enter english marks:");
  english = eunice.nextInt();

 System.out.println("Enter swahili marks:");
  swahili = eunice.nextInt();


 if(math>100 || biology>100 || chemistry>100 || english>100 || swahili>100){
 	System.out.println("Marks not entered correctly:");
 }
else{
 	total= math + biology + chemistry + english + swahili;
 	System.out.println("The total is:"+ total);

 	average= total/5;
 	System.out.println("The average is:"+ average);

 if(average>=70){
 	System.out.println("Congratulations for your A grade.");
 }
 else if(average>=60 && average<=69){
 	System.out.println("Congratulations for your B grade.");
 }
// else if(average>=50 && average<=59){
// 	System.out.println("Congratulations for your C grade.");
// }
// else if(average>=40 && average<=49){
// 	System.out.println("You have a D grade.");
// }
// else{
// 	System.out.println("You have an E grade: Study hard.");
// }
// }



}
}