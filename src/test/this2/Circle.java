package test.this2;

public class Circle {
	private int r;
	private double circum, area;
	
	
	
	public int getR() {
		return r;
	}



	public double getCircum() {
		return circum;
	}



	public double getArea() {
		return area;
	}


	public Circle(int r) {
		this.r = r;
	}
	
	//�������� r�� ���� �ѷ��� ����ϴ� �޼ҵ�
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	//�������� r�� ���� ���� ����ϴ� �޼ҵ�
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}
	
	public void showInfo() {
		calcCircum();
		calcArea();
		RunCircle.print(this);
	}
}