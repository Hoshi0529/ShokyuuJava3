
public class DisplayFaceAndTree  extends MyFrame{
	
	public void run() {
		Car Car1 = new Car(200,100,-10,-5);
		Car Car2 = new Car(100,200,-10,-5);
		
		for(int i=0;i<30;i++ ) {
			clear();
			Car1.draw(this);
			Car2.draw(this);
			Car1.move();
			Car2.move();
			
			sleep(0.1);
			
		}
	}

}
