import java.awt.Graphics;
import javax.swing.JPanel;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelBoat extends JPanel {
	private ITransport cat;
	private ISail sail;

	public PanelBoat(ITransport cat, ISail sail) {
		this.cat = cat;
		this.sail = sail;
	}

	void setBoat(ITransport cat) {
		this.cat = cat;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (cat != null) {
			cat.DrawCatamaran(g);
		}
	}
}
