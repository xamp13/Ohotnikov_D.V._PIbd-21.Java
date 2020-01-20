import java.awt.Color;
import java.awt.Graphics;

public class ClassCatamaran {

	static boolean Life;
	static int _startPosX;
	static int _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private int catWidth = 100;
	private int catHeight = 60;
	public int MaxSpeed;
	public float Weight;
	public Color MainColor;
	public Color DopColor;
	public boolean Strip;
	public boolean Motor;

	public ClassCatamaran(boolean life, int maxspeed, int weight, Color maincolor, Color dopcolor, boolean strip,
			boolean motor) {
		Life = life;
		MaxSpeed = maxspeed;
		Weight = weight;
		MainColor = maincolor;
		DopColor = dopcolor;
		Strip = strip;
		Motor = motor;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Cenum direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - catWidth - 20) {
				_startPosX += step;
			}
			break;
		case Left:
			if (_startPosX - step > -5) {
				_startPosX -= step;
			}
			break;
		case Up:
			if (_startPosY - step > 0) {
				_startPosY -= step;
			}
			break;
		case Down:
			if (_startPosY + step < _pictureHeight - catHeight - 60) {
				_startPosY += step;
			}
			break;
		}
	}

	public void DrawCatamaran(Graphics g) {
		if (Life) {
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

			g.setColor(Color.BLUE);
			g.fillRect(_startPosX, _startPosY, 90, 10);
			g.fillRect(_startPosX, _startPosY + 35, 90, 10);
			g.fillRect(_startPosX + 35, _startPosY, 10, 35);
		}
	}
}