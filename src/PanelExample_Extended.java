import java.awt.Color;

import javax.swing.JPanel;

public class PanelExample_Extended {

	public JPanel createContentPane() {

		// We create a bottom JPanel to place everything on.
		JPanel totalGUI = new JPanel();

		// We set the layout manager to null so we can manuallly place the Panels
		totalGUI.setLayout(null);

		// Now we create a new panel, size it, shape it, and color it red
		// then add it to the bottom JPanel.
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setLocation(10, 10);
		redPanel.setSize(50, 50);
		totalGUI.add(redPanel);

		return null;
	}

}
