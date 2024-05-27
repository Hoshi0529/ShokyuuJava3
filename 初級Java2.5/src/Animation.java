
public class Animation extends MyFrame{
	 public void run() {
		 
		  int y = 50;
		  int x =30;
		  int nextY = 0;
		  while(true){
			 while(x<=170) {
				 clear();
				 y = 50;
				 setColor(0,128,0);
				 fillRect(x,y,10,100);
				 x+=5;
				 sleep(0.1); 
				
			 }
			
			 nextY=y+50;
			 while(y<=nextY) {
			
				 clear();
				 
				 setColor(0,128,0);
				 fillRect(x,y,10,100);
				 y+=5;
				 sleep(0.1);
			  
			 }
			 
			 
			 while(x>=30) {
			
				 clear();
				 setColor(0,128,0);
				 fillRect(x,y,10,100);
				 x-=5;
				 sleep(0.1);
				
			 }
			 nextY=y+50;
			 while(y<=nextY) {
				 clear();
				 
				 setColor(0,128,0);
				 fillRect(x,y,10,100);
				 y+=5;
				 sleep(0.1);
				 
				   
			 }
			 
		  }
	 }		
}