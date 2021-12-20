interface iShape03 // 界面 iShape03
{
	public void show();

	public void area();
}

interface iColor // 界面 iColor
{
	public void showColor();
}

class CWin implements iShape03 // 類別實作界面，請自行設計
{
	protected int width;
	protected int height;
	protected String color;

	public CWin(int w, int h, String str) // 建構元
	{
		width = w;
		height = h;
		color = str;
	}

	public void show() // 方法 1
	{
		System.out.println("width=" + width);
		System.out.println("height=" + height);

	}

	public void area() // 方法 2
	{
		System.out.println("area=" + width * height);
	}

	public void showColor() // 方法 3
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
