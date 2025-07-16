
public class Gradechecker {

	public static void main(String[] args) {
		
		
          
              
                  // All The students answers
                 	char[][] answers = {
                    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                   {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
           
                 // Keys to the questions
               char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; 
           
                 //Check all answers by grading the rows
                 for (int i = 0; i < answers.length; i++) {
                	 
                   // Variable of each student when starting
                   int Score = 0; 
                   
                   /*Check all answers by grading the columns
                    *  basically grading each student simultaneously for each question.  */ 
                   for (int j = 0; j < answers[i].length; j++) {
                	   if (answers[i][j] == keys[j])
                       Score++;
                   }
           //Checking the score of Each student (i) for the their grade (score)
                   System.out.println("Student " + i + " score is " +
           	      Score*10 + "%" );
                 }
               }
}


	


