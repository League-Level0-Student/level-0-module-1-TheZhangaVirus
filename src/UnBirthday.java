import javax.swing.JOptionPane;

public class UnBirthday {

	public static void main(String[] args) {
		
		String birthday = JOptionPane.showInputDialog("when is your birthday? (dd/mm/yyyy)");
		
		if(birthday.equals("4/14/2019")) {
			
			JOptionPane.showMessageDialog(null, "Happy birthday");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Happy unbirthday");
			
		}
		
	}
	
}
