import java.awt.Color;
import java.awt.Graphics;

public class ClassSail {

	private int _startPosX;
	private int _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private Color ColorSail;
	private Sailnum temp;
	public static boolean WLife;

	public ClassSail(Color colorwheel, boolean life, Sailnum t) {
		ColorSail = colorwheel;
		WLife = life;
		temp = t;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void DrawSail(Graphics g, int countSail) {
		if (WLife) {
			int y = 0;
			g.setColor(ColorSail);
			for (int i = 0; i < countSail; i++) {
				g.fillRect(_startPosX + 20, _startPosY + 10 + y, 80, 5);
				y += 10;
			}
		}
	}

	public void Draw(Graphics g) {
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