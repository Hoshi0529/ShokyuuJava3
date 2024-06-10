
public class DisplayCarsTrains  extends MyFrame{
	
	public void run() {
		Vehicle[] vehicles=new Vehicle[6];
		vehicles[0]=new Car(10,50,3,0);
		vehicles[1]=new Car(400,100,-7,-0);
		vehicles[2]=new Train(10,170,7,0);
		vehicles[3]=new Train(400,220,-7,-0);
		vehicles[4]=new Truck(10,270,4,0);
		vehicles[5]=new Truck(10,320,7,0);        
		for(int i=0; i<30; i++) {
			clear();
		
		for(int j=0; j<vehicles.length; j++) {
			
			vehicles[j].draw(this);
			vehicles[j].move();
		}
		sleep(0.1);
		}
	}
}
