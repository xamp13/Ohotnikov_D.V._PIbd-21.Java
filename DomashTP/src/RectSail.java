import java.awt.Color;
import java.awt.Graphics;

public class RectSail implements ISail {

	private int _startPosX;
	private int _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private Color ColorSail;

	public RectSail(Color colorsail) {
		ColorSail = colorsail;
	}

	public void SetPosition(int x, int y) {
		_startPosX = x;
		_startPosY = y;
	}

	public void DrawSail(Graphics g, int countSail) {
		int y = 0;
		g.setColor(ColorSail);
		for (int i = 0; i < countSail; i++) {
			g.fillArc(_startPosX + 20, _startPosY + 10 + y, 80, 5, 50, 90);
			y += 10;
		}
	}

	public void Draw(Graphics g, Sailnum temp) {
		int countSail = 0;
		switch (temp) {
		case sail1:
			countSail = 1;
			break;
		case sail2:
			countSail = 2;
			break;
		case sail3:
			countSail = 3;
			break;
		}
		DrawSail(g, countSail);
	}
}