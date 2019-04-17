import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		
		String name1 = JOptionPane.showInputDialog("What is your name");
		String name2 = JOptionPane.showInputDialog("What is your name");
		String name3 = JOptionPane.showInputDialog("What is your name");
		String name4 = JOptionPane.showInputDialog("What is your name");
		
		for(int i = 0; i < 4; i++) {
		
		String name = JOptionPane.showInputDialog("type your name");
		
		if(name.equalsIgnoreCase(name1)) {
			
			JOptionPane.showMessageDialog(null, name + " is the coolest kid in school");
			
		} else {
			
		}
		
		if(name.equalsIgnoreCase(name2)) {
			
			JOptionPane.showMessageDialog(null, name + " a nerd");
			
		} else {
			
		}
		
		if(name.equalsIgnoreCase(name3)) {
			
			JOptionPane.showMessageDialog(null, name + " is a loser");
			
		} else {
			
		}
	
		if(name.equalsIgnoreCase(name4)) {
			
			JOptionPane.showMessageDialog(null, name + " has 2 brain cells");
			
		} else {
			
		}
		
		}
		
	}
	
}
