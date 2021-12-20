interface iShape03 // �ɭ� iShape03
{
	public void show();

	public void area();
}

interface iColor // �ɭ� iColor
{
	public void showColor();
}

class CWin implements iShape03 // ���O��@�ɭ��A�Цۦ�]�p
{
	protected int width;
	protected int height;
	protected String color;

	public CWin(int w, int h, String str) // �غc��
	{
		width = w;
		height = h;
		color = str;
	}

	public void show() // ��k 1
	{
		System.out.println("width=" + width);
		System.out.println("height=" + height);

	}

	public void area() // ��k 2
	{
		System.out.println("area=" + width * height);
	}

	public void showColor() // ��k 3
	{
		System.out.println("color=" + color);
	}

}

public class java {
	public static void main(String args[]) {
		CWin win = new CWin(5, 7, "Green");
		win.showColor();
		win.show();
		win.area();
	}
}
