import java.awt.Color;
import java.awt.Graphics;

public class Catamaran extends BoatBase {
	public Color DopColor;
	public boolean Strip;
	public boolean Motor;

	public Catamaran(int maxSpeed, Color mainColor, int weight, ISail sail, Color dopcolor, boolean strip,
			boolean motor) {
		super(maxSpeed, mainColor, weight, sail);
		DopColor = dopcolor;
		Strip = strip;
		Motor = motor;
	}

	@Override
	public void DrawCatamaran(Graphics g) {
		super.DrawCatamaran(g);
		g.setColor(MainColor);
		if (Strip) {
			g.setColor(DopColor);
			g.fillRect(_startPosX + 50, _startPosY + 10, 3, 25);
			g.fillRect(_startPosX + 60, _startPosY + 10, 3, 25);
		}
		if (Motor) {
			g.setColor(Color.BLACK);
			g.fillRect(_startPosX + 5, _startPosY - 5, 80, 7);
			g.fillRect(_startPosX + 5, _startPosY + 43, 80, 7);
			g.fillRect(_startPosX + 15, _startPosY - 5, 3, 45);
			g.fillRect(_startPosX - 5, _startPosY + 15, 20, 15);
		}
	}

}