import java.awt.Color;
import java.awt.Graphics;

public class BoatBase extends AbstractBoat {
	private int catWidth = 100;
	private int catHeight = 60;
	private ISail sail;

	public BoatBase(int maxSpeed, Color mainColor, int weight, ISail sail) {
		MaxSpeed = maxSpeed;
		MainColor = mainColor;
		Weight = weight;
		this.sail = sail;
	}

	@Override
	public void MoveTransport(Cenum direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - catWidth - 50) {
				_startPosX += step;
			}
			break;
		case Left:
			if (_startPosX - step > -30) {
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

	public int getPosX() {
		return _startPosX;
	}

	public int getPosY() {
		return _startPosY;
	}

	public void DrawCatamaran(Graphics g) {

		sail.SetPosition(getPosX(), getPosY());
		g.setColor(Color.GRAY);
		g.fillRect(_startPosX, _startPosY + 5, 90, 35);
		g.setColor(Color.BLUE);
		g.fillRect(_startPosX, _startPosY, 90, 10);
		g.fillRect(_startPosX, _startPosY + 35, 90, 10);
		g.fillRect(_startPosX + 35, _startPosY, 10, 35);

		sail.Draw(g, Sailnum.sail3);
	}
}