
public class Car {
	int x,y,vx,vy;
	
	public Car(int x,int y,int vx,int vy) {
		
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
			
	}
	
	public void draw(MyFrame frame) {
		
        frame.fillRect(x+13,y,45,16);
		frame.fillRect(x+1,y+15,72,15);
		frame.fillOval(x+5,y+30,20,20);
		frame.fillOval(x+45,y+30,20,20);
	}
	public void move () {
		
		x+=vx;
		y+=vy;
	}

}
