import java.time.LocalDateTime;
import javax.swing.JOptionPane;
//Gabe Lanz

public class TimedResponseLanz {

	public static void main(String[] args) {
		//Declare two LocalDateTime objects.
		
		
		LocalDateTime DT1 = LocalDateTime.now();
		//gets seconds
		int secs1 = DT1.getSecond();
		//gets minutes, useful for tracking if response happens after a minute change.
		int min1 = DT1.getMinute();
		//converts minutes into seconds, and adds that to seconds so we use the same time value for the whole program.
		secs1 = secs1 + (min1 * 60);
		
		//Prompts user for their response
		JOptionPane.showConfirmDialog(null, "Are you a closet Taylor Swift fan?");
		
		//gets seconds date time group
		LocalDateTime DT2 = LocalDateTime.now();
		//gets second value for seconds
		int secs2 = DT2.getSecond();
		//gets second value for minutes
		int min2 = DT2.getMinute();
		//converts minutes to seconds, and adds to the second "seconds" value to maintain same time value we are working with.
		secs2 = secs2 + (min2 * 60);
	
		//does the math to determine the difference in seconds that it took to make the decision
		int difference = secs2 - secs1;
		
		//outputs the result to the user.
		JOptionPane.showMessageDialog(null, "You took " + difference + " seconds to make your decision.");
		
		
		
		
	
				
		

	}

}
