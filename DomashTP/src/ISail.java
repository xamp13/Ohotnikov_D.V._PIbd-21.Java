import java.awt.Graphics;

public interface ISail {
	public void SetPosition(int x, int y);

	public void DrawSail(Graphics g, int countSail);

	public void Draw(Graphics g, Sailnum temp);
}
