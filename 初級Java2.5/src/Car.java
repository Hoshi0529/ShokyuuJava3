
public class Car {
	int x,y,vx,vy;
	
	public Car(int x,int y,int vx,int vy) {
		
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
			
	}
	
public void draw(MyFrame frame) {
		
        frame.fillRect(43,170,45,16);
		frame.fillRect(31,185,72,15);
		frame.fillOval(35,200,20,20);
		frame.fillOval(75,200,20,20);
	}
	public void move () {
		
		x+=vx;
		y+=vy;
	}

}
