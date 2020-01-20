import java.awt.Graphics;

public interface ITransport {
	void SetPosition(int x, int y, int width, int height);

	void MoveTransport(Cenum direction);

	void DrawCatamaran(Graphics g);

	int getPosX();

	int getPosY();
}