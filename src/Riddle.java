import javax.swing.JOptionPane;

public class Riddle {
	
	public static void main(String[] args) {
		
		int score = 0;
		
		JOptionPane.showMessageDialog(null, "riddle 1");
		String answer1 = JOptionPane.showInputDialog("Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		
		if(answer1.equalsIgnoreCase("a coffin")) {
			
			JOptionPane.showMessageDialog(null, "correct");
			score++;
			
		} else {
			
			JOptionPane.showMessageDialog(null, "wrong");
			score--;
			
		}
			
		JOptionPane.showMessageDialog(null, "riddle 2");
		String answer2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		
		if(answer2.equalsIgnoreCase("a stamp")) {
			
			JOptionPane.showMessageDialog(null, "correct");
			score++;
			
		} else {
			
			JOptionPane.showMessageDialog(null, "wrong");
			score--;
			
		}
		
	}

}
