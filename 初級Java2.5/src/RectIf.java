
public class RectIf extends MyFrame{
	public void run() {
		
		int x = 30;
        int y = 0;
		
		int i;
		for(i = 0; i<10; i++) {
			setColor(y,y,y);
			 
			fillRect(x,80,10,100);
			
			x +=20;
			y +=18;
		}
	}
}
