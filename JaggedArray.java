import java.util.Scanner;

public class JaggedArray {

	public static void main(String []args) {
		
		gradeInput();
		
	}//end main
	
	static void gradeInput() {
		// create scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome To The Grading System\n");

		// prompt user
		System.out.println("How many students?");
		// student represents rows
		int student = scan.nextInt();
		// exams represents columns
		int exams = 0;

		// declare 2d array and use variables in the initialization
		int[][] array = new int[student][exams];

		for (int i = 0; i < student; i++) {
			System.out.println();
			System.out.println("Student " + (i + 1));
			System.out.println("How many exams for student? ");
			exams = scan.nextInt();
			array[i] = new int[exams];
			for (int j = 0; j < exams; j++) {
				System.out.println("Grade Input " + j + ": ");
				array[i][j] = scan.nextInt();
				System.out.print(array[i][j] + " ");
			} // inner loop
			
		} // outer loop
		
		//pass grades to menuSystem
		menuSystem(array);

		// pass the array to method
		//studentGrades(array);
		
		//getGrade(array);
		
	}//end gradeInput
	
	//output the student grade to user
	static void studentGrades(int[][] array) {
		
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			System.out.println("Student " + (i + 1));
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Grades: " +array[i][j] + " ");
			}//end inner
			System.out.println();
		}//end outer
	}//end studentGrades
	
	static void getGrade(int[][] array) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter student you want: ");
		int student = scan.nextInt();
		student -= 1;//offset user input
		
		System.out.println("Enter exam you wish to see");
		int exam = scan.nextInt();		
		exam -= 1; //offset user input
		int getGrade = array[student][exam];
		
		System.out.println();
		System.out.println(getGrade); 
		
		menuSystem(array);//<-----------TEST HERE--------------------------->
	}//end getGrade
	
	static void getAvg(int[][] array) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < array.length; i++) {
//			System.out.println();
//			System.out.println("Enter student: ");
//			int student = scan.nextInt();
//			set i to the student that the users is looking for
//			i = scan.nextInt();
        
            for(int j = 0; j < array[i].length; j++) {
            
                sum += array[i][j];
                
                avg = sum / array[i].length;
            }
            System.out.println("Student " + i + " sum = " + sum + " Average = " + avg);
            sum = 0;
        }
        
        //Call switch method here
		
		
    }//end getAvg
	
	static void columnAverage(int array[][]) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int user = 0;
		double avg = 0.0;
		
		
		
		for(int i=0; i<array.length;i++) {
			if(i == 0) {
				System.out.println("Enter exam: ");
				user = scan.nextInt();
				user -= 1;//offset user
			}
			for(int j=0;j<array[i].length; j++) {
				j = user;
				
				sum += array[i][j];
				
				avg = sum / array.length;
				 j=array[i].length;
			}
			
		}//outer
		
		System.out.println("The Average of exams are: " +avg);
		menuSystem(array);
	}//end ColumnAverage
	
	static void classAverage(int[][] array) {
		System.out.println();
		
		System.out.println("Your class Average is:");
		
		int sum = 0;
		
		for(int[] i:array) {
			for(int j: i) {
				sum +=j;
			}//inner
		}//outer
		double avg = sum / array.length;
		
		System.out.println(avg);
		menuSystem(array);
	}//end classAverage
	
	static void menuSystem(int[][] array) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean stop = false;
		int end = -1;
		
		System.out.println();
		
		System.out.println("Menu Options:\n" 
				 + "1. View Student Grades\n" 
				 + "2. Get a Student Grade\n"
				 + "3. Exams Average\n"
				 + "4. Class Average\n"
				 + "5. QUIT\n"
				
				);//end display
		
		int user = scan.nextInt();
		
		do {
			
			switch(user) {
			case 1: System.out.println("View Student Grades");
					studentGrades(array);
					repeat(array);
				break;
			case 2: System.out.println("Get a Student Grade");
			        getGrade(array);
				break;
			case 3: System.out.println("Exams Average");
			        columnAverage(array);
				break;
			case 4: System.out.println("Class Average");
					classAverage(array);
				break;
			case 5:
				stop = false;
				
				break;
			default:
				repeat(array);
			}//end switch
			
		}while(!stop);
	}//end menuSystem
	
	static void repeat(int[][] array) {
		menuSystem(array);
	}
	
}//end class
