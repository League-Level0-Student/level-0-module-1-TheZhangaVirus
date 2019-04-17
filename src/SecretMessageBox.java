import javax.swing.JOptionPane;

public class SecretMessageBox {
	
	public static void main(String[] args) {
		
		String password = JOptionPane.showInputDialog("Type in a password");
		String sentence = JOptionPane.showInputDialog("Type in a sentence");
		
		String answer = JOptionPane.showInputDialog("What is the password");
		
		if(answer.equals(password)) {
			
			JOptionPane.showMessageDialog(null, "here is the sentence: " + sentence);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "INTRUDER");
			
		}
		
	}

}
