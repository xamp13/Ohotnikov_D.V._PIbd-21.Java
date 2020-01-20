import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoatDesigner {
	private JFrame frame;
	private JButton btnNewButtonRight;
	private JButton btnNewButtonDown;
	private JButton btnNewButtonLeft;
	private JButton btnNewButtonUp;
	private JButton btnCreate;
	private JPanel panelMain;
	private ClassCatamaran cat = new ClassCatamaran(false, 10, 20, Color.blue, Color.black, true, true);
	private ClassSail sail = new ClassSail(Color.white, false, Sailnum.sail3);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoatDesigner window = new BoatDesigner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BoatDesigner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		panelMain = new PanelBoat(cat, sail);
		panelMain.setBounds(0, 0, 882, 603);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);

		btnCreate = new JButton("Cоздать");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassSail.WLife = true;
				ClassCatamaran.Life = true;
				cat.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				sail.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnCreate.setBounds(12, 13, 102, 33);
		panelMain.add(btnCreate);

		btnNewButtonRight = new JButton(">");
		btnNewButtonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cat.MoveTransport(Cenum.Right);
				sail.SetPosition(cat._startPosX, cat._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonRight.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonRight.setBounds(831, 551, 39, 39);
		panelMain.add(btnNewButtonRight);

		btnNewButtonDown = new JButton("v");
		btnNewButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat.MoveTransport(Cenum.Down);
				sail.SetPosition(cat._startPosX, cat._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonDown.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonDown.setBounds(780, 551, 39, 39);
		panelMain.add(btnNewButtonDown);

		btnNewButtonLeft = new JButton("<");
		btnNewButtonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat.MoveTransport(Cenum.Left);
				sail.SetPosition(cat._startPosX, cat._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonLeft.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonLeft.setBounds(729, 551, 39, 39);
		panelMain.add(btnNewButtonLeft);

		btnNewButtonUp = new JButton("^");
		btnNewButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat.MoveTransport(Cenum.Up);
				sail.SetPosition(cat._startPosX, cat._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonUp.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonUp.setBounds(780, 499, 39, 39);
		panelMain.add(btnNewButtonUp);
	}
}