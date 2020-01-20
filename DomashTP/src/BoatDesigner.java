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
	private JButton btnNewButtonUp;;
	private JButton btnCreateBoat;
	private PanelBoat panelMain;
	private ITransport cat;
	private ISail sail;
	private JButton btnCreateCatamaran;

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

		btnCreateBoat = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u043B\u043E\u0434\u043A\u0443");
		btnCreateBoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat = new BoatBase(10, Color.blue, 20, sail = new OvalSail(Color.BLACK));
				panelMain.setBoat(cat);
				cat.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnCreateBoat.setBounds(10, 13, 153, 33);
		panelMain.add(btnCreateBoat);

		btnNewButtonRight = new JButton(">");
		btnNewButtonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cat != null && sail != cat) {
					cat.MoveTransport(Cenum.Right);
					sail.SetPosition(cat.getPosX(), cat.getPosY());
					panelMain.repaint();
				}
			}
		});

		btnCreateCatamaran = new JButton(
				"\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u043A\u0430\u0442\u0430\u043C\u0430\u0440\u0430\u043D");
		btnCreateCatamaran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat = new Catamaran(10, Color.blue, 20, sail = new RectSail(Color.WHITE), Color.black, true, true);
				panelMain.setBoat(cat);
				cat.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnCreateCatamaran.setBounds(173, 13, 147, 33);
		panelMain.add(btnCreateCatamaran);
		btnNewButtonRight.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonRight.setBounds(831, 551, 39, 39);
		panelMain.add(btnNewButtonRight);

		btnNewButtonDown = new JButton("v");
		btnNewButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cat != null && sail != cat) {
					cat.MoveTransport(Cenum.Down);
					sail.SetPosition(cat.getPosX(), cat.getPosY());
					panelMain.repaint();
				}
			}
		});
		btnNewButtonDown.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonDown.setBounds(780, 551, 39, 39);
		panelMain.add(btnNewButtonDown);

		btnNewButtonLeft = new JButton("<");
		btnNewButtonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cat != null && sail != cat) {
					cat.MoveTransport(Cenum.Left);
					sail.SetPosition(cat.getPosX(), cat.getPosY());
					panelMain.repaint();
				}
			}
		});
		btnNewButtonLeft.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonLeft.setBounds(729, 551, 39, 39);
		panelMain.add(btnNewButtonLeft);

		btnNewButtonUp = new JButton("^");
		btnNewButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cat != null && sail != cat) {
					cat.MoveTransport(Cenum.Up);
					sail.SetPosition(cat.getPosX(), cat.getPosY());
					panelMain.repaint();
				}
			}
		});
		btnNewButtonUp.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonUp.setBounds(780, 499, 39, 39);
		panelMain.add(btnNewButtonUp);
	}
}