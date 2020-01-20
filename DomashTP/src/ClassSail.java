import java.awt.Color;
import java.awt.Graphics;

public class ClassSail implements ISail {

	static int _startPosX;
	static int _startPosY;
	private Color ColorSail;

	public ClassSail(Color colorsail) {
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
			g.fillRect(_startPosX + 20, _startPosY + 10 + y, 80, 5);
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