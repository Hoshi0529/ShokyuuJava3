
public class RectIf extends MyFrame{
	public void run() {
		
		int x = 30;
        int y = 10;
        int z = 230;
		int w = z-x;
		int v = z-y;
		int i;
	
		for(i = 0; i<10; i++) {
		
			setColor(y,y,y);
		
			
			fillRect(x,80,10,300-y);
			fillRect(x,400-x,10,y);
			x +=20;
			y +=20;
			
		}
	}
}
