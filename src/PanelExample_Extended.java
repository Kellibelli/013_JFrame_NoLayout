import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		redPanel.setLayout(null);
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(10, 30);
		redPanel.setSize(100, 100);
		totalGUI.add(redPanel);
		
		
		JButton stopButton = new JButton("Stop");
		stopButton.setBounds(15,40,70,20);
		redPanel.add(stopButton);
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(460, 30);
		bluePanel.setSize(100, 100);
		totalGUI.add(bluePanel);
		
		
		JButton startButton = new JButton("Start");
		startButton.setBounds(15, 40, 70, 20);
		bluePanel.add(startButton);
		
		
		JPanel greenPanel = new JPanel();
		greenPanel.setLayout(null);
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(160, 30);
		greenPanel.setSize(250, 100);
		totalGUI.add(greenPanel);
		
		JButton pushButton = new JButton("Push Me");
		pushButton.setBackground(Color.white);
		pushButton.setBounds(65, 35, 120, 30);
		greenPanel.add(pushButton);
		
		
		JPanel orangePanel = new JPanel();
		orangePanel.setLayout(null);
		orangePanel.setBackground(Color.orange);
		orangePanel.setLocation(10, 145);
		orangePanel.setSize(555, 100);
		totalGUI.add(orangePanel);
		
		JLabel leftLabel = new JLabel("Left");
		leftLabel.setLocation(0, 28);
		leftLabel.setSize(50, 40);
		leftLabel.setHorizontalAlignment(0);
		orangePanel.add(leftLabel);
		
		JLabel rightLabel = new JLabel("Right");
		rightLabel.setLocation(500, 28);
		rightLabel.setSize(50, 40);
		rightLabel.setHorizontalAlignment(0);
		orangePanel.add(rightLabel);
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setLayout(null);
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setLocation(50, 10);
		pinkPanel.setSize(450, 80);
		orangePanel.add(pinkPanel);
		
		JPanel whitePanel = new JPanel();
		whitePanel.setLayout(null);
		whitePanel.setBackground(Color.white);
		whitePanel.setLocation(25,8);
		whitePanel.setSize(400, 65);
		pinkPanel.add(whitePanel);
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setLocation(0, 0);
		redLabel.setSize(50, 40);
		redLabel.setHorizontalAlignment(0);
		redPanel.add(redLabel);
		
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setLocation(0, 0);
		greenLabel.setSize(50, 40);
		greenLabel.setHorizontalAlignment(0);
		greenPanel.add(greenLabel);
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setLocation(0, 0);
		blueLabel.setSize(50, 40);
		blueLabel.setHorizontalAlignment(0);
		bluePanel.add(blueLabel);
		
		
		
		//Finally we return the JPanel.
		totalGUI.setOpaque(true);
		totalGUI.setBackground(Color.YELLOW);
		return totalGUI;
	}

}
