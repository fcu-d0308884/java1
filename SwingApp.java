import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SwingApp {

	public static void main(String[] args) {
		MainPanel p = new MainPanel();

		p.setVisible(true);

	}

}

class MainPanel extends JFrame implements ActionListener {

	static int id = 0; // just for setting location
	private JButton Up = new JButton("UP");
	private JButton Down = new JButton("DOWN");
	JPanel Control = new JPanel();
	JPanel Contro2 = new JPanel();
	JPanel Contro3 = new JPanel();

	private JButton On = new JButton("On");
	private JButton Off = new JButton("Off");
	private JButton Ac = new JButton("Ac");
	private JButton Tv = new JButton("Tv");
	Label label_1 = new Label();

	TextField text1, text2;

	ButtonClient bc = new Ac();

	Button b = new Button(bc);

	ButtonClient tv = new Tv();

	Button t = new Button(tv);

	public MainPanel() {

		Up.addActionListener(this);
		Down.addActionListener(this);
		On.addActionListener(this);
		Off.addActionListener(this);
		Ac.addActionListener(this);
		Tv.addActionListener(this);

		text1 = new TextField(10);
		text2 = new TextField(10);
		this.setSize(200, 200);

		Up.setForeground(Color.WHITE);
		Up.setBackground(Color.GRAY);

		Down.setForeground(Color.WHITE);
		Down.setBackground(Color.GRAY);

		On.setForeground(Color.WHITE);
		On.setBackground(Color.RED);

		Off.setForeground(Color.WHITE);
		Off.setBackground(Color.RED);
		add(Contro2, BorderLayout.NORTH);
		Contro2.add(Tv);
		Contro2.add(Ac);

		Contro2.add(text1);
		Contro2.add(text2);
		//

		Control.setLayout(new GridLayout(0, 4));
		Control.add(Up);
		Control.add(Down);
		Control.add(On);
		Control.add(Off);

		add(Control, BorderLayout.SOUTH);

		this.setTitle("demo");
		this.setSize(200, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		pack();
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand() == "Tv") {

			text1.setText(" ");
			text1.setText("Tv mode");

		}

		if (arg0.getActionCommand() == "Ac") {

			text1.setText(" ");
			text1.setText("Ac mode");

		}

		if (arg0.getActionCommand() == "On" && text1.getText().equals("Tv mode")) {
			text1.setText(t.turnOn());

		}
		if (arg0.getActionCommand() == "Off" && text1.getText().equals("Tv is on")) {
			text1.setText(t.turnOff());
			text2.setText(" ");
		}
		if (arg0.getActionCommand() == "Off" && text1.getText().equals("Tv mode")) {
			text1.setText(t.turnOff());
			text2.setText(" ");

		}
		if (arg0.getActionCommand() == "UP" && text1.getText().equals("Tv is on")) {
			text2.setText(t.up());
		}

		if (arg0.getActionCommand() == "DOWN" && text1.getText().equals("Tv is on")) {
			text2.setText(t.down());
		}

		if (arg0.getActionCommand() == "On" && text1.getText().equals("Ac mode")) {
			text1.setText(b.turnOn());

		}
		if (arg0.getActionCommand() == "Off" && text1.getText().equals("AC is On")) {
			text1.setText(b.turnOff());
			text2.setText(" ");

		}
		if (arg0.getActionCommand() == "Off" && text1.getText().equals("Ac mode")) {
			text1.setText(b.turnOff());
			text2.setText(" ");

		}
		if (arg0.getActionCommand() == "UP" && text1.getText().equals("AC is On")) {
			text2.setText(b.up());
		}

		if (arg0.getActionCommand() == "DOWN" && text1.getText().equals("AC is On")) {
			text2.setText(b.down());
		}

	}

}