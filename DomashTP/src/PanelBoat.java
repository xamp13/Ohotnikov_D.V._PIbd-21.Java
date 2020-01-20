import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelBoat extends JPanel {
	private ClassCatamaran cat;
	private ClassSail sail;

	public PanelBoat(ClassCatamaran cat, ClassSail sail) {
		this.cat = cat;
		this.sail = sail;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		cat.DrawCatamaran(g);
		sail.Draw(g);
	}
}