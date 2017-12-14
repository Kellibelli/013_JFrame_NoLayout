import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class RunHere {

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		//creating and showing this applications's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
	}

	private static void createAndShowGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("There are 3 JPanels in here!");
		
		//Create and set up the content pane.
		PanelExample_Extended demo = new PanelExample_Extended();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(585, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JOptionPane.showMessageDialog(frame, "Hello!");
		
	}
	/*
	 *1. All class code is working properly
	 *2. Add one more panel to the bottom (3 panels total)
	 *3. On the outer bottom panel, add "Left" Label and "Right" Label
	 *4. Add a "Push Me" Button on center Panel
	 * 
	 */
	
	
}
