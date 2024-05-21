
public class RectIf extends MyFrame{
	public void run() {
		
		int x = 10;
        int y = 10;
     
		
		int i;
		int v;
		for(i = 0; i<10; i++) {
		
			setColor(0,128,0);
			y +=x;
			x +=10;
			
			
			fillRect(y,y,x,x);
			
			
		}
	}
}
