import java.util.ArrayList;
import java.util.Scanner;

//program to tell if the professor will cancel the class or no . the input fomat is 
//first line : no of lectures 
//second line ( two integers) seperated by space  1st is no. of students
//2nd is threshold(negetive/0 value tells no of students on time
//this line is an array of int seperated by space , below is a sample input 
/*//2 - no of lectures 
4 3 (4 - no of students , 3 - threshold  3 students must be on time)
-1 -3 4 2 (-ve value showing students on time , +ve showing late students)result class  cancelled (YES)
4 2 (4 - no of students , 2 - threshold  2 students must be on time)
0 -1 2 1 (-ve value showing students on time , +ve showing late students) result class not canceled (NO)
*/
public class UnitTest {

	
	
	public static String classValidity(int threshold , int attendance[]){
		
		String yes = "YES";
		String no = "NO";
		int punctual = 0;
		//int notPunctual = 0;
		
		
		for(int i = 0 ; i<attendance.length ; i++){
			
			if(attendance[i]<=0){
				punctual = punctual +1;
				
				//return yes;
				
			}
			else{
				//notPunctual = notPunctual+1;
				continue;
				
			}
		}
		if(punctual>=(threshold)){
			return no;
		}
		else{
			return yes;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int noOfLectures = sc.nextInt();
		int students = 0;
		int threshold = 0;
		
		String[] validity = new String[noOfLectures];
		//int classInfo[] = new int[2];
		for(int i = 0 ;i<noOfLectures;i++){
			students = sc.nextInt();
			threshold = sc.nextInt();
			int attendance[] = new int[students];
			for(int j = 0 ; j<students ; j++){
				attendance[j] = sc.nextInt();
				
			}
			validity[i] = classValidity(threshold, attendance);
			System.out.println();
		}
		
		for(int i = 0 ; i<noOfLectures ; i++){
			System.out.println(validity[i]);
			
		}
		
	
	}

}
